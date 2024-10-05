package tech.angelofdiasg.main;

import tech.angelofdiasg.auxclass.Telefone;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.Cliente;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("===== MENU PRINCIPAL =====");
			System.out.println("1. Cadastrar NOVO Cliente");
			System.out.println("2. Cadastrar Funcionário");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");

			String opcao = scanner.nextLine();

			switch (opcao) {
				case "1":
					cadastrarCliente();
					break;
				case "2":
					cadastrarFuncionario();
					break;
				case "3":
					System.out.println("Saindo...");
					running = false;
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
		}

		scanner.close();
	}

	public static void cadastrarCliente() {
		//Criar o cadastrar cliente, funcional no menu principal
		System.out.println("Cadastro de Cliente:");
		Cliente cliente = new Cliente();
		cliente.cadastrar();
		//Lista de clientes
		//Adicionar a lista de clientes
		//Lista de clientes > pesquisar cliente por cliente quais telefones eles tem
		//para encontrar um telefone específico
		System.out.println("Dados cadastrados: " + cliente);
	}

	public static void cadastrarFuncionario() {
		System.out.println("Cadastro de Funcionário:");
		ListaDeTelefonesNaoOrdenados telefones = new ListaDeTelefonesNaoOrdenados();
		int tamCads = 4;
		while (tamCads < 4){
			Telefone telefone = new Telefone();
			telefone.cadastrar();
			telefones.adicionarTelefone(telefone);
			System.out.println("Cadastre um novo telefone: ");
			tamCads++;
		}
		telefones.exibirTelefone();

	}


}
