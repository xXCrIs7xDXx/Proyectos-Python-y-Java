public class OperacionDeBits_INF131 {
    public static void main(String[] args){
        /*byte Num=-68;
        byte res=(byte)(-68<<3);
        System.out.println(Integer.toBinaryString(res));
        System.out.println(res);*/

        int num=57;
        System.out.println(Integer.toBinaryString(num)); //000000000 00000000 000000000 00111001
        System.out.println("Nro de Bits Iguales a 1 = " +Integer.bitCount(num)); // Nos muestra cuantos numeros 1 hay en en el bi

        int resMascara=57 | (1<<2); 
        System.out.println(resMascara);

        //Dato una fecha representado por un numero en formato YYMMDD
        //Extraer el año, mes y dia 
        int fecha= 230823; // donde se ausme este formato: YY-MM-DD
        int año=0;
        int mes= 8;
        int dia = 23;
        System.out.println("Año: "+año+" mes: "+mes+" dia: "+dia);

        System.out.println(Integer.toBinaryString(fecha));
    }
}
