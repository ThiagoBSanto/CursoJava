package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstanciarDataHora {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		
		LocalDate d01 = LocalDate.now(); // gera uma data
		LocalDateTime d02 = LocalDateTime.now(); // gera uma data e hora local
		Instant d03 = Instant.now(); // gera uma data e hora global, sendo que ela vai para 0 gmt.

		LocalDate d04 = LocalDate.parse("2023-10-26"); // cria uma data com base em uma string
		LocalDateTime d05 = LocalDateTime.parse("2023-10-26T01:30:26"); // cria uma data e hora com base em uma string
		Instant d06 = Instant.parse("2023-10-26T01:30:26Z"); // cria uma data e hora no 0 gmt;
		Instant d07 = Instant.parse("2023-10-26T01:30:26-03:00"); // cria uma data e hora em relacao ao gmt;

		LocalDate d08 = LocalDate.parse("26/10/2023", fmt1);

		LocalDateTime d09 = LocalDateTime.parse("26/10/2023 01:30", fmt2); // cria uma data e hora com base em uma
																			// string

		LocalDate d10 = LocalDate.of(20, 7, 20);// cria data fornecendo os paramentros
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		// Para imprimir com formatos personalizados usado o metodo format
		
		LocalDate d12 = LocalDate.parse("2023-10-26");
		System.out.println("d12 = " + d12);
		System.out.println("AGORA com o format");
		System.out.println("d12 = " + d12.format(fmt1));
		// fazendo com fmt1..
		
		System.out.println("d12 = " + fmt1.format(d12));
		
		
		Instant d13 =  Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("d13 'EM LONDRES..'   " +fmt3.format(d13) );
		
		
		
		
		
		
	}

}

