package Estructura_de_Datos;

import java.util.Scanner;
import java.util.*;

public class Ejercicio_AdivineLaEstructura_Patito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Stack<Integer> pila = new Stack<Integer>();
            Queue<Integer> cola = new LinkedList<Integer>();
            PriorityQueue<Integer> pcola = new PriorityQueue<Integer>();

            boolean sw1 = true, sw2 = true, sw3 = true;

            int n = in.nextInt();
            while (n-- > 0) {
                int ope = in.nextInt();
                int val = in.nextInt();
                if (ope == 1) {
                    pila.push(val);
                    cola.add(val);
                    pcola.add(val * (-1));
                } else {
                    if (pila.isEmpty() || cola.isEmpty() || pcola.isEmpty()) {
                        sw1 = sw2 = sw3 = false;
                    } else {
                        int e1 = pila.pop();
                        if (val != e1) {
                            sw1 = false;
                        }
                        int e2 = cola.poll();
                        if (val != e2) {
                            sw2 = false;
                        }
                        int e3 = pcola.poll() * (-1);
                        if (val != e3) {
                            sw3 = false;
                        }
                    }
                }
            }
            if (!sw1 && !sw2 && !sw3) {
                System.out.println("impossible");
            } else if ((sw1 && sw2) || (sw1 && sw3) || (sw2 && sw3)) {
                System.out.println("not sure");
            } else if (sw1) {
                System.out.println("stack");
            } else if (sw2) {
                System.out.println("queue");
            } else {
                System.out.println("priority queue");
            }
        }
    }
}
