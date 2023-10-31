package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixDesafio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Informe quantas linhas tem a matriz:");
		int n = input.nextInt();

		System.out.println("Informe quantas colunas tem a matriz:");
		int m = input.nextInt();

		int[][] matrix = new int[n][m];

		System.out.println("Informe os elementos da matriz:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		System.out.println("A matriz informada é:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("Informe um numero da  matriz:");
		int k = input.nextInt();
		System.out.println();
		boolean entrou = false;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == k) {
					entrou = true;
					System.out.println("Posição: " + i + "," + j);
					
					// ESQUERDA
					if (j > 0) {
						System.out.println("ESQUERDA: " + matrix[i][j - 1]);
					}
					
					// DIREITA
					if (j < m - 1) {
						System.out.println("DIREITA: " + matrix[i][j + 1]);
					}

					// ACIMA
					if (i > 0) {
						System.out.println("ACIMA:" + matrix[i - 1][j]);
					}

					// ABAIXO
					if (i < n - 1) {
						System.out.println("ABAIXO: " + matrix[i + 1][j]);
					}

					System.out.println("");
					System.out.println("--------------");
				}
					
			
	
				
			}
		}
		
		if(entrou == false) {
			System.out.println("Valor não pertence a matriz");
		}

		input.close();
	}
}
