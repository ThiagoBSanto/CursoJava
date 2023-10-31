package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Vect9MaisVelhoComClasse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas voc digitar?");
		int n = input.nextInt();
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d pessoa", i + 1);

			System.out.printf("Nome:%n");
			String nome = input.next();

			System.out.println("Idade:");
			int idade = input.nextInt();

			pessoa[i] = new Pessoa(nome, idade);

		}

		String nomeMaisVelho = "";
		int idadeMaisVelho = 0;

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() > idadeMaisVelho) {
				nomeMaisVelho = pessoa[i].getNome();
				idadeMaisVelho = pessoa[i].getIdade();
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %S , %d anos",nomeMaisVelho,idadeMaisVelho);
		
		input.close();

	}
}
