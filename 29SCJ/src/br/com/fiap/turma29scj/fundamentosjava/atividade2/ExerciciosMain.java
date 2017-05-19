package br.com.fiap.turma29scj.fundamentosjava.atividade2;


import javax.swing.JOptionPane;

public class ExerciciosMain {

	public static void main(String[] args) {
		
		
		int selection = -1;		
		
		while (selection != 0) {
			
			selection = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Exercicio: \n"
					+ "1 - Exercicio 1: Calculadora sem Throw\n"
					+ "2 - Exercicio 2: Calculadora com Throw\n"
					+ "0 - Sair"));	
			
			switch (Integer.valueOf(selection)) {
			case 0:
				break;
			case 1:
					new CalculadoraEx1().executa();
				break;
			case 2:
				try {
					new CalculadoraEx4().executa();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Entrada inválida");
				}
				  catch (OperadorException e) {
					  JOptionPane.showMessageDialog(null, e);
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Seleção Inválida");
				break;
			}											
		}		
	}

}
