public class ExtraerFecha {
    public static void main(String[] args){
        int fecha=2295856;
        int dia=fecha & 255;
        int mes=(fecha>>8)& 255;
        int anio=(fecha>>16)&255;
        System.out.println("Dia: "+dia+" "+Integer.toBinaryString(dia));
        System.out.println("Mes: "+mes+" "+Integer.toBinaryString(mes));
        System.out.println("Anio: "+anio+" "+Integer.toBinaryString(anio) ); 
        String day=Integer.toBinaryString(dia);
        System.out.println(day);
        String d1=day.substring(0, 2);
        String d2=day.substring(2,6);
        System.out.println(Integer.parseInt(d1,2)+" "+Integer.parseInt(d2,2));
        //Ejercicio
        //Nivel Basico
        //1. Daod el sigyuiente numero 2295856 modificar el bit de paridad (el bit mas bajo)
        //System.out.println("El numero"+fecha+" en binario es: "+Integer.toBinaryString(fecha));
        //System.out.println("El bit de paridad del numero "+fecha+" es "+getParidad(fecha));
        //int modi=modifyParitybit(fecha);
        //System.out.println("El numero modificao es: "+modifiedNum);


        //Nivel Intermedio
        //2. Dod el numero 195, intercambiar sus nibles
        //195 = 1100 0011  => 0011 1100 = 60
        int num=195;
        int ni=(num&0x0F)<<4;
        int ni1=(num&0xF0)>>4;
        int resul=ni | ni1;
        System.out.println(num);
        System.out.println(resul);

        //Nivel Avanzado
        //3. Realizaruna funcion o procedimiento para extraer
        //dd/mm/yy en pantalla!!!
        //Ejemplo fecha 20230830 ===>año 2023, mes=08, dia=30

    }

    public static int getParidad(int numero) {
        int count = 0;
        while(numero > 0){
            count += numero&1;
            numero=numero>>>1;
        }
        return count%2==0?0:1;
    }

    /*public static int modifyParitybit(int numero){
        int pari
    }*/

}