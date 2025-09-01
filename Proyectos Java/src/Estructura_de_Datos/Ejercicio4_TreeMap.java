package Estructura_de_Datos;

import java.util.Map;
import java.util.TreeMap;

//Cristian J. Velasco Conde 
//13759085 L.P

public class Ejercicio4_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> miTreeMap = new TreeMap<Integer, Integer>();

        //Adiccion de elementos
        miTreeMap.put(34, 6);
        miTreeMap.put(2, 7);
        miTreeMap.put(5, 88);
        miTreeMap.put(1, 11);
        miTreeMap.put(5, 99);

        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P.");

        //Estado Actual del TreeMap
        System.out.println(miTreeMap);

        //Nro de pares
        System.out.println(miTreeMap.size());

        //Obtiene el valor que tiene como clave 5 99
        System.out.println(miTreeMap.get(5));

        //Obtiene el valor que tiene como clave
        System.out.println(miTreeMap.keySet());

        //Obtiene el valor que tiene como valores
        System.out.println(miTreeMap.values());

        System.out.println();

        //devuelve una lista de claves en forma descendiente
        System.out.println(miTreeMap.descendingKeySet());

        //devuelve un mapa de forma descendiente
        System.out.println(miTreeMap.descendingMap());

        System.out.println();

        //Devuelve mapa con la clave menor
        System.out.println(miTreeMap.firstEntry());

        //Devuelve mapa con la clave mayor
        System.out.println(miTreeMap.lastEntry());
    }
}
