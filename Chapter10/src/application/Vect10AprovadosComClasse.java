package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Vect10AprovadosComClasse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados?");
		int n = input.nextInt();
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			double altura = input.nextDouble();

			System.out.printf("Gênero da %dª pessoa: ", i + 1);
			String genero = input.next();

			pessoa[i] = new Pessoa(altura, genero);
		}

		double menorAltura = Double.MAX_VALUE;
		double maiorAltura = Double.MIN_VALUE;
		double somaAlturaMulheres = 0;
		int qtdHomens = 0;

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getGenero().equals("F")) {
				somaAlturaMulheres += pessoa[i].getAltura();
			} else {
				qtdHomens++;
			}

			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
			if (pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
		}

		double mediaMulheres = somaAlturaMulheres / (n - qtdHomens);

		System.out.println("Menor Altura = " + menorAltura);
		System.out.println("Maior Altura = " + maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Número de homens = " + qtdHomens);

		input.close();
	}
}
