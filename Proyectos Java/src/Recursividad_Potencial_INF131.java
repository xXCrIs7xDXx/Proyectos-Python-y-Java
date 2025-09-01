public class Recursividad_Potencial_INF131 {
    public static void main(String[] args){
        System.out.println(potencial(2, 0));
    }

    public static int potencial(int n, int p){
        if(p==0){
            return 1;
        }
        else{
            return (n*potencial(n, p-1));
        }
    }
}
