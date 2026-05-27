package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    public AuthModel() {

    }

    // LOGIN
    public boolean login(String username, String password) {

        String query =
        "SELECT * FROM usuarios " +
        "WHERE username = ? AND password = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");

            PreparedStatement ps =
            conn.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean exists = rs.next();

            rs.close();
            ps.close();
            conn.close();

            return exists;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    // REGISTER
    public boolean register(String username,
                            String password,
                            String nombreCompleto) {

        String query =
        "INSERT INTO usuarios " +
        "(username, password, nombre_completo) " +
        "VALUES (?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Rald1pvk",
				    "u_L6vTpk",
				    "7j0Pia4oMbiR");
            PreparedStatement ps =
            conn.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, nombreCompleto);

            int result = ps.executeUpdate();

            ps.close();
            conn.close();

            return result > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
}