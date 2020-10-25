package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		List<Usuario> lista = dao.listarTodos();
		
		for (Usuario usuario: lista) {
			
			System.out.println(usuario.getIdUsuario() + " E-mail:" + usuario.getDsEmail() + " Senha: " + usuario.getDsSenha());
		}
	}

}
