package main.java;

import java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleMySQLConnetion {
    public static void connect() throws SQLException{

        //hacer una URL de conexión a la BDD
        //crear 3 variables para la conexión

//        String url = "jdbc:mysql://localhost:3306/Odontologia";
//
//        String user = "root";
//
//        String password = "12345";
//
//        //cargar el drive Mysql y establecer conexion
//
//        Connection connection = DriverManager.getConnection(url,user,password);
//
//        System.out.println("Conexión exitosa");
//
//        connection.close();

//        class DatabaseConnection {
//            private static final String URL = "jdbc:mysql://localhost:3306/Odontologia";
//            private static final String USER = "root";
//            private static final String PASSWORD = "1234";
//
//            private static Connection connection;
//
//            public static Connection getConnection() throws SQLException {
//                if (connection == null || connection.isClosed()) {
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//                        connection = DriverManager.getConnection(URL, USER, PASSWORD);
//                    } catch (ClassNotFoundException | SQLException e) {
//                        e.printStackTrace();
//                        throw new SQLException("Error al conectar a la base de datos", e);
//                    }
//                }
//                return connection;
//            }
//        }







    }

}
