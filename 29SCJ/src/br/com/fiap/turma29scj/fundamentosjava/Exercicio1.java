package br.com.fiap.turma29scj.fundamentosjava;


import javax.swing.JOptionPane;

public class Exercicio1 {
	
	

	public void reverse() {
		
	    int [] vetorA = new int[3];
		int [] vetorB = new int[vetorA.length];
		
		int j=vetorB.length - 1;
		
		String s = "{";
		StringBuilder strBuilder = new StringBuilder(s);
		
		int i=0;
		while (i < vetorA.length ) {			
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i+1)  ));
			vetorB[j] = vetorA[i];
			i++;
			j--;
		}
		
		int l = 1;
		for (int k : vetorB) {	
			if (l++ != vetorB.length) {
				strBuilder.append(k + ", ");
			}
			else {			
				strBuilder.append(k + "}");				
			}
		}
		
		JOptionPane.showMessageDialog(null,"O resultado é\n" + strBuilder);
		
	}
	
	

}
