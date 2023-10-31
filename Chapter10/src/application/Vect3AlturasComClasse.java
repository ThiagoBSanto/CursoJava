package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Vect3AlturasComClasse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");
		int n = input.nextInt();

		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %dª pessoa:%n", i + 1);

			System.out.printf("Nome:%n");
			String nome = input.next();

			System.out.println("Idade:");
			int idade = input.nextInt();

			System.out.println("Altura:");
			double altura = input.nextDouble();

			pessoa[i] = new Pessoa(nome, idade, altura);

		}

		double sum = 0;

		for (int i = 0; i < pessoa.length; i++) {
			sum += pessoa[i].getAltura();

		}

		double altura_avg = sum / pessoa.length;

		System.out.printf("Altura média: %.2f", altura_avg);

		double qtd = 0;

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				qtd += 1;

			}

		}

		double percentagem = 100 * (qtd / pessoa.length);

		System.out.printf("%nPessoas com menos de 16 anos: %.2f%% %n", percentagem);

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}

		input.close();

	}
}
