package org.example.java;

public class MouseFactory implements ProductoFactory {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String tipo;

    public MouseFactory(int idProducto, String marca, String modelo, int precio, String tipo) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public IProducto createProducto() {
        return new Mouse(idProducto, marca, modelo, precio, tipo);
    }
}