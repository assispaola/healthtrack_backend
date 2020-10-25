package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBDManager {
	

	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
<<<<<<< HEAD
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86283","220402");
		} catch (Exception e) {
=======
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85217", "080494");
		} catch(Exception e) {
>>>>>>> 309ecb8c5c9fe6c784fead2458c92177f25eefd8
			e.printStackTrace();
		}
		
		return conexao;
		
	}
	
}
