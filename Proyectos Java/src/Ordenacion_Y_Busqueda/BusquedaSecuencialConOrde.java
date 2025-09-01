package Ordenacion_Y_Busqueda;

public class BusquedaSecuencialConOrde {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        int[] v=new int[6];
        v[1]=2;
        v[2]=5;
        v[3]=7;
        v[4]=8;
        v[5]=9;
        System.out.println(BuscarOrden(v,5,7));
    }

    public static int BuscarOrden(int v[], int n, int x){
        if(n==0 || v[n]<x){
            return 0;
        }else{
            if(v[n]==x){
                return n;
            }else{
                return BuscarOrden(v,n-1,x);
            }
        }
    }
}
