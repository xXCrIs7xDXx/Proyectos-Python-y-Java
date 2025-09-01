import java.util.Scanner;

public class Recursividad_MostrarLosNPrimerosNum_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //1375085 LP
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int Num=leer.nextInt();
        System.out.println("Los numeros Anteriores a "+ Num+" son: ");
        Mostrar_Los_N_Primeros_Num(Num-1);
        
    }

    public static void Mostrar_Los_N_Primeros_Num(int n){
        if(n>0){
            Mostrar_Los_N_Primeros_Num(n-1);
            System.out.print(n+" ");
        }
        
    }
}
