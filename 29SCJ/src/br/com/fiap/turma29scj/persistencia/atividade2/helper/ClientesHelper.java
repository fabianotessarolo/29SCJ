package br.com.fiap.turma29scj.persistencia.atividade2.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.turma29scj.persistencia.atividade2.entity.Clientes;

public class ClientesHelper {
	
	private EntityManager em;
	
	public ClientesHelper (EntityManager em) {
		this.em = em;
		
	}
	
	public Clientes save(Clientes cliente) throws Exception {
		try {
			em.getTransaction().begin(); 
			em.persist(cliente); 
			em.getTransaction().commit();
			return cliente;
		} 
		catch (Exception e) {
			throw e;
		} finally { 
			em.close();
		} 
		
	}
	
	
	public List<Clientes> listClientes(){
		TypedQuery<Clientes> tQuery = em.createQuery("select f from Clientes f", Clientes.class); 
		return tQuery.getResultList();
	}
	
	public Clientes findCliente(int idCliente){
		TypedQuery<Clientes> tQuery = em.createQuery("select f from Clientes f where IDCLIENTE = :idCliente", Clientes.class);
		tQuery.setParameter("idCliente", idCliente); 
		return tQuery.getSingleResult(); 
		
	}
}
