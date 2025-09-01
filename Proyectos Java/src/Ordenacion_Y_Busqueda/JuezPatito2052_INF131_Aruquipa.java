package Ordenacion_Y_Busqueda;

import java.util.Scanner;

public class JuezPatito2052_INF131_Aruquipa {
    public static void main(String[] args){
        //Juez patito 2052
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //int[] vector = new int[n];
        int[] num=new int[n];
        String[] cad= new String[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
            cad[i]=sc.next();
        }

        //orden de ordenamiento Burbuja
        int aux=0;
        String  auxC=" ";
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(num[i]>num[j]) {
                    aux=num[j];
                    auxC=cad[i];

                    num[i]=num[j];
                    cad[i]=cad[j];
                    
                    num[j]=aux;
                    cad[j]=auxC;
                }
            }
        }

        int ini=0; int fin=0;
        for (int i = 0; i < n-1; i++) {
            if(num[i]==num[i+1]){
                ini=i;
                for (int j = i+1; j < n; j++) {
                    if(num[i]==num[j]){
                        fin=j;
                    }
                }
                
            }
            System.out.println("\t"+i+" "+fin); 
            i=fin;
            //mergeSort(cad, ini, fin); //Ordenar por merge sort
            
        }

        for(int i=0; i<cad.length; i++){
            System.out.println(num[i]+ " "+ cad[i]);
        }
    }
}
