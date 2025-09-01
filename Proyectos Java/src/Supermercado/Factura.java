package Supermercado;

public class Factura {
    private int nit, NroProductos;
    private Cliente c=new Cliente();
    private String fecha;
    private Producto[] p=new Producto[100];

    public Factura() {
        nit=12345799;
        NroProductos=1;
        c=new Cliente();
        fecha="18/05/2023";
        for(int i=1;i<=NroProductos;i++){
            p[i]=new Producto();
        }
    }

    public void mostrarFactura() {
        System.out.println("*********** Factura ************");
        System.out.println("Nit: "+nit);
        c.mostrar();
        System.out.println("Fecha: "+fecha);
        for(int i=1; i<=NroProductos; i++){
            p[i].mostrar();
        }
        System.out.println("********************************");
    }

    public void AgregarProducto(Producto x){
        NroProductos++;
        p[NroProductos]=x;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void ContarProductos(String x){
        int cont=0;
        for(int i=1 ; i<=NroProductos; i++){
            if(p[i].getDescripcion().equals(x)){
                cont++;
            }
        }
        System.out.println("La cantidad de Productos con nombre "+x+ "es: "+ cont);
    }

    public void PrecioTotal(float x){
        float total=0;
        for(int i=1 ; i<=NroProductos ; i++){
            if(p[i].getPrecio()== x){
                total=total+p[i].getPrecio();
            }
        }
        System.out.println("La suma total es: "+total);
    }
}
