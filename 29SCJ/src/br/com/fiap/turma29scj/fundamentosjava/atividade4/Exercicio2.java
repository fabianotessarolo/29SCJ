package br.com.fiap.turma29scj.fundamentosjava.atividade4;

import java.util.concurrent.TimeUnit;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Congonhas");
		
		
		Thread aviao1 = new Thread(new Aviao("TAN 123",aeroporto));
		Thread aviao2 = new Thread(new Aviao("OLE 111",aeroporto));
		Thread aviao3 = new Thread(new Aviao("LINHA 222",aeroporto));		
		
		aviao1.start();
		aviao2.start();
		aviao3.start();
	
		
		while(true) {
			aeroporto.alterarEstadoPista();
			aeroporto.notify();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	
	
	}
	

}
