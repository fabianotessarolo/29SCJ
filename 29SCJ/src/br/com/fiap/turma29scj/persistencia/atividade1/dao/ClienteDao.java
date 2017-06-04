package br.com.fiap.turma29scj.persistencia.atividade1.dao;

import br.com.fiap.turma29scj.persistencia.atividade1.entity.Cliente;

public interface ClienteDao {
	
		Cliente inserirCliente(Cliente cliente) throws Exception;
		Cliente buscarCliente(int id) throws Exception;
}
