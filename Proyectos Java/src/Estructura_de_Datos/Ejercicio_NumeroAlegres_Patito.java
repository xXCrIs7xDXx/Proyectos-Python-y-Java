package Estructura_de_Datos;

import java.util.*;

import java.util.*;

public class Ejercicio_NumeroAlegres_Patito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Long> v = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            Queue<Long> queue = new LinkedList<>();
            queue.add(i);
            while (!queue.isEmpty()) {
                long num = queue.poll();
                if (num <= 100000) {
                    v.add(num);
                    int lastDigit = (int) (num % 10);
                    if (lastDigit > 0) {
                        queue.add(num * 10 + (lastDigit - 1));
                    }
                    if (lastDigit < 9) {
                        queue.add(num * 10 + (lastDigit + 1));
                    }
                }
            }
        }
        Collections.sort(v);
        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println(v.get(x - 1));
        }
    }
}


