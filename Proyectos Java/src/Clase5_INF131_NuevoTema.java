public class Clase5_INF131_NuevoTema {
    static int BusquedaSecuencial(int[] v, int dato){
        //Recibe como parametro vector v y el dato 
        //Devolver la peticion en la que esta el
        //elemento buscado
        for(int i=0; i<v.length; i++){     // N
            if(v[i]==dato) {               // N-1
                return i;                  // N-1
            }
        }
        return -1;                         //1
    }
    //T(N)=         2N     -        1
    //         fun lineal        func ctte
    //T(N)= 2N - 1  e  O(n)                  //T(N)  =  10    -  15    e O(n)
                                             //       f lineal   f otte
    public static void main(String[] args){
        int[] v={12,81,50,10,5,1,8,2,55,88,90,100};
        int dato=12;
        long ti=System.nanoTime();
        int res = BusquedaSecuencial(v,dato);
        long tf=System.nanoTime();
        if(res>=0){
            System.out.println("Encontrado en la posicion: "+res);
        }
        else{
            System.out.println("No encontrado UnU!!");
        }
        //long = 1.000.000.000 nanoSeg
        System.out.println("Tiempo de busqueda en NanoSegundos: "+(tf-ti));
    }
}
