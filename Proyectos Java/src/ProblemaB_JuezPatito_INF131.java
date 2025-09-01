import java.util.Scanner;

public class ProblemaB_JuezPatito_INF131 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int temp;
        System.out.println("Ingrese los datos: ");
        int a=leer.nextInt();
        int b=leer.nextInt();
        int c=leer.nextInt();
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        if(b>c){
            temp=b;
            b=c;
            c=temp;
        }
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println("Numeros Ordenados: ");
        System.out.println(a+" "+b+" "+c);
    }
}