package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect10Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos alunos serao digitados?");

		int n = input.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			input.nextLine();
			nome[i] = input.nextLine();
			nota1[i] = input.nextDouble();
			nota2[i] = input.nextDouble();

			media[i] = (nota1[i] + nota2[i]) / 2;
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < media.length; i++) {
			if (media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}

		input.close();

	}
}
