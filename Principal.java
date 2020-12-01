import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
       List<Producto> productos = new ArrayList<>();
       
       productos.add(new Bebida("Coca-Cola Zero", 20, 1.5));
       productos.add(new Bebida("Coca-Cola", 18, 1.5));
       productos.add(new Shampoo("Shampoo Sedal", 19, 500));
       productos.add(new Verdura("Frutillas", 64, "kilo"));
       
       for(Producto producto: productos){
          System.out.println(producto.toString());
       }
       
       Collections.sort(productos);
       String productoMasCaro = productos.get(productos.size() - 1).getNombre();
       String productoMasBarato =  productos.get(0).getNombre();
       
       System.out.println("=============================");
       System.out.println("Producto más caro: " + productoMasCaro);
       System.out.println("Producto más barato: " + productoMasBarato);
    
    } 
}
