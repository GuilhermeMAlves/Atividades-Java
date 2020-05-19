package Atividade2;

public class Pessoa {
	private String nome;
	private int anoNascimento;

	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void calculaIdade() {
		System.out.println(getNome()+", sua idade é de "+(2020-getAnoNascimento())+" anos.");
	}

	public void calculaIdade50() {
		System.out.println(getNome()+", sua idade daqui a 50 anos será "+(2020-getAnoNascimento()+50)+" anos.");
	}
}