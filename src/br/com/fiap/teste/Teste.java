package br.com.fiap.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		List<Usuario> lista = dao.listarTodos();
		
		Usuario user = new Usuario();
		user.setDsEmail("assispaola.dev@gmail.com");
		user.setDsSenha("111193");
//		user.setDtCadastro(Calendar.getInstance());
		String data = "01/02/2020";                                
        Date dataf = parser.parse(data);            
        java.sql.Date dataSql = new java.sql.Date(dataf.getTime());
        user.setDtNascimento(dataSql);
        
        String data2 = "01/02/2020";                                
        Date dataf2 = parser.parse(data2);            
        java.sql.Date dataSql2 = new java.sql.Date(dataf2.getTime());
        user.setDtCadastro(dataSql2);
        dao.cadastrar(user); 
		System.out.println("Cadastrei...");
		
		
		
		
		for (Usuario usuario: lista) {
			
			System.out.println(usuario.getIdUsuario() + " E-mail:" + usuario.getDsEmail() + " Senha: " + usuario.getDsSenha() + " Dt nasc: " 
			+ parser.format(usuario.getDtNascimento()) + " Dt cadastro: " + parser.format(usuario.getDtCadastro()));
		}
		
	}
		
		
}
