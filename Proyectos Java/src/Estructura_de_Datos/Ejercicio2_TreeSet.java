package Estructura_de_Datos;

import java.util.TreeSet;

import java.util.Iterator;

//Cristian J. Velaco Conde 
//13759085 L.P

public class Ejercicio2_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> miTreeSet = new TreeSet<Integer>();
        //Adicionamos elementos
        miTreeSet.add(5);
        miTreeSet.add(3);
        miTreeSet.add(37);
        miTreeSet.add(7);
        miTreeSet.add(1);

        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P.");

        //Estado actual del Hash Set
        System.out.println(miTreeSet);

        //Cantidad de elementos
        System.out.println(miTreeSet.size());

        System.out.println();

        //Devuelve los elementos de la cabecera del TreeSet 
        System.out.println(miTreeSet.headSet(37));

        //Devuelve los elementos del final del TreeSet
        System.out.println(miTreeSet.tailSet(37));

        System.out.println();

        //Devuelve conjuto de 3 hasta 37 no incluido
        System.out.println(miTreeSet.subSet(3, 37));

        //Recorrido del TreeSet
        Iterator<Integer> it= miTreeSet.iterator();

        //Conjunto de elementos
        while (it.hasNext()) {
            System.out.print(it.next() +" ");
        }
    }
}
