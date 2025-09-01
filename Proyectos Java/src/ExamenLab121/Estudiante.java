package ExamenLab121;

import java.util.Scanner;

public class Estudiante {
    Scanner sc=new Scanner(System.in);
    private String nombre;
    private int nota;

    public Estudiante(){
        nombre = "";
        nota = 0;
    }

    public Estudiante(String nom, int a){
        nombre = nom;
        nota = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println("\nNombre: "+nombre);
        System.out.println("Nota: "+nota);
    }

    public void leer(){
        System.out.println("Ingres el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la Nota: ");
        nota=sc.nextInt();
    }

    public void compararNotas(Estudiante e1){
        if(nota > e1.getNota()){
            System.out.println("La mayor nota lo tiene el estudiante:  "+nombre);
        }else{
            System.out.println("La mayor nota lo tien el Estudiante: "+e1.getNombre());
        }
    }

    public void Comparar3Obejetos(Estudiante e1, Estudiante e2) {
        if(nota>e2.getNota() && nota>e1.getNota()){
            System.out.println("El Mayor que tiene la nota es "+nombre);
        }else{
            if(e2.getNota()>nota && e2.getNota()>e1.getNota()){
                System.out.println("La nota maxima es de "+e2.getNombre());
            }
            else{
                if(e1.getNota()>nota && e1.getNota()>e2.getNota()){
                    System.out.println("La mayor nota es "+e1.getNombre());
                }
            }
        }
    }

    public void Reprobados(Estudiante[] ests){
        for(int i=1 ; i<=3; i++){
            if(ests[i].getNota()>=51){
                System.out.println("El Estudiante "+ests[i].getNombre()+" APROBO");
            }else{
                System.out.println("El Estudiante "+ests[i].getNombre()+" REPROBO");
            }
        }
    }
}
