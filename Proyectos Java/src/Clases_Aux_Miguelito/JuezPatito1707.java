package Clases_Aux_Miguelito;
import java.util.*;

public class JuezPatito1707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (scanner.hasNext()) {
            Set<Integer> s = new TreeSet<Integer>();
            int n = scanner.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                v[i]=scanner.nextInt();
            }
            Stack<Integer> pila=new Stack<>();
            for (int i = n-1; i >= 0; i--) {
                if(!s.contains(v[i])){
                    
                }
            }
            
        }
    }
}

