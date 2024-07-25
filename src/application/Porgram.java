package application;

import java.util.Locale;
import java.util.Scanner;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Porgram {

	public static void main(String[] args) {
		// exercicio data hora - 02
		// Transformar data em texto no formato ISO 8601 ou no formato customizado

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/M/yyyy");
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("d04 = " + d04.format(fmt1)); // Agora é formatado para String ou para texto no formato customizado "fmt1" dia/mes/ano
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		
		
		sc.close();
	}

}
