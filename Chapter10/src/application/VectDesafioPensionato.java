package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class VectDesafioPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos fizeram a reserva?");
		int n = input.nextInt();

		Product[] quartos = new Product[n];
		input.nextLine(); // Consumir a quebra de linha após o próximoInt

		for (int i = 0; i < n; i++) {

			System.out.print("Informe o nome:\n");
			String nome = input.nextLine();

			System.out.print("Informe o email:\n");
			String email = input.nextLine();

			System.out.print("Informe o quarto de 1 a 10\n");
			int room = input.nextInt();
			input.nextLine(); // Consumir a quebra de linha após o próximoInt

			quartos[i] = new Product(nome, email, room);

		}
		
		System.out.println("QUARTO OCUPADOS:");
		
		for (int i = 0; i < n; i++) {

			if (quartos[i].getName() != null)

				System.out.println("");
				System.out.println("------------------------------------");
				System.out.printf("QUARTO: %d%n", quartos[i].getRoom() + 1);
				System.out.println("------------------------------------");
				System.out.println("Nome: " + quartos[i].getName());
				System.out.println("Email: " + quartos[i].getEmail());
				System.out.println("------------------------------------");
		}

		input.close();
	}
}
