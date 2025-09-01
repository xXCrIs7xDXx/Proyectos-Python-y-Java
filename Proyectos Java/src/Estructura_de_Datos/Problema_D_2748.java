package Estructura_de_Datos;

import java.util.*;
//Cristian J. Velasco Conde 
//13759085 L.P
public class Problema_D_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if (N == 0 && M == 0) break;

            Set<Integer> peliculasAlina = new HashSet<>();
            for (int i = 0; i < N; i++) {
                peliculasAlina.add(scanner.nextInt());
            }

            int peliculasComunes = 0;
            for (int i = 0; i < M; i++) {
                if (peliculasAlina.contains(scanner.nextInt())) {
                    peliculasComunes++;
                }
            }

            System.out.println(peliculasComunes);
        }
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");
    }
}
