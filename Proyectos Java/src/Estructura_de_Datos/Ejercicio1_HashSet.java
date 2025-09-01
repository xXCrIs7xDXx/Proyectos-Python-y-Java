package Estructura_de_Datos;

import java.util.HashSet;
import java.util.Iterator;

//Cristian J. Velasco COonde
//13759085 L.P

public class Ejercicio1_HashSet {
    public static void main(String[] args) {
        HashSet<String> miHashSet = new HashSet<String>();
        //Adicion de elementos
        miHashSet.add("587469322");
        miHashSet.add("Wigetta");
        miHashSet.add("Vegetta777");
        miHashSet.add("55.33");
        miHashSet.add("a");

        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");
        //Verifica si esta vacio el Hash Set False
        System.out.println(miHashSet.isEmpty());

        //Se elimina elemento del Hash Set
        miHashSet.remove("a");

        //El nro de elementos del Hash Set 5
        System.out.println(miHashSet.size());

        //estado actual del Hash Set 
        System.out.println(miHashSet);

        System.out.println();

        //true si existe el elemento 
        System.out.println(miHashSet.contains("Wigetta"));

        //Recorrido del Hash Set
        Iterator <String> it= miHashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
