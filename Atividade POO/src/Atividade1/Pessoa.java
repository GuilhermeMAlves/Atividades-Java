package Atividade1;

public class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	
	public Pessoa (String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void cartaoVisitas() {
	System.out.println(nome);
	System.out.println("");
	System.out.println(email);
	System.out.println("");
	System.out.println("telefone: "+telefone);
	}
}
