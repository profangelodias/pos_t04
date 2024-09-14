package tech.angelofdiasg.contas;

public class ContaDeMenor extends Conta {
	double limite;
	
	void sacarDoMenorDeIdade(double valor, boolean permissao) {
		if(permissao == true ) {
			super.sacar(valor);
		}
	}
	public ContaDeMenor() {
		System.out.println("Conta Especial vazia criada!");
	}

	public ContaDeMenor(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

}
