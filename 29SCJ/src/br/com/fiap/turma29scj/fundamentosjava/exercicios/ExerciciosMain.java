package br.com.fiap.turma29scj.fundamentosjava.exercicios;


import javax.swing.JOptionPane;

public class ExerciciosMain {

	public static void main(String[] args) {
		
		
		
		int selection = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Exercicio, 0 para sair"));
		
		
		switch (Integer.valueOf(selection)) {
		case 1:
			new Exercicio1().reverse();
			break;
		case 2:
			new Exercicio3().executa();
			break;
		default:
			break;
		}
		
		
		
	}

}
