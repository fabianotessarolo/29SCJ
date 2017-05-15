

import javax.swing.JOptionPane;

public class Exercicio3 {

	private int quantosFuncionarios;
	private double salarios [];
	private double media;
	
	public void quantosFuncionarios() {
		this.quantosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários:"));
		this.salarios = new double [quantosFuncionarios];
	}
	
	public void carregaSalarios() {
		for (double d : salarios) {
			d = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario: "));
		}
	}
	
	public void executaCalculo() {
		for (double d : salarios) {
			this.media = this.media + d;
		}
		
		JOptionPane.showMessageDialog(null, "A media salarial é de " + (this.media / this.quantosFuncionarios));
		
		
		
	}
	
	
	
	

}
