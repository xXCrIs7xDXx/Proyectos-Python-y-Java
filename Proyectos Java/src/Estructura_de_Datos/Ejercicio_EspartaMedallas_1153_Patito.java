package Estructura_de_Datos;

import java.util.*;

//Cristian J. Velasco Conde
//13759085 L.P

public class Ejercicio_EspartaMedallas_1153_Patito {
    public static void main(String[] args) {
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 L.P");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // Leemos la cadena de entrada
            String input = scanner.next();
            // Inicializamos una pila para almacenar las habilidades
            Stack<Integer> stack = new Stack<>();
            // Inicializamos un StringBuilder para almacenar el nombre
            StringBuilder name = new StringBuilder();
            // Recorremos la cadena de entrada carácter por carácter
            for (char c : input.toCharArray()) {
                // Si el carácter es un dígito, lo convertimos a un número y lo añadimos a la pila
                if (Character.isDigit(c)) {
                    stack.push(Character.getNumericValue(c));
                } 
                // Si el carácter es un operador, sacamos dos habilidades de la pila, realizamos la operación y añadimos el resultado a la pila
                else if (c == '+') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                } else if (c == '*') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a * b);
                } 
                // Si el carácter es una letra, lo añadimos al nombre
                else {
                    name.append(c);
                }
            }
            // Imprimimos el nombre (invertido, ya que lo construimos al revés) y la última habilidad en la pila (que es la suma o producto final)
            System.out.println(name.reverse().toString() + ": habilidad " + stack.pop());
        }
        scanner.close();
    }
}