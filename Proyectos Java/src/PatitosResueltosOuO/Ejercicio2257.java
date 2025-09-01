package PatitosResueltosOuO;

import java.util.Scanner;

public class Ejercicio2257 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x= sc.nextInt();

        int res=0;
        for(int i=1 ; i<=n ; i++) {
            res=x*i;

            System.out.println(res);
        }
    }
}
