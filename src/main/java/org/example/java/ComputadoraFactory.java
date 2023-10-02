package org.example.java;

public class ComputadoraFactory implements ProductoFactory {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String cpu;
    private String ram;
    private String hdd;

    public ComputadoraFactory(int idProducto, String marca, String modelo, int precio, String cpu, String ram, String hdd) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public IProducto createProducto() {
        return new Computadora(idProducto, marca, modelo, precio, cpu, ram, hdd);
    }
}