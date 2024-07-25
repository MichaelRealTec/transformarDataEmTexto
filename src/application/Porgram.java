package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Porgram {

	public static void main(String[] args) {
		// exercicio data hora - 02
		// Transformar data em texto no formato ISO 8601 ou no formato customizado

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());	
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // ISO_DATE_TIME = uma data local e não tem fuso horário
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("d04 = " + d04.format(fmt1)); // Agora é formatado para String ou para texto no formato customizado "fmt1" dia/mes/ano
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		System.out.println("d05 = " + d05);
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		
		System.out.println();
		System.out.println("d06 = " + d06);
		System.out.println("d06 = " + fmt3.format(d06)); // data e horário com o fuso horário local do meu computador
		System.out.println("d06 = " + fmt5.format(d06)); 
		System.out.println("d06 = " + d06.toString()); 
		
		sc.close();
	}

}
