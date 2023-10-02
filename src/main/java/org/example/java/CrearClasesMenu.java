package org.example.java;

import java.util.Scanner;

public class CrearClasesMenu {
    private DatabaseManager databaseManager;

    public CrearClasesMenu(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú para Crear Clases e Insertar Datos ====");
            System.out.println("1. Crear y insertar cliente");
            System.out.println("2. Crear y insertar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Cliente creado e insertado en la base de datos.");
                    break;
                case 2:

                    System.out.println("Producto creado e insertado en la base de datos.");
                    break;
                case 0:
                    System.out.println("Saliendo del menú para crear clases e insertar datos...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
