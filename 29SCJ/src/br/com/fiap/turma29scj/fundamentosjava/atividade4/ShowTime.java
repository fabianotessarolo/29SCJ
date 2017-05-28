package br.com.fiap.turma29scj.fundamentosjava.atividade4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class ShowTime implements Runnable {
	
	public void getDateTime() {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
		System.out.println(now.format(formatter));
	}

	@Override
	public void run() {
		while (true) {			
			getDateTime();
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	

}
