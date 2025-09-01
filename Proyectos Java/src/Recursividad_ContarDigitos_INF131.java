import java.util.Scanner;

public class Recursividad_ContarDigitos_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n=leer.nextInt();
        System.out.println("La cantidad de Digitos de "+n+" es: "+ContarDigitos(n));
    }

    public static int ContarDigitos(int n){
        int cont=0;
        cont++;
        if(n==0){
            return 0;
        }else{
            return(cont+ContarDigitos(n/10));
        }
    }
}
