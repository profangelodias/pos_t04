package tech.angelofdiasg.contas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int numeroDaConta;
		Scanner leitor = new Scanner(System.in);
		
//		Conta conta1 = new Conta(01, 100000);
//		Conta conta2 = new Conta(02);
		
		System.out.println("Informe o número da conta Especial:");
		numeroDaConta = leitor.nextInt();
		ContaEspecial contaEsp1 = new ContaEspecial(numeroDaConta);
//		ContaEspecial contaEsp2 = new ContaEspecial(02, 100000, 10000);
//		contaEsp1.numero = 02;
		

	}

}
