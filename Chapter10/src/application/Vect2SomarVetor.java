
package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect2SomarVetor {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quanto numeros voce vai digitar?");
		int n = input.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = input.nextDouble();

		}

		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + "  ");

		}

		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}

		System.out.printf("%nSoma = %.2f%n", sum);

		double avg = sum / vect.length;

		System.out.printf("MEDIA : %.2f%n", avg);

		input.close();

	}
}