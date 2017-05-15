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
			Exercicio3 ex3 = new Exercicio3();
			ex3.quantosFuncionarios();
			ex3.carregaSalarios();
			ex3.executaCalculo();
			break;
		default:
			break;
		}
		
		
		
	}

}
