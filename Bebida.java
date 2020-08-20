public class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }
    
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + litros + " /// Precio: $" + getPrecio();
    }
}
