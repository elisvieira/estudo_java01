package entities;

public class Pessoa {

	private Integer idpessoa;
	private String nome;
	private String email;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idpessoa, String nome, String email) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.email = email;
	}

	public Integer getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [idpessoa=" + idpessoa + ", nome=" + nome + ", email=" + email + "]";
	}

	

}
