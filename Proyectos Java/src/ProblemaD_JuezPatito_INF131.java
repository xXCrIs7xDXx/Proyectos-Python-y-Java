import java.util.Scanner;

public class ProblemaD_JuezPatito_INF131 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int t=leer.nextInt();
        int a;
        
        for(int i=1; i<=t; i++){
            a=leer.nextInt();
            int t1=-1; int t2=1; int t3=-1; int t4=1;
            for(int j=1; j<=a; j++){
                if(j%2==0){
                    int c= t1+t2;
                    System.out.print(c+" ");
                    t1=t2;
                    t2=c;
                }else{
                    int c1= t3+t4;
                    System.out.print(c1+" ");
                    t3=t4;
                    t4=c1;
                }
            }
            System.out.println("");
        }
        
    }
}
