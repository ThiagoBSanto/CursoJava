
package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect1Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = input.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = input.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}

		}

		input.close();

	}
}
