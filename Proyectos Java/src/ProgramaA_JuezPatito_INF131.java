import java.util.Scanner;

public class ProgramaA_JuezPatito_INF131 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de grupos de datos: ");
        int t=leer.nextInt();
        for(int i=0; i<t; i++){
            System.out.println("Ingrese los datos: ");
            int a=leer.nextInt();
            int b=leer.nextInt();
            if(a==b){
                System.out.println(a+" = "+b);
            }
            else{
                if(a>b){
                    System.out.println(a+" > "+b);
                }
                else{
                    System.out.println(a+" < "+b);
                }
            }
        }
    }
}
