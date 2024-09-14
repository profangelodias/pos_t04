package tech.angelofdiasg.contas;

public class Conta {
	int numero;
	double saldo;
	
	boolean sacar(double valor) {
		if (this.saldo > valor && valor > 0) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			System.out.println("Valor R$" + valor + " "
					+ "sacado com sucesso.");
			return true;
		} else {
			System.out.println("Saldo insuficiente ou "
					+ "valor inválido!");
			return false;
		}
	}
	
	boolean depositar(double valor) {
		if (valor >= 0) {
			this.saldo = this.saldo + valor;
			System.out.println("Valor R$" + valor + " "
					+ "depositado com sucesso.");
			return true;
		} else {
			System.out.println("Não há valores para serem"
					+ " depositados!");
			return false;
		}
	}
	
	double getSaldo() {
		return this.saldo;
	}

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta() {
		System.out.println("Caracteristicas de conta vazia criadas!");
		
	}
	
	

}
