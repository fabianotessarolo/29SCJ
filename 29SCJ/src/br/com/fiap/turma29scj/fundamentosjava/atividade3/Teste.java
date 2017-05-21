package br.com.fiap.turma29scj.fundamentosjava.atividade3;

public class Teste {

	public static void main(String[] args) {
	
		
	String string = "";
	System.out.println(string.hashCode());
	int z=0;
	for (int i = 0; i < 12; i++) {
	z++;
	string += "string"; 
	System.out.println(string.hashCode());
	}
		
	}
}
