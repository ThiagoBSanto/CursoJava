package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect5MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos numeros vc vai digitar?");
		int n = input.nextInt();

		double[] vect = new double[n];

		double maior =0;
		int posicao = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero");
			vect[i] = input.nextDouble();
			if (i == 0) {
				maior = vect[0];
				posicao = 0;
			} else {
				if (vect[i] > vect[posicao]) {
					maior = vect[i];
					posicao = i;
				}
			}
		}
		
		System.out.printf("%nMAIOR VALOR = %.2f%n",maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d",posicao+1);

		input.close();

	}
}
