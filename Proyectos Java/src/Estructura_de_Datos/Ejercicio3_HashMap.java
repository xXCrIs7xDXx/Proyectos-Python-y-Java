package Estructura_de_Datos;

import java.util.HashMap;

//Cristian J. Velasco Conde
//13759085 L.P
public class Ejercicio3_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mihHashMap=new HashMap<Integer, String>();

        //Adicon de elementos
        mihHashMap.put(3, "Inf-121");
        mihHashMap.put(44, "Lab-121");
        mihHashMap.put(1, "Mat-143");
        mihHashMap.put(34, "Fis-255");
        mihHashMap.put(7, "INF-112");
        mihHashMap.put(1, "INFO");

        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");

        //Estado actual del HashMap
        System.out.println(mihHashMap);

        //Nro de elementos
        System.out.println(mihHashMap.size());

        //Eliminacion de un elemento 
        mihHashMap.remove(7);

        //Estado actual del HashMap
        System.out.println(mihHashMap);

        System.out.println();

        // Devuelve un conjunto de claves
        System.out.println(mihHashMap.keySet());

        // Devuelve el conjunto de valores
        System.out.println(mihHashMap.values());

        System.out.println();
        //Devuelve el valor de la clave Fis-255
        System.out.println(mihHashMap.get(34));

        //Devuelve true si esta llena y si esta vacia false
        System.out.println(mihHashMap.isEmpty());
    }
}
