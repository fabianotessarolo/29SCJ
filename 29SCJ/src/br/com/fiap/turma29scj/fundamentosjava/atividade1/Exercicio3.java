package br.com.fiap.turma29scj.fundamentosjava.atividade1;


import javax.swing.JOptionPane;

public class Exercicio3 {

	private int quantosFuncionarios;
	private double salarios [];
	private double media;
	
	
	public void executa() {
		quantosFuncionarios();
		carregaSalarios();
		executaCalculo();						
	}
	
	public void quantosFuncionarios() {
		quantosFuncionarios = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de funcionários:"));
		salarios = new double [quantosFuncionarios];
	}
	
	public void carregaSalarios() {
		for (int i = 0; i < salarios.length; i++) {
			salarios[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o salario numero "+ (i+1) +" :"));
		}
	}
	
	public void executaCalculo() {
		for (double d : salarios) {
			media = media + d;
		}
		JOptionPane.showMessageDialog(null, "A media salarial é de " + (media / quantosFuncionarios));						
	}
}
