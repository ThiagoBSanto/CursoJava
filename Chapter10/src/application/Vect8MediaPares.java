package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect8MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quanto elementos vai o vetor?");
		int n = input.nextInt();

		int[] vect = new int[n];

		int somaPares = 0;
		int qtd = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = input.nextInt();
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				qtd += 1;
			}

		}

		if (somaPares > 0) {
			double mediaPares = somaPares / qtd;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);

		}else {
			System.out.println("NENHUM NUMERO PAR");
		}

		input.close();

	}
}
