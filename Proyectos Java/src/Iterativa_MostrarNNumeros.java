import java.util.Scanner;

public class Iterativa_MostrarNNumeros {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        System.out.println("Los numeros antes del "+n+" son:");
        for(int i=n-1; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
