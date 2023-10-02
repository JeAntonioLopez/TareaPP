package org.example.java;

import java.util.Scanner;

public class AdminMenu {
    private CompraManager compraManager;

    public AdminMenu(CompraManager compraManager) {
        this.compraManager = compraManager;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú del Administrador ====");
            System.out.println("1. Mostrar cliente con más compras");
            System.out.println("2. Mostrar producto más vendido");
            System.out.println("3. Mostrar producto menos vendido");
            System.out.println("4. Mostrar cliente que ha gastado más");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Cliente clienteConMasCompras = compraManager.clienteConMasCompras();
                    if (clienteConMasCompras != null) {
                        System.out.println("Cliente con más compras:");
                        System.out.println("RUT: " + clienteConMasCompras.getRUT());
                        System.out.println("Nombre: " + clienteConMasCompras.getNombre());

                    } else {
                        System.out.println("No hay clientes con compras.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menú del administrador...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
