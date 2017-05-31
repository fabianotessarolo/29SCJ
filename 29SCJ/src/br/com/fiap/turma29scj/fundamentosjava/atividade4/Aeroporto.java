package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public class Aeroporto extends Thread {
	
	private boolean pistaDisponivel = true;
	private String nomeAeroporto;
	
	public Aeroporto(String nomeAeroporto) {
		super();
		this.nomeAeroporto = nomeAeroporto;
		
	}
	
	
	
	public String getNomeAeroporto() {
		return nomeAeroporto;
	}



	public synchronized void aguardarPistaDisponivel() {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	public synchronized void alterarEstadoPista() {
		this.pistaDisponivel = !this.pistaDisponivel;
		if(pistaDisponivel){
   			System.out.println("Torre de comando: Pista disponível!");
   	   		notify();
   		}else{
   			System.out.println("Torre de comando: Pista Fechada");
   		}   	
		
	}
	
	@Override
   	public void run() {
   		while(true){
   			alterarEstadoPista();
   			
			try{
				sleep(3_000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
   		}
   	}
	

}
