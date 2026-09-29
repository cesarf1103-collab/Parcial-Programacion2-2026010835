public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
            "Cesar", 1000.0, new ComisionPersonalizada("Cesar")
        );
        vendedor.mostrarDetalle();
    }
}
