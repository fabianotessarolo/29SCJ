package br.com.fiap.turma29scj.fundamentosjava.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
	

	
	private double soma(double x, double y) {
		return (x+y);
		
	}
	
	private double subtracao(double x, double y) { 
		return (x-y);
		
	}
	
	private double multiplicacao(double x, double y) {
		return (x*y);
		
	}
	
	private double divisao(double x, double y) {
		return (x/y);
	}
	
	
	public double calcula(String operacao, double x, double y) {
		switch (operacao) {
		case "+":
			return soma(x, y);
		case "-":
			return subtracao(x, y);
		case "*":
			return multiplicacao(x, y);
			
		case "/":
			return divisao(x, y);
		default:
			JOptionPane.showInputDialog("Operaçao Inválida!");
			return 0;
			
		}
		
	}
	
	public void executa() {
		String operacao = JOptionPane.showInputDialog("Qual a operaçao desejada? (+,-,/ ou *)");
		JOptionPane.showMessageDialog(null,"O resultado da operação é " + 
				calcula(operacao,
						Double.parseDouble(JOptionPane.showInputDialog("Digite o operando A")),
						Double.parseDouble(JOptionPane.showInputDialog("Digite o operando B"))
						)
				);
		
		
		
		
	}

}
