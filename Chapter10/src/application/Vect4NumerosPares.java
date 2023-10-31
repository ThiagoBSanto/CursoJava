
package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect4NumerosPares {

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

		int qtd = 0;

		System.out.print("NUMEROS PARES: ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				qtd += 1;
			}
		}

		System.out.printf("%nQUANTIDADE DE PARES = %d",qtd);
			
		
		input.close();

	}
}
