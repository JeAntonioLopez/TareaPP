package org.example.java;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager.getInstance();

        String insertQuery1 = "INSERT INTO usuarios (nombre, edad) VALUES ('Ejemplo1', 25)";
        String insertQuery2 = "INSERT INTO usuarios (nombre, edad) VALUES ('jeanlopez', 30)";
        databaseManager.insertData(insertQuery1);
        databaseManager.insertData(insertQuery2);

        System.out.println("Sample data inserted into the 'usuarios' table.");

        ResultSet resultSet = databaseManager.executeQuery("SELECT * FROM usuarios");

        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");

                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeConnection();
        }
    }
}
