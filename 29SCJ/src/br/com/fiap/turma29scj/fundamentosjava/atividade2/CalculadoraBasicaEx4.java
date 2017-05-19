package br.com.fiap.turma29scj.fundamentosjava.atividade2;

public interface CalculadoraBasicaEx4 {
	
	public float somar(float op1, float op2);
	public float subtrair(float op1, float op2);
	public float multiplicar(float op1, float op2);
	public float dividir(float op1, float op2);
	public void calcular(float op1, float op2, String operacao) throws NumberFormatException, OperadorException;

}
