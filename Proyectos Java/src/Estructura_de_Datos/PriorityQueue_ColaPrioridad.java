package Estructura_de_Datos;

import java.util.PriorityQueue;
//Uso de la cola de Prioridad
//By Cristian J. Velasco Conde
//13759085 LP.
public class PriorityQueue_ColaPrioridad {
    public static void main(String[] args){
        PriorityQueue<String> miColaPrioridad= new PriorityQueue<String>();

        //Adicion de datos
        miColaPrioridad.offer("587469321");
        miColaPrioridad.offer("Wiguetta");
        miColaPrioridad.offer("Vegetta777");
        miColaPrioridad.offer("58");

        System.out.println(miColaPrioridad);
        System.out.println();

        //Tamaño de la cola 
        System.out.println(miColaPrioridad.size());
        System.out.println();

        //Buscar el elemento del inicio
        System.out.println(miColaPrioridad.peek());

        //Elimina el elemento 
        String dato = miColaPrioridad.poll();
        System.out.println(dato);
        System.out.println();

        System.out.println(miColaPrioridad.peek());
        System.out.println();

        //Verifica si esta vacia
        System.out.println(miColaPrioridad.isEmpty());

        //muestra los elemetos de la cola
        while(!miColaPrioridad.isEmpty()){
            System.out.println(miColaPrioridad.poll());
        }
    }
}
