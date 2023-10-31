package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL");
		int negativo = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {
					System.out.print(matrix[i][j] + " ");
				}
				if(matrix[i][j]<0) {
					negativo +=1;
				}
			}
		}
		System.out.println("");
		
		System.out.println("Numeros negativos = " + negativo);

		input.close();

	}
}
