package lojaIFPR.model;

import lojaIFPR.dao.UsuarioDAO;
import lojaIFPR.dao.ExceptionDAO;

public class Usuario {
	private int codUser;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String rg;
	private String telefone;
	private Email email;
	private String endereco;

	public int getCodUser() {
		return codUser;
	}

	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void cadastrarUsuario(Usuario usuario) throws ExceptionDAO{
		new UsuarioDAO().cadastrarUsuario(usuario);
	}

	public void alterarUsuario(Usuario usuario) throws ExceptionDAO{
		new UsuarioDAO().alterarUsuario(usuario);
	}
	
	public void excluirUsuario(int codUser) throws ExceptionDAO{
		new UsuarioDAO().excluirUsuario(codUser);
	}
}
