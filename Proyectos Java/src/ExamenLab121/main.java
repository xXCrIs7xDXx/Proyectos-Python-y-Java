package ExamenLab121;

public class main {
    public static void main(String[] args){
        Estudiante e1=new Estudiante("Carlos", 51);
        Estudiante e2=new Estudiante("Jorge",100);
        Estudiante e3=new Estudiante();

        Estudiante[] estudiantes=new Estudiante[100];
        estudiantes[1]=e1;
        estudiantes[2]=e2;
        estudiantes[3]=e3;
        e1.mostrar();
        e2.mostrar();
        e2.setNombre("Manuel");
        e2.setNota(72);
        e3.leer();
        e3.mostrar();
        e1.compararNotas(e2);
        e1.Comparar3Obejetos(e2, e3);
        e1.Reprobados(estudiantes);
    }
}

