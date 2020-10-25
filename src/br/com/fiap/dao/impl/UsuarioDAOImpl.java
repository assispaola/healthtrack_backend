package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	private Connection conexao;
	
	@Override
	public List<Usuario> listarTodos() {
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_USUARIO";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idUsuario = rs.getInt("ID_USUARIO");
				String dsSenha = rs.getString("DS_SENHA");
				String dsEmail = rs.getString("DS_EMAIL");
				Date dtNascimento = rs.getDate("DT_NASCIMENTO");
				Date dtCadastro = rs.getDate("DT_CADASTRO");
				
				Usuario usuario = new Usuario(idUsuario, dsSenha, dsEmail, dtNascimento, dtCadastro);
				lista.add(usuario);
			}
						
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			}catch(SQLException e) {
				e.printStackTrace(); 
			}
		}
		return lista;
	}

	@Override
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarPorId(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
