package br.com.fiap.turma29scj.persistencia.atividade1.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.turma29scj.persistencia.atividade1.dao.ClienteDao;
import br.com.fiap.turma29scj.persistencia.atividade1.dao.DaoFactory;
import br.com.fiap.turma29scj.persistencia.atividade1.dao.PedidoDao;
import br.com.fiap.turma29scj.persistencia.atividade1.entity.Cliente;
import br.com.fiap.turma29scj.persistencia.atividade1.entity.Pedido;

public class Main {

	public static void main(String[] args) {

		try {

			ClienteDao clientesDao = DaoFactory.getDaoFactory(DaoFactory.MYSQL).getClienteDao();

			List<Pedido> listaPedidos = new ArrayList<>();

			Cliente cliente = new Cliente();
			cliente.setNome("Joaquim Ursolino");
			cliente.setEmail("Jo@urso.com");
			cliente = clientesDao.inserirCliente(cliente);
			
			System.out.println("Cliente inserido: \r" + cliente.getIdCliente() + " | " + 
							cliente.getNome() + " | " + cliente.getEmail());
			
			System.out.println("------------------------------------");

			PedidoDao pedidosDao = DaoFactory.getDaoFactory(DaoFactory.MYSQL).getPedidoDao();

			for (int i = 0; i < 10; i++) {
				
				Pedido pedido = new Pedido();
				pedido.setData(new Date());
				pedido.setDescricao("Computador 486 DX2 [" + i + "]" );
				pedido.setValor(30_000);
				pedido.setIdCliente(cliente.getIdCliente());
				pedidosDao.incluirPedido(pedido);
				
				System.out.println("Pedido inserido! Código: " + pedido.getIdPedido());
				
			}
									
			System.out.println("------------------------------------");
			
			System.out.println("Veja abaixo os pedidos do cliente " + cliente.getNome());

			listaPedidos = pedidosDao.listarPedidos(cliente.getIdCliente());
			for (Pedido pedidos : listaPedidos) {
				System.out.println(pedidos.getDescricao());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
