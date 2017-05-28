package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public class Exercicio3 {
	
	public static void main(String args[]) {
		
		for (Cores cor : Cores.values()) {
			System.out.println(cor.getCodigoCor() + " - " + cor.getNomeCor());	
		}
		
		System.out.println(Cores.BRANCO.getCodigoCor());
	
	}

}
