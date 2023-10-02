package org.example.java;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:sqlite:/home/felipe/base_datos_prueba.db");


            Statement statement = connection.createStatement();


            String insertQuery1 = "INSERT INTO usuarios (nombre, edad) VALUES ('Ejemplo1', 25)";
            String insertQuery2 = "INSERT INTO usuarios (nombre, edad) VALUES ('jeanlopez', 30)";
            statement.executeUpdate(insertQuery1);
            statement.executeUpdate(insertQuery2);

            System.out.println("Sample data inserted into the 'usuarios' table.");


            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");


                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
