package br.com.fiap.turma29scj.fundamentosjava.atividade2;


import javax.swing.JOptionPane;

public class ExerciciosMain {

	public static void main(String[] args) {
		
		
		int selection = -1;		
		
		while (selection != 0) {
			
			selection = Integer.parseInt(JOptionPane.showInputDialog("Selecione o Exercicio: \n"
					+ "1 - Exercicio 1: Inverter Array\n"
					+ "2 - Exercicio 3: Media Salarial\n"
					+ "3 - Exercicio 4: Calculadora\n"
					+ "4 - Exercicio 5: Fatorial\n"
					+ "0 - Sair"));	
			
			switch (Integer.valueOf(selection)) {
			case 0:
				break;			
			case 1:
				new Calculadora().executa();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Seleção Inválida");
				break;
			}
			
			
			
			
		}
		

		
		
	}

}
