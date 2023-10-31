package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect9MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar?");

		int n = input.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("dados da %d pessoa:", i + 1);
			System.out.println("nome:");
			nome[i] = input.next();
			System.out.println("idade:");
			idade[i] = input.nextInt();

		}

		String nomeMaior = "";
		int idadeMaior = 0;

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > idadeMaior) {
				nomeMaior = nome[i];
				idadeMaior = idade[i];
			}
		}

		
		
		System.out.printf("PESSOA MAIS VELHA: %S , %d anos",nomeMaior,idadeMaior);
		
		input.close();

	}
}
