package Clases_Aux_Miguelito;

import java.util.Scanner;

public class Ejercicio_JuezpatitoMiMusicaFavorita {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int cap = in.nextInt();
			int n = in.nextInt();
			int v[] = new int[n];
			for (int i = 0; i < n; i++)
				v[i] = in.nextInt();
			int mx = -1000000000;
			for (int mask = 0; mask < (1 << n); mask++) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					if (((1 << i) & mask) > 0) {
						sum += v[i];
					}
				}
				if (sum > mx && sum <= cap) {
					mx = sum;
				}
			}
			for (int mask = (1 << n) - 1; mask >= 0; mask--) {
				int sum = 0;
				int tam = 0;
				for (int i = 0; i < n; i++) {
					if (((1 << i) & mask) > 0) {
						tam++;
						sum += v[i];
					}
				}
				if (sum == mx) {
					int pos = 0;
					int a[] = new int[tam];
					for (int i = 0; i < n; i++) {
						if (((1 << i) & mask) > 0) {
							a[pos] = v[i];
							pos++;
						}
					}
					for (int i = 0; i < tam; i++)
						if (i == tam - 1)
							System.out.println(a[i]);
						else
							System.out.print(a[i] + " ");
					break;
				}
			}
		}
	}
}