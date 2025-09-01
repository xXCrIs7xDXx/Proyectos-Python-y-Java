package Supermercado;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(){
        codigo = 1234;
        descripcion = "Sopa de Tomate";
        precio= 12.35f;
    }

    public Producto(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("\n----------- Producto ----------");
        System.out.println("Codigo: "+codigo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Precio: "+precio);
        System.out.println("-------------------------------");
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
