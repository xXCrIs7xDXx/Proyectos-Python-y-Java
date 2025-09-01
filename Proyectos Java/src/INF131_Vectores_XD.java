import java.util.Arrays;
import java.util.Scanner;

public class INF131_Vectores_XD {
    public static void main(String[] args) {
        System.out.println("Cristian J. Velasco Conde");
        System.out.println("13759085 LP");
        Scanner sc = new Scanner(System.in);
        //Cristian J. Velasco Conde
        //13759085 LP

        // ---------------------- Inciso 1 --------------------
        int[] vec1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] vec2 = new int[] { 1, 58, 90, 5, 11, 10, 7, 8, 55 };

        // Comparar en el el tamanio del vec
        if (vec1.length == vec2.length) {
            System.out.println("Si son iguales en Tamanio");
        } else {
            System.out.println("No son iguales en Tamanio");
        }

        // Comparar los elementos del vector
        for (int i = 0; i < vec2.length; i++) {
            if (vec1[i] == vec2[i]) {
                System.out.println("Si Son Iguales en la posicion " + vec1[i]);
            } else {
                System.out.println("No son iguales en la posicion " + vec1[i]);
            }
        }

        // ---------------------- Inciso 2 --------------------
        System.out.println("\n---- INCISO 2 ----");
        System.out.println("Ingresa el numero de elementos del vector 1: ");
        int[] vec3 = new int[50];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            vec3[i] = vec1[i];
            System.out.print(vec3[i] + " ");
        }

        // ---------------------- Inciso 3 --------------------
        System.out.println("\n---- INCISO 3 ----");
        System.out.println("Ingrese el valor para inicializarlo: ");
        int num1 = sc.nextInt();
        int[] vec4 = new int[10];
        for (int i = 0; i < vec4.length; i++) {
            vec4[i] = num1;
            System.out.print(vec4[i] + " ");
        }

        // ---------------------- Inciso 4 --------------------
        System.out.println("\n---- INCISO 3 ----");
        System.out.println("\nIngrese el valor de Inicio");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el valor del Final");
        int num3 = sc.nextInt();
        int[] vec5 = new int[10];
        for (int i = num2; i < num3; i++) {
            vec5[i] = 1;
            System.out.print(vec5[i] + " ");
        }

        // ---------------------- Inciso 5 --------------------
        System.out.println("\n---- INCISO 5 ----");
        System.out.println("Ingresa el valor a buscar: ");
        String leerCad = sc.next();
        String[] cad = { "a", "b", "c", "d", "e", "f" };
        int cont = 0;
        for (int j = 0; j < cad.length; j++) {
            if (cad[j].equals(leerCad)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("Si Existe en el vector");
        } else {
            System.out.println("No existe en el vector");
        }

        // Dado un vector de enteros, ordenarlos
        System.out.println("\n ---- Ordenacion de Vectores ---- ");
        int temp;
        System.out.println("Vector Desordenado: ");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i] + " ");
        }
        for (int i = 0; i < vec2.length - 1; i++) {
            for (int j = i + 1; j < vec2.length; j++) {
                if (vec2[i] > vec2[j]) {
                    temp = vec2[i];
                    vec2[i] = vec2[j];
                    vec2[j] = temp;
                }
            }
        }
        System.out.println("\nVector Ordenado: ");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i] + " ");
        }

        // Dado Dos Vectore de enteros, Verificar si son iguales
        System.out.println("\n\n----- Verificar si son Iguales -----");
        System.out.println("Son o no son iguales: ");
        System.out.println(Arrays.equals(vec1, vec2));

        // Copiar Elementos con dtos numericos con funcion
        System.out.println("\n\n----- Usando Metodo copyOF -----");
        vec3 = Arrays.copyOf(vec2, 5);
        System.out.println("Vector con Datos copiados");
        for (int i = 0; i < vec3.length; i++) {
            System.out.print(vec3[i] + " ");
        }

        // Inicializarlo con un valor de acuerdo al tipo del vector(METODO)
        System.out.println("\n\n----- Usando Metodo fill -----");
        Arrays.fill(vec3, 7);
        for (int i = 0; i < vec3.length; i++) {
            System.out.print(vec3[i] + " ");
        }

        //Dado un vector de enteros, buscar la cadena x.
        System.out.println("\n\n----- Usando Metodo binarySearch -----");
        System.out.println("--->"+Arrays.binarySearch(vec1,2));

        //Dado un vector de enteros, ordenarlos.
        System.out.println("\n\n----- Usando Metodo Sort -----");
        Arrays.sort(vec2);
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i]+" ");
        }
    }
}