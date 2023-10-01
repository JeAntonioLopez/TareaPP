// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductoFactory computadoraFactory = new ComputadoraFactory(1, "Marca1", "Modelo1", 1000, "CPU1", "RAM1", "HDD1");
        IProducto computadora = computadoraFactory.createProducto();
        System.out.println("Id del producto: " + computadora.getIdProducto());
    }
}