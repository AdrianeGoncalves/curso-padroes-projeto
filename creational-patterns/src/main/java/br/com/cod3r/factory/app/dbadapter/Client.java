package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {
		PostgresDBFactory postgresDBFactory = new PostgresDBFactory();
		OracleDBFactory oracleDBFactory = new OracleDBFactory();

		DB db1 = postgresDBFactory.getDatabase();
		DB db2 = oracleDBFactory.getDatabase();

		db1.query("teste");
		db2.update("teste");
	}
}
