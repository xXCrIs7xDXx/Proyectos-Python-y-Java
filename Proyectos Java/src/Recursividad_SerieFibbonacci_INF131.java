import java.util.Scanner;

public class Recursividad_SerieFibbonacci_INF131 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        int n=leer.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n){
        if(n==1){
            return 0;
        }else{
            if(n==2){
                return 1;
            }else{
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
    }
}
