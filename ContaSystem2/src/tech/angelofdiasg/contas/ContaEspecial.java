package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta {
	double limite;
	
	boolean sacar(double valor) {
		if (this.saldo > valor && valor > 0) {
			double novoSaldo = this.saldo - (valor * 0.90);
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

	public ContaEspecial() {
		System.out.println("Conta Especial vazia criada!");
	}
	
	public ContaEspecial(int numero) {
		super(numero);
		System.out.println("Conta de numero " + numero + " criada!");
	}

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	
	

}
