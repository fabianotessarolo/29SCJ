package br.com.fiap.turma29scj.fundamentosjava.atividade3;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String args[]) {
		
		LocalDateTime dateTime = LocalDateTime.of(2012,Month.SEPTEMBER,10,12,00);
		System.out.println("Resposta A: "
				+ DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm").format(dateTime));
		System.out.println("Resposta B: "
				+ DateTimeFormatter.ofPattern("dd-MM-YY hh:mm:ss").format(dateTime));
		System.out.println("Resposta C: "
				+ DateTimeFormatter.ofPattern("E").format(dateTime));
		System.out.println("Resposta D: "
				+ DateTimeFormatter.ofPattern("YYYY").format(dateTime));
		System.out.println("Resposta E: "
				+ DateTimeFormatter.ofPattern("G").format(dateTime));
		
	}
	
	
}
