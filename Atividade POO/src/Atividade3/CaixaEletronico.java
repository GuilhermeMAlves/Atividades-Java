package Atividade3;

import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		int opcao = 1, confirmacao=0;
		String numAgencia, numConta;
		double saldo, deposito, saque;
		Scanner inTexto = new Scanner(System.in);
		Scanner inNumero = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente("","",0);

		System.out.println("Informe o n�mero da ag�ncia: ");
		numAgencia = inTexto.nextLine();
		contaCorrente.setNumAgencia(numAgencia);
		System.out.println("\nInforme o n�mero da conta: ");
		numConta = inTexto.nextLine();
		contaCorrente.setNumConta(numConta);
		System.out.println("\nInforme o valor inicial em conta: ");
		saldo = inNumero.nextDouble();
		contaCorrente.setSaldo(saldo);

		while(opcao!=0&&opcao<4) {
			System.out.println("\nInforme a opera��o desejada:\n1)Consultar saldo    2)Depositar    3)Sacar    0)Cancelar");
			opcao = inNumero.nextInt();
			switch(opcao) {
			case 0:
				break;
			case 1:
				contaCorrente.imprimeSaldo();
				break;
			case 2:
				System.out.println("\nInforme o valor a ser depositado: ");
				deposito = inNumero.nextDouble();
				contaCorrente.deposita(deposito);
				break;
			case 3:
				System.out.println("\nInforme o valor a ser sacado: ");
				saque = inNumero.nextDouble();
				if(saque>contaCorrente.getSaldo()) {
					while(confirmacao==0||confirmacao>2) {
						if(confirmacao==0) {
							System.out.println("Valor a ser sacado � maior que seu saldo em conta, deseja prosseguir?\n1)Sim    2)N�o");
							confirmacao = inNumero.nextInt();
						}
						if(confirmacao==1) {
							contaCorrente.saca(saque);
						}else if(confirmacao==2) {
							break;
						}else {
							System.out.println("Op��o inv�lida!");
							confirmacao=0;
						}
					}
					confirmacao = 0;
				}
				break;
			default:
				System.out.println("\nOp��o selecionada inv�lida!");
				opcao=1;
				break;
			}
		}
	}
}
