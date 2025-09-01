package Estructura_de_Datos;

import java.util.Scanner;
import java.util.TreeSet;

public class EjercicioPrimerDiccionario_1045_Patito {

    public static TreeSet<String> conjunto = new TreeSet<String>();

    public static void f(String s) {
        s+= '-';
        String nuevo="";
        for(int i=0 ; i<s.length(); i++ ){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                nuevo+=s.charAt(i);
            }
            else{
                if(!nuevo.equals("")){
                    conjunto.add(nuevo);
                }
                nuevo="";
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            f(in.next().toLowerCase());
        }

        for (String x : conjunto) {
            System.out.println(x);
        }
    }
}
