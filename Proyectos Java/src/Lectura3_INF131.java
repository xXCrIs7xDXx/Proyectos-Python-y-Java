import java.util.Scanner;

public class Lectura3_INF131 {
    public static void main(String[] args){
        //Cristian Velasco Conde 
        //13759085 L.P
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese el numero de datos: "); 
        int n=leer.nextInt();
        while(n-- > 0){
            int dato=leer.nextInt();
            System.out.println(dato);    
        }
    }
}
