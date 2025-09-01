package Estructura_de_Datos;

import java.util.*;
import java.io.*;

//Cristian J. Velasco Conde
//13759085 L.P

public class Ejercicio_1118_Patito {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> words = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        //System.out.println("Cristian J. Velasco Conde");
        //System.out.println("13759085 L.P");

        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(" ");
            for (String s : split) {
                if (s.endsWith("-")) {
                    sb.append(s.substring(0, s.length() - 1));
                } else {
                    sb.append(s.replaceAll("[^a-zA-Z-]$", ""));
                    words.add(sb.toString().toLowerCase());
                    sb.setLength(0);
                }
            }
            if (sb.length() == 0) {
                words.add("");
            }
        }

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}

