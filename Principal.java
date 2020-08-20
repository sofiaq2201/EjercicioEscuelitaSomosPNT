public class Principal {

    public static void main(String[] args) {
       Producto p = new Producto();
       
       p.agregarProducto(new Bebida("Coca-Cola Zero", 20, 1.5));
       p.agregarProducto(new Bebida("Coca-Cola", 18, 1.5));
       p.agregarProducto(new Shampoo("Shampoo Sedal", 19, 500));
       p.agregarProducto(new Verdura("Frutillas", 64, "kilo"));
       
       p.Menu();
    }
    
}
