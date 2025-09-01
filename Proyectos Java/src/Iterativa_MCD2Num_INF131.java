import java.util.Scanner;

public class Iterativa_MCD2Num_INF131 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        int x=leer.nextInt(), y=leer.nextInt();
        int temp;
        while(y!=0){
            temp=y;
            y=x%y;
            x=temp;
        }
        System.out.println("El MCD es: "+x);
    }
}
