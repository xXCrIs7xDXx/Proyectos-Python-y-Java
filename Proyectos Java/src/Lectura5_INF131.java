import java.util.Scanner;

public class Lectura5_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 L.P
        Scanner leer= new Scanner(System.in);

        int n =leer.nextInt(); 
        while(n>0){
            for(int i=0;i<n; i++){
                int dato = leer.nextInt(); 
                System.out.println(dato);
            }
            n=leer.nextInt();
        }
    }
}
