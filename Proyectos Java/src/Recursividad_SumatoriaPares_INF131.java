public class Recursividad_SumatoriaPares_INF131 {
    public static void main(String[] args){
        System.out.println(sp(2));
    }

    public static int sp(int n){
        if(n==1){
            return 0;
        }else{
            return(sp(n-1)+2*(n-1));
        }
    }
}
