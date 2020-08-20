
public class Shampoo extends Producto {
    private int contenido;

    public Shampoo(String nombre, int precio, int contenido ) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + contenido + "ml /// Precio: $" + getPrecio();
    }
}
