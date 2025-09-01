package Estructura_de_Datos;

import java.util.PriorityQueue;
import java.util.Scanner;
//Cristian J. Velasco Conde
//1759085 L.P

public class Problema_A_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                queue.add(scanner.nextInt());
            }

            int totalCost = 0;
            while (queue.size() > 1) {
                int cost = queue.poll() + queue.poll();
                totalCost += cost;
                queue.add(cost);
            }

            System.out.println(totalCost);
        }
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");
    }
}