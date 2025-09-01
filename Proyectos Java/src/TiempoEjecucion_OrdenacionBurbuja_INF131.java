public class TiempoEjecucion_OrdenacionBurbuja_INF131 {
    static void OrdenacionBurbuja(int[] v){
        //Cristian J. Velasco Conde
        //13759085 LP
        boolean cambio;
        for(int i=1; i<v.length-1; i++){          //n
            cambio = false;                       //1
            for(int j=0; j<v.length-i-1; j++){    //n(n+1)
                if(v[j]>v[j+1]){                  //n-1
                    int temp=v[j];                //1
                    v[j]=v[j+1];                  //1
                    v[j+1]=temp;                  //1
                    cambio =true;                 //1
                }
            }
            if(!cambio){                          //1
                break;                            //1
            }
        }
    }
    //La ecuacion del tiempo de ejecucion es:2n^2(n+1)+6

    public static void mostrarArreglo(int[] v){
        for(int elemento:v){
            System.out.print(elemento+" ");
        }
    }
    public static void main(String[] args){
        int[] v={5,3,8,2,9,1,20,40,50,23,84,74,36,21,99,258,745,856,352,142,854,745,555,222,122,222,745,999,333,444,111};
        mostrarArreglo(v);
        long ti= System.nanoTime();
        OrdenacionBurbuja(v);
        long tf= System.nanoTime();
        mostrarArreglo(v);
        System.out.println("El tiempo de ejecucion es de: "+(tf-ti));
    }
}
