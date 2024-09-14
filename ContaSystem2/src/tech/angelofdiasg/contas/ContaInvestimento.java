package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta{
	private double taxaConta;
	private int prazo;
	private double valorTaxa;
	
	public boolean sacar(double valor) {
		valorTaxa = valor * taxaConta;
		if (getSaldo() > valor && valor > 0) {
			double novoValor = valor - valorTaxa;
			super.sacar(novoValor);
			System.out.println("Valor R$" + valor + " "
					+ "sacado com sucesso.");
			return true;
		} else {
			System.out.println("Saldo insuficiente ou "
					+ "valor inválido!");
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		valorTaxa = valor * taxaConta;
		if (valor >= 0) {
			super.depositar(valor + valorTaxa);
			System.out.println("Valor R$" + valor + " "
					+ "depositado com sucesso.");
			return true;
		} else {
			System.out.println("Não há valores para serem"
					+ " depositados!");
			return false;
		}
	}
	
	public void aplicarRendimento(double taxa) {
		double rendimento = getSaldo() * taxa;
		super.depositar(rendimento);
		System.out.println("Sua conta rendeu R$" + rendimento );
	}
	
	public void alterarTaxaDaConta(double taxa) {
			this.taxaConta = this.taxaConta + taxa;
	}

		public ContaInvestimento(int numero, double taxaConta) {
			super(numero);
			this.taxaConta = taxaConta;
		}

		public ContaInvestimento(int numero, double saldo, double taxaConta, int prazo) {
			super(numero, saldo);
			this.taxaConta = taxaConta;
			this.prazo = prazo;
		}

		public double getTaxaConta() {
			return taxaConta;
		}

		public int getPrazo() {
			return prazo;
		}

		public double getValorTaxa() {
			return valorTaxa;
		}

}
