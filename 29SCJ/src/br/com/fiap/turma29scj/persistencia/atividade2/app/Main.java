package br.com.fiap.turma29scj.persistencia.atividade2.app;

import java.util.Date;
import java.util.List;

import javax.persistence.Persistence;

import br.com.fiap.turma29scj.persistencia.atividade2.entity.Clientes;
import br.com.fiap.turma29scj.persistencia.atividade2.entity.Pedidos;
import br.com.fiap.turma29scj.persistencia.atividade2.helper.ClientesHelper;
import br.com.fiap.turma29scj.persistencia.atividade2.helper.PedidosHelper;

public class Main {

	public static void main(String[] args) {

		createData();
		System.out.println("Listagem de Clientes");
		listClientes();
		System.out.println("Seleção de um cliente");
		listOneCliente();
		System.out.println("Listagem de pedidos do cliente 1");
		// listPedidos();

	}

	private static void listPedidos() {
		Clientes cliente = getClienteHelper().findCliente(1);
		List<Pedidos> pedidos = getPedidosHelper().listPedidos(cliente);
		for (Pedidos pedido : pedidos) {
			System.out.println(pedido.getIdPedido() + " - " + pedido.getDescricao());
		}
	}

	public static void createData() {

		Clientes cliente = new Clientes();
		cliente.setNome("Chuck Norris");
		cliente.setEmail("Chuck@Norris.com");

		try {
			System.out.println(getClienteHelper().save(cliente));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Cliente salvo, código: " + cliente.getIdCliente());

		for (int i = 0; i < 10; i++) {
			Pedidos pedido = new Pedidos();
			pedido.setData(new Date());
			pedido.setDescricao("iPhone 8");
			pedido.setValor(5000 * i);
			pedido.setCliente(cliente);

			try {
				getPedidosHelper().save(pedido);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void listClientes() {

		List<Clientes> clientes = getClienteHelper().listClientes();
		for (Clientes cliente : clientes) {
			System.out.println(cliente.getIdCliente() + ": " + cliente.getNome());
		}
	}

	private static void listOneCliente() {

		Clientes cliente = getClienteHelper().findCliente(1);
		System.out.println(cliente.getIdCliente() + " - " + cliente.getNome() + " - " + cliente.getEmail());

	}

	public static void listPedidosCliente() {

	}

	public static ClientesHelper getClienteHelper() {
		return new ClientesHelper(
				Persistence.createEntityManagerFactory("persistenciaExercicio2").createEntityManager());
	}

	public static PedidosHelper getPedidosHelper() {
		return new PedidosHelper(
				Persistence.createEntityManagerFactory("persistenciaExercicio2").createEntityManager());
	}

}
