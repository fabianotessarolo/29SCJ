package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Congonhas");
		
		
		Aviao aviao1 = new Aviao("TAN 123",aeroporto);
		Aviao aviao2 = new Aviao("OLE 111",aeroporto);
		Aviao aviao3 = new Aviao("LINHA 222",aeroporto);		
		
		aeroporto.start();
		aviao1.start();
		aviao2.start();
		aviao3.start();
	
	
	}
	

}
