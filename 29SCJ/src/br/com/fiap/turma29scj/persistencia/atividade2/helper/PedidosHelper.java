package br.com.fiap.turma29scj.persistencia.atividade2.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.turma29scj.persistencia.atividade2.entity.Clientes;
import br.com.fiap.turma29scj.persistencia.atividade2.entity.Pedidos;

public class PedidosHelper {

	private EntityManager em;

	public PedidosHelper(EntityManager em) {
		this.em = em;

	}

	public Pedidos save(Pedidos pedido) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(pedido);
			em.getTransaction().commit();
			return pedido;
		} catch (Exception e) {
			throw e;
		} finally {
			em.close();
		}

	}

	public List<Pedidos> listPedidos(Clientes cliente) {
		TypedQuery<Pedidos> tQuery = em.createQuery("select f from Pedidos f where IDCLIENTE = :cliente", Pedidos.class);
		tQuery.setParameter("cliente", cliente);
		return tQuery.getResultList();
	}

	public Pedidos findPedido(int idPedido) {
		TypedQuery<Pedidos> tQuery = em.createQuery("select f from Pedidos f where IDPEDIDO = :idPedido",
				Pedidos.class);
		tQuery.setParameter("idPedido", idPedido);
		return tQuery.getSingleResult();

	}

}
