package br.com.fiap.turma29scj.persistencia.atividade1.entity;

import java.util.List;

public class Cliente {

	private int idCliente;
	private String nome;
	private String email;
	private List<Pedido> pedido;

	public Cliente() {

	}

	public Cliente(String nome, String email, List<Pedido> pedido) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
