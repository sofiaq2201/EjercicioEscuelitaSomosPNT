import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Producto implements Comparable<Producto>{
    
    private String nombre;
    private int precio; 
    
    private List<Producto> productos = new ArrayList<>();

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

    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void todosLosProductos(){
        productos.forEach((producto) -> {
            System.out.println(producto.toString());
        });
    }

    @Override
    public int compareTo(Producto o) {
        return precio - o.getPrecio();
    }
    
    public void productoCaroYBarato(){
        Collections.sort(productos);
        String productoMasCaro = productos.get(productos.size() - 1).getNombre();
        String productoMasBarato =  productos.get(0).getNombre();
        System.out.println("Producto más caro: " + productoMasCaro + "\n"
                + "Producto más barato: " + productoMasBarato);
    }
    
    public void Menu(){
        todosLosProductos();
        System.out.println("=============================");
        productoCaroYBarato();
    }
   
}
