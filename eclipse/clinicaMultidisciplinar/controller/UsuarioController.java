package lojaIFPR.controller;

import lojaIFPR.dao.UsuarioDAO;
import lojaIFPR.model.Usuario;


public class UsuarioController {
	
	public void cadastrarUsuario(String nome, String telefone) throws Exception{
		if (nome != null && nome.length() > 0 && telefone != null && telefone.length() > 0) {
			Usuario usuario = new Usuario(nome, telefone);
			usuario.cadastrarUsuario(usuario);
		} else {
			throw new Exception("Preencha os campos corretamente!");
		}
	}
	public Usuario consultarUsuario(String nome) throws Exception{
		if (nome != null && nome.length() > 0) {
			Usuario usuario = new UsuarioDAO().consultarUsuario(nome);
			return usuario;
		} else {
			throw new Exception("Preencha os campos corretamente!");
		}
	}
	public void alterarUsuario(int codCli, String nome, String telefone) throws Exception{
		if (nome != null && nome.length() > 0 && telefone != null && telefone.length() > 0) { 
			Usuario usuario = new Usuario(nome, telefone);
			usuario.setCodCli(codCli);
			usuario.alterarUsuario(usuario);
		} else {
			throw new Exception("Preencha os campos corretamente!");
		}
	}
	
	public void excluirUsuario(int codCli) throws Exception{
		if (codCli > 0) {
			Usuario usuario = new Usuario();
			usuario.excluirUsuario(codCli);
		} else {
			throw new Exception("ID do usuario é inválido!");
		}
	}
}
