import java.util.Scanner;

public class Iterativa_SumarLosDigitos_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int n=leer.nextInt();
        int temp=n, cont=0, total=0, temp1=n;
        while(temp>0){
            temp=temp/10;
            cont=cont+1;
        }
        for(int i = 1; i <= cont; i++){
            total=total+temp1%10;
            temp1=temp1/10;
        }
        System.out.println("La Suma de los Digitos de "+n+" es: "+total);
    }
}
