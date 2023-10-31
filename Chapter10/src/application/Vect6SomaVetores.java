package application;

import java.util.Locale;
import java.util.Scanner;

public class Vect6SomaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor?");
		int n = input.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Digite os valores do vetor A:");
			vectA[i] = input.nextInt();
		}

		for (int i = 0; i < vectB.length; i++) {
			System.out.println("Digite os valores do vetor B:");
			vectB[i] = input.nextInt();
			vectC[i] = vectA[i] + vectB[i];
		}
		
		for(int i = 0; i < vectC.length; i++){
			System.out.println(vectC[i]);
		}

		input.close();

	}
}
