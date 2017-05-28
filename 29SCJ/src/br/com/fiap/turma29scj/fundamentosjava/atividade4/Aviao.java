package br.com.fiap.turma29scj.fundamentosjava.atividade4;

import java.util.concurrent.TimeUnit;

public class Aviao extends Thread {
	
	private String nomeDoVoo;
	private Aeroporto aeroporto;
	private boolean emRota = false;
	
	public Aviao(String nomeDoVoo, Aeroporto aeroporto) {
		super();
		this.nomeDoVoo = nomeDoVoo;
		this.aeroporto = aeroporto;
	}
	
	public void decolar() throws InterruptedException {
		System.out.println(nomeDoVoo + " pedindo permissao para decolar!");
		aeroporto.aguardarPistaDisponivel();
		System.out.println("Permissão concedida! Decolou o voo " + nomeDoVoo);
		emRota = true;
	}
	
	public void voar() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
	}
	
	public void aterrisar() throws InterruptedException {
		System.out.println(nomeDoVoo + " pedindo permissao para pousar!");
		aeroporto.aguardarPistaDisponivel();
		System.out.println("Permissão concedida! Pousou o voo " + nomeDoVoo);
		emRota = true;
		
		
		
	} 
	
	
	public void run() {
		
		try {
			this.decolar();
			this.voar();
			this.aterrisar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
