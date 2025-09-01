public class RecursividadSuma_121 {
    public static void main(String[] args){
        System.out.println("Respeusta: "+suma(5));
    }
    public static int suma(int n){
        int suma = 0;
        for(int i=1; i<=n; i++){
            suma = suma + i;
        }
        return suma; 
    }
}
