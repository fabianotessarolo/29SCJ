package br.com.fiap.turma29scj.fundamentosjava.atividade2;

import javax.swing.JOptionPane;

public class Calculadora implements CalculadoraBasica {
	

	@Override
	public float somar(float op1, float op2) {
		return (op1+op2);
	}

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
	
	public void executa() {
		String operacao = JOptionPane.showInputDialog("Digite a operação:");
		
		calcular(Float.parseFloat(
					JOptionPane.showInputDialog("Digite o operador 1")),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o operador 2")), 
				operacao);
	}
	
	public void calcular(float op1, float op2, String operacao) {
		if(operacao == "+"){
			System.out.println(somar(op1, op2));
		}
		if(operacao == "-"){
			System.out.println(subtrair(op1, op2));
		}
		if(operacao == "*"){
			System.out.println(multiplicar(op1, op2));
		}
		if(operacao == "/"){
			System.out.println(dividir(op1, op2));
		}
		
	}

}
