package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public class Aeroporto extends Thread {
	
	private boolean pistaDisponivel = true;
	private String nomeAeroporto;
	
	public Aeroporto(String nomeAeroporto) {
		super();
		this.nomeAeroporto = nomeAeroporto;
		
	}
	
	public synchronized boolean aguardarPistaDisponivel() throws InterruptedException {
		while(!this.pistaDisponivel){
			System.out.println("Torre de Comando: Pista em uso!!");
			wait();
			return false;
		}
		return true;
	}

	
	public void alterarEstadoPista() {
		this.pistaDisponivel = !this.pistaDisponivel;
	}
	

}
