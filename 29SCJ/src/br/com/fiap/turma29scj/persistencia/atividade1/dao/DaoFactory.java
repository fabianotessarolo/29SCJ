package br.com.fiap.turma29scj.persistencia.atividade1.dao;

public abstract class DaoFactory {
	
		public static final int MYSQL = 1; 
		public static final int SQLSERVER = 2;

		
		public abstract ClienteDao getClienteDao(); 
		public abstract PedidoDao getPedidoDao();

		public static DaoFactory getDaoFactory(int tipo){ 

			switch(tipo){
				case MYSQL: return new MySQLDaoFactory();
				//case SQLSERVER: return new SqlServerDaoFactory(); 
				default: return null;
			}
		} 
	
	
	

}
