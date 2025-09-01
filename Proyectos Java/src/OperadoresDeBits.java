public class OperadoresDeBits {
    public static void main(String[] args){
        int a=5, b=7, c=3, d=3;
        //  1111  0111 0101 0111
        //Operaciones Bits a Bits
        
        int num=16;
        System.out.println("El numero "+num+" en  binario es: "+num);
        int resAND = a&b;
        int resOR = a|c;
        int resXor = a^d;

        //Resultados de AND, OR y XOR
        System.out.println("====================== RES EN NUMEROS ENTEROS =================");
        System.out.println("El resultado de AND es: "+resAND);
        System.out.println("El resultado de OR es: "+resOR);
        System.out.println("El resultado de XOR es: "+resXor);

        //En Binario los numeros
        System.out.println("================== RES EN NUMEROS BINARIOS ====================");
        System.out.println("El resultado de AND es: "+Integer.toBinaryString(resAND) );
        System.out.println("El resultado de OR es: "+Integer.toBinaryString(resOR) );
        System.out.println("El resultado de XOR es: "+Integer.toBinaryString(resXor) );
        

        //============== DESPLAZAMIENTO DE BITS =================================
        System.out.println("---- Desplazmiento ----");
        int x=9;
        int z=32;

        int resMul=x<<1;
        int resDiv=z>>3;
        System.out.println("El Desplazamiento es: "+resMul);
        System.out.println("El Desplazamiento es: "+resDiv);
        int otrores=resMul<<1;
        System.out.println("Nuevamente se mueve: "+otrores);

        //En binario los numeros
        System.out.println("El Desplazamiento de "+x+" * 4 es:"+Integer.toBinaryString(resMul));
        System.out.println("El Desplazamiento de "+z+" / 4 es:"+Integer.toBinaryString(resDiv));
    }
}
