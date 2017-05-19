package br.com.fiap.turma29scj.fundamentosjava.atividade1;


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
				new Exercicio1().reverse();
				break;
			case 2:
				new Exercicio3().executa();
				break;
			case 3:
				new Exercicio4().executa();
				break;
			case 4:
				new Exercicio5().calculaFatorial();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Seleção Inválida");
				break;
			}
			
			
			
			
		}
		

		
		
	}

}
