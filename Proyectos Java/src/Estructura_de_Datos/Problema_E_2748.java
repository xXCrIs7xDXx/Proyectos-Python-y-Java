package Estructura_de_Datos;

import java.util.*;
//Cristian J. Velasco Conde 
//13759085 L.P

public class Problema_E_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = scanner.nextInt();
            }

            int q = scanner.nextInt();
            for (int i = 0; i < q; i++) {
                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;
                Set<Integer> uniqueNumbers = new HashSet<>();
                for (int j = l; j <= r; j++) {
                    uniqueNumbers.add(sequence[j]);
                }
                System.out.println(uniqueNumbers.size());
            }
        }
    }
}
