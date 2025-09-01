import java.util.Scanner;

public class Lectura6_INF131 {
    public static void main(String[] args){
        //Cristian Velasco Conde
        //13759085 L.P

        Scanner leer=new Scanner(System.in);
        while(leer.hasNext()){
            int n=leer.nextInt();
            for(int i=0; i<n; i++){
                int dato = leer.nextInt();
                System.out.println(dato);

            }
        }
    }
}
