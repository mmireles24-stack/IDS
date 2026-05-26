package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String phone;

    public User() {

    }

    public User(int id, String name, String email,
                String password, String lastname,
                String phone) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.phone = phone;
    }

    // OBTENER USUARIOS
    public ArrayList<User> get() {

        ArrayList<User> users = new ArrayList<>();

        String query = "SELECT * FROM usuarios";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/application_db",
                    "root",
                    ""
            );

            PreparedStatement ps =
                    conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                User tmp = new User();

                tmp.setName(rs.getString("nombre_completo"));
                tmp.setEmail(rs.getString("username"));
                tmp.setPhone("Sin teléfono");

                users.add(tmp);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    // CREAR USUARIO
    public boolean make(String email,
            String password,
            String name) {

String query =
"INSERT INTO usuarios (username,password,nombre_completo) VALUES (?,?,?)";

try {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection conn = DriverManager.getConnection(
        "jdbc:mysql://127.0.0.1:3306/application_db",
        "root",
        ""
);

PreparedStatement ps =
        conn.prepareStatement(query);

ps.setString(1, email);
ps.setString(2, password);
ps.setString(3, name);

int rowsAffected = ps.executeUpdate();

ps.close();
conn.close();

return rowsAffected > 0;

} catch (Exception e) {

e.printStackTrace();
}

return false;
}

    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}