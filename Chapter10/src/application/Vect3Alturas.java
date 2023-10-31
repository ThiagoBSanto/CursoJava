
package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect3Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos pessoas serao digitas?");
		int n = input.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %dª pessoa:%n", i + 1);
			input.nextLine();
			System.out.println("Nome: ");
			nome[i] = input.nextLine();
			System.out.println("Idade: ");
			idade[i] = input.nextInt();
			System.out.println("Altura: ");
			altura[i] = input.nextDouble();
		}

		double altura_sum = 0;

		for (int i = 0; i < altura.length; i++) {

			altura_sum += altura[i];

		}

		double altura_avg = altura_sum / altura.length;

		System.out.printf("Altura média: %.2f.%n", altura_avg);

		double qtd = 0.0;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				qtd += 1;

			}
		}

		double percentagem = 100 * (qtd / idade.length);

		System.out.printf("%nPessoas com menos de 16 anos: %.2f%% %n", percentagem);

		for (int i = 0; i < nome.length; i++) {
			if (idade[i] < 16) {
				System.out.printf("%S %n", nome[i]);
			}
		}

		input.close();

	}
}
