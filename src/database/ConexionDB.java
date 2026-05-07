package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL =
            "jdbc:mysql://localhost:3306/application_db";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection getConnection() {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error de conexión");
            e.printStackTrace();
        }

        return conn;
    }
}