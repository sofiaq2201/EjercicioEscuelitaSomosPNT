public class Producto implements Comparable<Producto>{
    
    private String nombre;
    private int precio; 
   
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    public Producto(){}
    
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return precio - o.getPrecio();
    }
}
