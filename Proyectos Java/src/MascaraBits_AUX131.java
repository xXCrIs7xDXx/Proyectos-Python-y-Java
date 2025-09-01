import java.util.Scanner;
public class MascaraBits_AUX131 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		int v[] = new int[n];// [1, 5, 8]
		for (int i = 0; i < n; i++)
			v[i] = in.nextInt();
		for (int mask = 0; mask < (1 << n); mask++) {
			System.out.print("{");
			for (int i = 0; i < n; i++) {
				if ((mask & (1 << i)) > 0) {
					System.out.print(v[i] + " ");
				}
			}
			System.out.println("}");
			// 1 8
		}
	}
}