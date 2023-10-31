package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect7AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = input.nextInt();
		double[] vect = new double[n];
		double soma = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = input.nextDouble();
			soma += vect[i];
		}
		double media = soma/vect.length;
		
		System.out.printf("%nMEDIA DO VETOR: %.3f%n",media );
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i]<media) {
				System.out.println(vect[i]);
			}
			
		}

		input.close();

	}
}
