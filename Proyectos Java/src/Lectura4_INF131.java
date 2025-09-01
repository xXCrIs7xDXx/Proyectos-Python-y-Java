import java.util.Scanner;

public class Lectura4_INF131 {
    public static void main(String[] args){
        //Cristian Velasco Conde
        //13759085 L.P
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el numero de grupos de datos: ");
        int n= leer.nextInt();
        while(n-->0){
            System.out.println("-----Grupo de datos-----");
            int k = leer.nextInt();
            while(k-->0){
                int datos = leer.nextInt();
                System.out.println(datos);
            }
        }
    }
}
