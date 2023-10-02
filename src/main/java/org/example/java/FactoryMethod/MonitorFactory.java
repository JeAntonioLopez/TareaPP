package org.example.java.FactoryMethod;

public class MonitorFactory implements ProductoFactory {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String resolucion;

    public MonitorFactory(int idProducto, String marca, String modelo, int precio, String resolucion) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.resolucion = resolucion;
    }

    @Override
    public IProducto createProducto() {
        return new Monitor(idProducto, marca, modelo, precio, resolucion);
    }
}