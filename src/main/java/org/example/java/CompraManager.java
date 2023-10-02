package org.example.java;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraManager {
    private DatabaseManager databaseManager;

    public CompraManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Cliente clienteConMasCompras() {
        String query = "SELECT RUT_Cliente, Nombre, COUNT(*) AS TotalCompras FROM Compras " +
                "JOIN Clientes ON Compras.RUT_Cliente = Clientes.RUT " +
                "GROUP BY RUT_Cliente, Nombre ORDER BY TotalCompras DESC LIMIT 1";
        ResultSet resultSet = databaseManager.executeQuery(query);
        try {
            if (resultSet.next()) {
                String rut = resultSet.getString("RUT_Cliente");
                String nombre = resultSet.getString("Nombre");
                return new Cliente.ClienteBuilder(rut, nombre).build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    public IProducto productoMasVendido() {
        String query = "SELECT ID_Producto, COUNT(*) AS TotalVentas FROM Compras GROUP BY ID_Producto ORDER BY TotalVentas DESC LIMIT 1";
        ResultSet resultSet = databaseManager.executeQuery(query);
        try {
            if (resultSet.next()) {
                int idProducto = resultSet.getInt("ID_Producto");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public IProducto productoMenosVendido() {
        String query = "SELECT ID_Producto, COUNT(*) AS TotalVentas FROM Compras GROUP BY ID_Producto ORDER BY TotalVentas ASC LIMIT 1";
        ResultSet resultSet = databaseManager.executeQuery(query);
        try {
            if (resultSet.next()) {
                int idProducto = resultSet.getInt("ID_Producto");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Cliente clienteQueHaGastadoMas() {
        String query = "SELECT c.RUT_Cliente, c.Nombre, SUM(p.Precio_Unitario * c.Cantidad) AS TotalGastado " +
                "FROM Compras c " +
                "JOIN Productos p ON c.ID_Producto = p.ID_Producto " +
                "JOIN Clientes cl ON c.RUT_Cliente = cl.RUT " +
                "GROUP BY c.RUT_Cliente, c.Nombre ORDER BY TotalGastado DESC LIMIT 1";
        ResultSet resultSet = databaseManager.executeQuery(query);
        try {
            if (resultSet.next()) {
                String rut = resultSet.getString("RUT_Cliente");
                String nombre = resultSet.getString("Nombre");
                return new Cliente.ClienteBuilder(rut, nombre).build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
