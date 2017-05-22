package br.com.fiap.turma29scj.fundamentosjava.atividade3;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private int idade;
	private char sexo;
	private String empresa;
	
	public Pessoa(String nome, int idade, char sexo, String empresa ) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEmpresa(empresa);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public int compareTo(Pessoa o) {
		if (this.nome.compareTo(o.nome) < 0) {
			return -1;
		}
		if (this.nome.compareTo(o.nome) > 0) {
			return 1;
		}
		else return 0;		
	}
}
