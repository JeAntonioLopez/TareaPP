package org.example.java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager.getInstance();
        CompraManager compraManager = new CompraManager(databaseManager);
        AdminMenu adminMenu = new AdminMenu(compraManager);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú Principal ====");
            System.out.println("1. Operaciones de Compra");
            System.out.println("2. Crear Clases e Insertar Datos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    adminMenu.mostrarMenu();
                    break;
                case 2:
                    CrearClasesMenu crearClasesMenu = new CrearClasesMenu(databaseManager);
                    crearClasesMenu.mostrarMenu();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);


        databaseManager.closeConnection();
    }
}
