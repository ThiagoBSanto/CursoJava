
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("QTD OF PRODUCTS ");
		int n = input.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%dº Thing, Value%n ", i + 1);
			input.nextLine();
			System.out.println("Product");
			String name = input.nextLine();
			System.out.println("Value");
			double price = input.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;

		System.out.printf("AVERAGE PRICE %.2f%n", avg);

		input.close();

	}
}