package tech.angelofdiasg.main;

import java.util.Scanner;

import tech.angelofdiasg.contas.Conta;
import tech.angelofdiasg.contas.ContaInvestimento;

public class App {

	public static void main(String[] args) {
		int numeroDaConta;
		double taxaDoDia;
		double saldo, valor;
		Conta contaBase = new Conta(0, 100);
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número da conta:");
		numeroDaConta = leitor.nextInt();
		ContaInvestimento contaInv1 = new ContaInvestimento(numeroDaConta, 0.01);
		System.out.println("Informe o valor para deposito inicial:");
		valor = leitor.nextDouble();
		contaInv1.depositar(valor);
		
		
		System.out.println("O saldo atual é R$:" 
		+ contaInv1.getSaldo());
		
		System.out.println("Informe o valor para deposito:");
		valor = leitor.nextDouble();
		contaInv1.depositar(valor);
		
		System.out.println("O saldo atual após depositvo é R$:" 
				+ contaInv1.getSaldo());
		
		System.out.println("Informe o valor para sacar:");
		valor = leitor.nextDouble();
		contaInv1.sacar(valor);
		
		System.out.println("O saldo atual após saque é R$:" 
				+ contaInv1.getSaldo());

		System.out.println("Informe o valor da taxa do dia:");
		valor = leitor.nextDouble();
		contaInv1.aplicarRendimento(valor);

		System.out.println("O saldo atual após rendimento é R$:" 
				+ contaInv1.getSaldo());
		
		System.out.println("Visualizar o saldo da conta base:");
		System.out.println("Saldo da conta base R$" + contaBase.getSaldo());
		
//		Conta conta1 = new Conta(01, 100000);
//		Conta conta2 = new Conta(02);
		
		//		ContaEspecial contaEsp1 = new ContaEspecial(numeroDaConta);
//		ContaEspecial contaEsp2 = new ContaEspecial(02, 100000, 10000);
//		contaEsp1.numero = 02;
//		if (contaEsp1.depositar(100)) {
//			System.out.println("Retornou para o App"
//					+ "com um novo saldo!");
//		}
//		System.out.println("Valor atual: " + contaEsp1.getSaldo());

	}
}
