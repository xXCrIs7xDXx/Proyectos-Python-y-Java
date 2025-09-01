package Clases_Aux_Miguelito;

import java.util.Scanner;
import java.util.Stack;

public class InvertirSecuencia_JuezPatito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Integer> a = new Stack<Integer>();
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                a.push(x);
            }
            while (!a.empty()) {
                int x = a.peek();
                a.pop();
                if (a.empty()) {
                    System.out.print(x);
                    //System.out.println();
                } else {
                    System.out.print(x + " ");
                }
            }
        }
    }
}
