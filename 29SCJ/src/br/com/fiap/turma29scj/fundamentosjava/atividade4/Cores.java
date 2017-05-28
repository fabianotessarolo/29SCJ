package br.com.fiap.turma29scj.fundamentosjava.atividade4;

public enum Cores {
	BRANCO(21,"Branco"),
	PRETO(22,"Preto"),
	VERMELHO(23,"Vermelho"),
	AMARELO(24,"Amarelo"),
	AZUL(25,"Azul");
	
	private int codigoCor;
	private String nomeCor;

	Cores(int codigoCor, String nomeCor) {
		this.codigoCor = codigoCor;
		this.nomeCor = nomeCor;
	}

	public int getCodigoCor() {
		return codigoCor;
	}

	public String getNomeCor() {
		return nomeCor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
