import java.util.Scanner;

public class Iterativa_ContarDigitos_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int n=leer.nextInt();
        int temp=n, cont=0;
        while(temp>0){
            temp=temp/10;
            cont=cont+1;
        }
        System.out.println("Del numero "+n+" hay "+cont+" digitos");
    }
}
