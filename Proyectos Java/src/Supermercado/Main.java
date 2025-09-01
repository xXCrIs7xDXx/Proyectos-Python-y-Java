package Supermercado;

public class Main {
    public static void main(String[] args){
        Factura f=new Factura();
        Producto p=new Producto(1235499, "A0",12.85f);
        Producto p1=new Producto();
        f.AgregarProducto(p);
        f.AgregarProducto(p1);
        f.mostrarFactura();

        //Examen con sobrecarga xd
        
    }
}
