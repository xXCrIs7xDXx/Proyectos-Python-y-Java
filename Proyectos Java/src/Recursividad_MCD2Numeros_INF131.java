import java.util.Scanner;

public class Recursividad_MCD2Numeros_INF131 {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085LP
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        int x=leer.nextInt(), y=leer.nextInt();
        System.out.println("El MCD de "+x+" y "+y+" es "+MCD(x, y));
    }

    public static int MCD(int x, int y){
        if(y==0){
            return x;
        }else{
            return MCD(y, x%y);
        }
    }
}
