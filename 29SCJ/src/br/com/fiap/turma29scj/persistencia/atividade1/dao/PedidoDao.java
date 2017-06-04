package br.com.fiap.turma29scj.persistencia.atividade1.dao;

import java.util.List;

import br.com.fiap.turma29scj.persistencia.atividade1.entity.Pedido;

public interface PedidoDao {

		Pedido incluirPedido(Pedido pedido) throws Exception; 
		List<Pedido> listarPedidos(int idCliente) throws Exception;
}
