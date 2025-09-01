package Clases_Aux_Miguelito;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Clase_Set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Set<Integer> connjunto = new HashSet<Integer>(); //El hashset almacena datos sin repetirlos
        Set<Integer> connjunto = new TreeSet<Integer>(); //El Treeset almacena datos sin repetirlos y los ordena
        connjunto.add(1);
        connjunto.add(5);
        connjunto.add(2);
        connjunto.add(5);
        connjunto.add(4);
        connjunto.add(100);
        System.out.println(connjunto);

        //Iterator mientras el vector tenga elementos va a seguir 
        // para invertir una cola para que el ultimo pase a ser el primero solo es multiplicar por -1
    }
}
