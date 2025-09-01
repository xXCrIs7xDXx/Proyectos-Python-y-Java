package Clases_Aux_Miguelito;

import java.util.*;

public class JuezPatito_Notacion0_Auxiliatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c = sc.nextInt();
            sc.nextLine();  //Presiona Enter 
            String[] codigo = new String[c];
            for (int i = 0; i < c; i++) {
                codigo[i] = sc.nextLine();
            }
            System.out.println(calcularComplejidad(codigo));
        }
    }

    public static String calcularComplejidad(String[] codigo) {
        Stack<String> pila = new Stack<>();
        int maxFors = 0;
        for (String linea : codigo) {
            if (linea.contains("for")) {
                pila.push("for");
                maxFors = Math.max(maxFors, pila.size());
            } else if (linea.contains("}")) { 
                if (!pila.isEmpty()) {
                    pila.pop();
                }
            }
        }
        return maxFors > 0 ? "O(n^" + maxFors + ")" : "O(1)";
    }

    //Push Añade mas elementos al ultimo elemento de un array
    //Pop Elimina el ultimo elemento de un vector
    //IsEmpty es para ver si esta vacio un vector
}
