import java.util.Scanner;

public class ProblemaC_JuezPatito_INF131 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int a= leer.nextInt();
        int b= leer.nextInt();
        if(a<b){
            for(int i=b; i>=a; i--){
                System.out.println(i);
            }
        }else{
            for(int i=a; i>=b; i--){
                System.out.println(i);
            }
        }
    }
}
