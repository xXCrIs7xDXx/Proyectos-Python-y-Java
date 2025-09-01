import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura7_INF131 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner leer=new Scanner(new File ("datos.txt"));
        while(leer.hasNext()){
            int n=leer.nextInt();
            for(int i=0; i<n; i++){
                int dato = leer.nextInt();
                System.out.println(dato);
            }
        }
    }
}
