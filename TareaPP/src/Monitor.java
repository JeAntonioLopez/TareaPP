public class Monitor implements IProducto {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String resolucion;

    public Monitor(int idProducto, String marca, String modelo, int precio, String resolucion) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.resolucion = resolucion;
    }

    @Override
    public String getProducto() {
        return "Monitor";
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
