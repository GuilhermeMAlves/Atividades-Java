package Atividade2;

import java.util.Scanner;

public class idadeDaPessoa {

	public static void main(String[] args) {
		String nome;
		int anoNascimento;
		Scanner inTexto = new Scanner(System.in);
		Scanner inNumero = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("",0);

		System.out.println("Informe o nome: ");
		nome = inTexto.nextLine();
		pessoa.setNome(nome);
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = inNumero.nextInt();
		pessoa.setAnoNascimento(anoNascimento);

		pessoa.calculaIdade();
		pessoa.calculaIdade50();
	}

}
