package tech.angelofdiasg.main;

import tech.angelofdiasg.auxclass.Cargo;
import tech.angelofdiasg.auxclass.Telefone;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("===== MENU PRINCIPAL =====");
			System.out.println("1. Cadastrar NOVO Cliente");
			System.out.println("2. Cadastrar Funcionário");
			System.out.println("4. Alterar funcionário Funcionário");
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
				case "4":
					promoverFuncionario();
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
		Funcionario funcionario = new Funcionario();
		funcionario.cadastrar();
		System.out.println(funcionario);
	}

	public static void promoverFuncionario() {
		System.out.println("Promover Funcionário:");
		Funcionario funcionario = new Funcionario();
		System.out.println("Deseja alterar o cardgo do funcionário:");
		Cargo cargo = new Cargo();
		cargo.setNome("Dev");
		funcionario.promover(cargo);
		System.out.println("Deseja alterar o salário do funcionário:");
		System.out.println("Informe o percentual");
		double perc = 0;
		funcionario.reajustarSalario(perc);
		System.out.println(funcionario);
		System.out.println(funcionario);
	}

}
