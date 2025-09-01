package Ordenacion_Y_Busqueda;

public class BusquedaRecursivaSinOrden {
    public static void main(String[] args){
        //Cristian J. Velasco Conde
        //13759085 LP
        int[] v=new int[6];
        v[1]=2;
        v[2]=7;
        v[3]=5;
        v[4]=9;
        v[5]=8;
        System.out.println(FuncionBuscar(v,5,7));
    }

    public static int FuncionBuscar(int[]  v, int n, int x){
        if(n==0){
            return 0;
        }else{
            if(v[n]==x){
                return n;
            }else{
                return FuncionBuscar(v,n-1, x);
            }
        }
    }
}
