package Clases_Aux_Miguelito;

import java.util.Scanner;

public class EjercicioExamenLicAruquipa_ElUltimoDigito {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in); 
        while(in.hasNext()){
            long x=in.nextLong(); 
            long y=in.nextLong();
            int dos[] = {6,2,4,8};
            int tres[] = {1,3,9,7};
            int dig1=dos[(int)(x%4)];
            int dig2=tres[(int)(y%4)];
            System.out.println((dig1 + dig2)%10);
        }
    }
}
