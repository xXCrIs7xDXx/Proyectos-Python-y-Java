package Estructura_de_Datos;

import java.util.*;
//Cristian J. Velasco Conde
//13759085 L.P
public class Problema_C_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        while (scanner.hasNext()) {
            String instruction = scanner.next();

            if (instruction.equals("T")) {
                break;
            } else if (instruction.equals("S")) {
                int x = scanner.nextInt();
                queue.add(x);
            } else if (instruction.equals("A")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                } else {
                    System.out.println("Error");
                }
            } else if (instruction.equals("R")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                } else {
                    System.out.println("Error");
                }
            } else if (instruction.equals("I")) {
                int x = scanner.nextInt();
                if (!queue.isEmpty()) {
                    int max = queue.poll();
                    queue.add(max + x);
                } else {
                    System.out.println("Error");
                }
            } else if (instruction.equals("D")) {
                int x = scanner.nextInt();
                if (!queue.isEmpty()) {
                    int max = queue.poll();
                    queue.add(max - x);
                } else {
                    System.out.println("Error");
                }
            }
        }
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");
    }
}
