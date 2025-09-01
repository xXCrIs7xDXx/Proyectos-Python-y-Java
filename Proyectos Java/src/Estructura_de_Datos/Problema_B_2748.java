package Estructura_de_Datos;

import java.util.*;

//Cristian J. Velasco Conde
//13759085 L.P
class Cliente {
    int llegada;
    char tipo;

    Cliente(int llegada, char tipo) {
        this.llegada = llegada;
        this.tipo = tipo;
    }
}

public class Problema_B_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) { 
            int N = scanner.nextInt();
            if (N == 0) break;

            int M = scanner.nextInt();
            int P = scanner.nextInt();
            PriorityQueue<Cliente> mayores = new PriorityQueue<>(Comparator.comparingInt(c -> c.llegada));
            PriorityQueue<Cliente> otros = new PriorityQueue<>(Comparator.comparingInt(c -> c.llegada));

            for (int i = 0; i < N; i++) {
                int T = scanner.nextInt();
                char R = scanner.next().charAt(0);
                if (R == 'R') {
                    mayores.add(new Cliente(T, R));
                } else {
                    otros.add(new Cliente(T, R));
                }
            }

            int tiempoActual = 0;
            while (tiempoActual < M) {
                while (!mayores.isEmpty() && tiempoActual < M) {
                    if (mayores.peek().llegada <= tiempoActual) {
                        System.out.println(tiempoActual + P);
                        tiempoActual += P;
                        mayores.poll();
                    } else {
                        break;
                    }
                }

                while (!otros.isEmpty() && tiempoActual < M) {
                    if (otros.peek().llegada <= tiempoActual) {
                        System.out.println(tiempoActual + P);
                        tiempoActual += P;
                        otros.poll();
                    } else {
                        break;
                    }
                }
            }

            while (!mayores.isEmpty() || !otros.isEmpty()) {
                System.out.println("Mil disculpas, regrese mañana");
                if (!mayores.isEmpty()) {
                    mayores.poll();
                }
                if (!otros.isEmpty()) {
                    otros.poll();
                }
            }
        }
    }
}
