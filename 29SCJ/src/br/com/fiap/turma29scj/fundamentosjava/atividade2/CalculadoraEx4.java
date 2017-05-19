package br.com.fiap.turma29scj.fundamentosjava.atividade2;

import javax.swing.JOptionPane;

public class CalculadoraEx4 implements CalculadoraBasicaEx4 {
	

	@Override
	public float subtrair(float op1, float op2) {
		return (op1-op2);
	}

	@Override
	public float multiplicar(float op1, float op2) {
		return (op1*op2);
	}

	@Override
	public float dividir(float op1, float op2) {
		return (op1/op2);
	}
	
	@Override
	public float somar(float op1, float op2) {
		return (op1+op2);
	}
	
	public void executa() throws OperadorException {
		String operacao = JOptionPane.showInputDialog("Digite a operação:");
		
		calcular(Float.parseFloat(
					JOptionPane.showInputDialog("Digite o operador 1")),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o operador 2")), 
				operacao);
	}
	
	public void calcular(float op1, float op2, String operacao) throws NumberFormatException, OperadorException {
	
		if(op1 == 0) {
			throw new OperadorException("O operador 1 não pode ser igual a zero!");
		}
	
		if(operacao.equals("+")){
			System.out.println(somar(op1, op2));			
			if(operacao.equals("-")){
			System.out.println(subtrair(op1, op2));
				if(operacao.equals("*")){
			System.out.println(multiplicar(op1, op2));
					if(operacao.equals("/")){
			System.out.println(dividir(op1, op2));
					}
				}
			}
		}				
	}

	

}
