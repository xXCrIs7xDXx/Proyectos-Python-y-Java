package Estructura_de_Datos;

import java.util.PriorityQueue;
import java.util.Scanner;

//Cristian J. Velasco Conde
//13759085 L.P

public class Ejercicio_1538_Patito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P.");
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            PriorityQueue<Long> queue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                queue.add(scanner.nextLong());
            }

            long cost = 0;
            while (queue.size() > 1) {
                long a = queue.poll();
                long b = queue.poll();
                cost += a + b;
                queue.add(a + b);
            }

            System.out.println(cost);
        }
        scanner.close();
    }
}

