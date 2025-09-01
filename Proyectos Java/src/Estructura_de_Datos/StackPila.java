package Estructura_de_Datos;

import java.util.Stack;
//USO DE PILA
//BY CRISTIAN J. VELASCO CONDE 
//CI 13759085

public class StackPila {
    public static void main(String[] args){
        System.out.println("Cristian J. velasco Conde");
        System.out.println("13759085 LP");
        Stack<Integer> miPila= new Stack<Integer>();
        miPila.push(25); // primer en ingresar
        miPila.push(58);
        miPila.push(2);
        miPila.push(20); //ultimo en ingresar
        System.out.println(miPila);

        //scamos 2 nombres de la cima de miPila
        miPila.pop();
        miPila.pop(); // saca los ultimos en ingresar
        System.out.println(miPila);

        //revisamos el elemneto que esta en la
        //cima de miPila no lo elimina
        int nombre = miPila.peek();
        System.out.println(nombre);
        
        //verificamos si miPila esta vacias
        //true(vacia), flase (no vacia)
        boolean vacio= miPila.empty();
        System.out.println(vacio);
    }
}
