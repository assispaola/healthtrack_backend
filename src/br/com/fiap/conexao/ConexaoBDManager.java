package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
<<<<<<< HEAD

public class ConexaoBDManager {
	
=======


public class ConexaoBDManager {

>>>>>>> 2dd897ad0bb0260891c825eb57d0801d97d65202
	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
<<<<<<< HEAD
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85650", "111193");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
		
=======
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85217","080494");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return conexao;
>>>>>>> 2dd897ad0bb0260891c825eb57d0801d97d65202
	}
	
}
