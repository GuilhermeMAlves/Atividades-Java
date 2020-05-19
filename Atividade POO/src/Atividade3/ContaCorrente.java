package Atividade3;

public class ContaCorrente {
	private String numAgencia;
	private String numConta;
	private double saldo;

	public ContaCorrente(String numAgencia, String numConta, int saldo) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double deposito) {
		this.saldo+=deposito;
	}

	public void saca(double saque) {
		this.saldo-=saque;
	}

	public void imprimeSaldo() {
		System.out.println("\nAgência: "+getNumAgencia()+"\nConta: "+getNumConta()+"\nSaldo atual: R$"+getSaldo());
	}
}