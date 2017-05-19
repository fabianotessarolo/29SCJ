package br.com.fiap.turma29scj.fundamentosjava.atividade1;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	
	
	public void calculaFatorial(){
		int fatorial = 1;
		int x = Integer.parseInt(
					JOptionPane.showInputDialog(
						"Digite um numero para que seja calculado seu fatorial:"));
		int xOriginal = x;
		while (x > 1) {
			fatorial *= x;
			x--;			
		}	
				
		JOptionPane.showMessageDialog(null, "O fatorial de " + xOriginal + " é " + fatorial);
		
	}
	
	
	

}
