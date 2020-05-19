package Atividade1;

public class CartaoVisitas {

	public static void main(String[] args) {
		String nome="Maria dos Santos";
		String email="maria@gmail.com";
		String telefone="2255-9999";
		
		Pessoa pessoaum = new Pessoa(nome, email, telefone);
		pessoaum.cartaoVisitas();
	}

}
