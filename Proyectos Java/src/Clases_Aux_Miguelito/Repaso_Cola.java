package Clases_Aux_Miguelito;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Repaso_Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> a = new LinkedList<Integer>();
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            a.add(x);
        }
        Queue<Integer> b = new LinkedList<Integer>();
        Queue<Integer> c = new LinkedList<Integer>();
        while (!a.isEmpty()) {
            while (!a.isEmpty()) {
                int x = a.peek();
                a.remove();
                if (a.isEmpty()) {
                    c.add(x);
                } else {
                    b.add(x);
                }
            }
            while(!b.isEmpty()) {
                a.add(b.remove());
            }
        }
        while(!c.isEmpty()) {
            int x=c.peek();
            System.out.println(x);
            c.remove();
        }
        // ----- PARA INVERTIR LA SECUENCIA DE NUMEROS ------
    }
}