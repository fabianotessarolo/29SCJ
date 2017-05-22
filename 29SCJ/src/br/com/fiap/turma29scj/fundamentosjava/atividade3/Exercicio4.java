package br.com.fiap.turma29scj.fundamentosjava.atividade3;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio4 {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> arrayList = new ArrayList<>();
		
		arrayList.add(new Pessoa("Joao Garcia", 20, 'M', "AIK Enterprises"));
		arrayList.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		arrayList.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		arrayList.add(new Pessoa("Inacio Luis", 33, 'M', "Magazine André"));
		arrayList.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
		
		
		System.out.println("Resposta A:");
		Collections.shuffle(arrayList);
		System.out.println(arrayList.get(0).getNome());
		arrayList.remove(0);
		System.out.println("\n");
		
		Collections.sort(arrayList); 
		System.out.println("Resposta B:");
		for (Pessoa pessoa : arrayList) {
			System.out.println(pessoa.getNome());
		};
		System.out.println("\n");
		System.out.println("Resposta C:");
		Collections.reverse(arrayList);
		for (Pessoa jose : arrayList) {
			System.out.println(jose.getNome());
		};
		
	}

}
