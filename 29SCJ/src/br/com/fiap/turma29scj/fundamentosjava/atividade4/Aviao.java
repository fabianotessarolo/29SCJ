package br.com.fiap.turma29scj.fundamentosjava.atividade4;

import java.util.concurrent.TimeUnit;

public class Aviao extends Thread {
	
	private String nomeDoVoo;
	private Aeroporto aeroporto;
	
	public Aviao(String nomeDoVoo, Aeroporto aeroporto) {
		this.nomeDoVoo = nomeDoVoo;
		this.aeroporto = aeroporto;
	}
	
	public void decolar() throws InterruptedException {
		System.out.println(nomeDoVoo + " pedindo permissao para decolar!");
		aeroporto.aguardarPistaDisponivel();
		System.out.println("Permissão concedida! Decolou o voo " + nomeDoVoo);
	}
	
	public void voar() throws InterruptedException{		
			TimeUnit.SECONDS.sleep(2);
	}
	
	public void aterrisar() throws InterruptedException {
		System.out.println(nomeDoVoo + " pedindo permissao para pousar!");
		aeroporto.aguardarPistaDisponivel();
		System.out.println("Permissão concedida! Pousou o voo " + nomeDoVoo);		
	}
	
	@Override
   	public void run() {
		try {
			decolar();
			voar();
			aterrisar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
