package br.com.fiap.turma29scj.persistencia.atividade1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.turma29scj.persistencia.atividade1.entity.Cliente;
import br.com.fiap.turma29scj.persistencia.atividade1.entity.Pedido;

public class MySQLClienteDao implements ClienteDao {
	
	Connection cn = null;
	PreparedStatement stmt;
	ResultSet rs = null;

	@Override
	public Cliente inserirCliente(Cliente cliente) throws Exception {
		try {
			cn = MySQLDaoFactory.criarConexao();
			stmt = cn.prepareStatement("INSERT INTO clientes (NOME, EMAIL) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, cliente.getNome()); 
			stmt.setString(2, cliente.getEmail());
			stmt.executeUpdate();
			
			rs = stmt.getGeneratedKeys();
			while (rs.next()){
				cliente.setIdCliente(rs.getInt(1));
			}
		} catch (Exception e) { 
			throw e;
		} finally { 
			cn.close();
			if (stmt != null) stmt.close();
		} 
		return cliente;
	}

	@Override
	public Cliente buscarCliente(int id) throws Exception {
		Cliente cliente = null;
		List<Pedido> pedidos = new ArrayList<>();

		try {
			cn=MySQLDaoFactory.criarConexao();
			String sql="SELECT IDPEDIDO,DATA,DESCRICAO,VALOR FROM PEDIDOS WHERE IDCLIENTE=?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()){
				pedidos.add(new Pedido(rs.getDate("DATA"),rs.getString("DESCRICAO"), rs.getDouble("VALOR"),
						rs.getInt("IDCLIENTE"), id));
			}

			sql="SELECT NOME,EMAIL FROM CLIENTES WHERE ID=?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()){
				cliente = new Cliente(rs.getString("NOME"), rs.getString("EMAIL"), pedidos);
			}

		} catch (Exception e) {
			throw e;
		}
		finally{
			cn.close();
			stmt.close();
			if (stmt != null) stmt.close();
			if (rs != null) rs.close();
		}

		return cliente;
	}

}
