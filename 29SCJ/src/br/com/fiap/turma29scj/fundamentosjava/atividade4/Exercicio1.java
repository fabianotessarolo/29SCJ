package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public class Exercicio1 {

	public static void main(String[] args) {
		

		Thread t1 = new Thread(new ShowTime());
		Thread t2= new Thread(new ShowMessage());
		
		t1.start();
		t2.start();
		
		while (true) {						
			System.out.println("Thread I estado: " + t1.getState());
			System.out.println("Thread II estado: " + t2.getState());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	
}
