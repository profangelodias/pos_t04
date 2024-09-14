package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta {
	private double limite;
	
	public boolean sacar(double valor) {
		if (getSaldo() > valor && valor > 0) {
			super.sacar(valor * 0.90);
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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}	

}
