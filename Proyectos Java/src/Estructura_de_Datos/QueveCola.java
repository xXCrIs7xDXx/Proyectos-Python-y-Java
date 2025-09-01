package Estructura_de_Datos;

import java.util.LinkedList;
import java.util.Queue;
//Uso de Cola
//By Cristian J. Velasco Conde
//13759085
public class QueveCola {
    public static void main(String[] args){
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("1379085 LP");
        Queue<Integer> miCola=new LinkedList<Integer>();
        //adicionamos 4 elementos
        miCola.offer(58);
        miCola.offer(2145);
        miCola.offer(30);
        miCola.offer(874);
        System.out.println(miCola);

        //numero de elementos del Queue
        System.out.println(miCola.size()); 

        //Consulta el primer elemento
        System.out.println(miCola.peek());
        
        //Elimina el primer elemento
        miCola.poll();

        //Compruebe asi la cola esta vacia
        System.out.println(miCola.isEmpty());

        System.out.println();
        //Mostraremos los elementos
        while(!miCola.isEmpty()){
            System.out.print(miCola.poll() + ", ");
        }
    }
}
