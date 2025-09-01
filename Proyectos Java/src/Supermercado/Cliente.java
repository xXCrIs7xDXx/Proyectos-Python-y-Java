package Supermercado;

public class Cliente {
    private int ci;
    private String nombre;

    public Cliente(){
        ci = 13759085;
        nombre = "Cristian J Velasco Conde";
    }

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
