package Estructura_de_Datos;

import java.util.Deque;
import java.util.LinkedList;
//Uso de Doble Cola
//Cristian J. Velasco Conde
//13759085 LP

public class Deque_DobleCola {
    public static void main(String[] args){
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 LP");
        Deque<Integer> miDobleCola= new LinkedList<Integer>();
        miDobleCola.offerFirst(58);//Adicion al inicio
        miDobleCola.offerFirst(8);
        miDobleCola.offerLast(7);// Adicion la final
        miDobleCola.offerLast(42);

        System.out.println(miDobleCola);

        //Nro de elementos de la doble cola
        System.out.println(miDobleCola.size());

        //Busca el elemento del inicio
        System.out.println(miDobleCola.peekFirst());

        //Busca el ultimo elemento del final
        System.out.println(miDobleCola.peekLast());

        //Elimina el elemento del inicio
        miDobleCola.pollFirst();

        //Elimina el ultimo elemento
        miDobleCola.pollLast();

        System.out.println();
        System.out.println(miDobleCola.peekFirst());
        System.out.println(miDobleCola.peekLast());

        //Verifica si esta vacia o no
        System.out.println();
        System.out.println(miDobleCola.isEmpty()); 

        //Muestra los elementos que esta en el DEQUE
        System.out.println();
        while(!miDobleCola.isEmpty()) {
            System.out.println(miDobleCola.pollFirst());
        }
    }
}
