package org.example.java.FactoryMethod;

import org.example.java.FactoryMethod.IProducto;

public class Mouse implements IProducto {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String tipo;

    public Mouse(int idProducto, String marca, String modelo, int precio, String tipo) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public Integer getIdProducto() {
        return idProducto;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}