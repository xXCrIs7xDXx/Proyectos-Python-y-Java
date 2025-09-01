package Ordenacion_Y_Busqueda;

import java.util.Scanner;

public class JuezPatito_1673_MiguelitoYLosDinosaurios {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] pd=new int[N];
        for(int i=0; i< N; i++){              //O(n)
            pd[i]=sc.nextInt();
        }
        int Q=sc.nextInt();                   //O(1)
        for(int i=1; i<=Q; i++ ){             //On^2
            int pm=sc.nextInt();
            int suma=0;
            int cd=0;
            for(int j=0; j<N;j++){
                if(pd[j]<= pm){
                    cd++;
                    suma=suma+pd[j];
                }
            }
            System.out.println(cd+" "+suma);
        }
    }
}

//Entonces el orden de complejidad es: O(n^2)