public class Computadora implements IProducto {
    private int idProducto;
    private String marca;
    private String modelo;
    private int precio;
    private String cpu;
    private String ram;
    private String hdd;

    public Computadora(int idProducto, String marca, String modelo, int precio, String cpu, String ram, String hdd) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
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
