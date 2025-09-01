public class Recursividad_Sumatoria_INF131 {
    public static void main(String[] args){
        System.out.println(suma(10));

    }
    
    public static int suma(int n){
        if(n==0){
            return 0; 
        }else{
            return (n+suma( n-1));
        }
    }
}
