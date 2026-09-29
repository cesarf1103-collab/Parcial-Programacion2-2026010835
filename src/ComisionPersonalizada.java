public class ComisionPersonalizada implements EstrategiaComision {
    private final String primerNombre;

    public ComisionPersonalizada(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + primerNombre.length()) / 100.0;
        return montoVenta * porcentaje;
    }
}
