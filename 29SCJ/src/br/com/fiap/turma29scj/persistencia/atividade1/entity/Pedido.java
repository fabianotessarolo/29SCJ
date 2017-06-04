package br.com.fiap.turma29scj.persistencia.atividade1.entity;

import java.util.Date;

public class Pedido {

	private int idPedido;
	private int idCliente;
	private Date data;
	private String descricao;
	private double valor;

	public Pedido() {
	}

	public Pedido(Date data, String descricao, double valor, int idPedido, int idCliente) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.idPedido=idPedido;
		this.idCliente=idCliente;
	}
	public Pedido(Date data, String descricao, double valor, int idCliente) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		this.idCliente=idCliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
