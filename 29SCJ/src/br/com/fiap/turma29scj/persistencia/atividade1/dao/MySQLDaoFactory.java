package br.com.fiap.turma29scj.persistencia.atividade1.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDaoFactory extends DaoFactory {

		public static final String DRIVER = "com.mysql.jdbc.Driver";
		public static final String URL = "jdbc:mysql://localhost:3306/exercicio1?autoReconnect=true&useSSL=false";

		public static Connection criarConexao() throws Exception{ 
			return DriverManager.getConnection(URL,"root","root");
		}

		public ClienteDao getClienteDao() {
			return new MySQLClienteDao();
		}

		public PedidoDao getPedidoDao() {
			return new MySQLPedidoDao();
		}



}
