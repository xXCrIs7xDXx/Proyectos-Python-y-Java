public class App {
    public static void main(String[] args) throws Exception {
        int N = 10; // Número de elementos a generar
        int a = 0, b = 0, c = 1;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(a + " ");
                a = b + c;
            } else {
                System.out.print(b + " ");
                b = a + c;
            }
            c = a + b;
        }
    }
}
