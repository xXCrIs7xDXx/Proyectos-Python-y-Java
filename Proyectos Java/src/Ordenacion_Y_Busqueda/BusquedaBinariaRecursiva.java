package Ordenacion_Y_Busqueda;

public class BusquedaBinariaRecursiva {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        int[] v=new int[6];
        v[1]=2;
        v[2]=5;
        v[3]=7;
        v[4]=8;
        v[5]=9;
        System.out.println(Busqueda(v,1,5,9));
    }

    public static int Busqueda(int v[], int p, int u, int x){
        int medio;
        if(p>u){
            return 0;
        }
        medio = (p+u)/2;
        if(v[medio]==x){
            return medio;
        }else {
            if(v[medio]>x){
                return Busqueda(v,p,medio-1,x);
            }else{
                return Busqueda(v,medio+1,u,x);
            }
        }
    }
}
