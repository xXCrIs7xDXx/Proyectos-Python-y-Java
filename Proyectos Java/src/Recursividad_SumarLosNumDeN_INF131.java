import java.util.Scanner;

public class Recursividad_SumarLosNumDeN_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //1759085 LP
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n=leer.nextInt();
        System.out.println("La Suma de los digitos de "+n+" es: "+SumarLosDigitos(n));
    }

    public static int SumarLosDigitos(int n){
        if(n==0){
            return(0);
        }else{
            return(n%10 + SumarLosDigitos(n/10));
        }
    }
}
