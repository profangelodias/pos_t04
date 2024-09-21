package tech.angelofdiasg.main;

import java.util.Scanner;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.pessoas.*;

public class App {

	public static void main(String[] args) {
		Scanner menu = new Scanner (System.in);
		
        System.out.print("##--Selecione sua opção desejada:--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Cadastrar Pessoas     |\n");
        System.out.print("| Opção 2 - Cadastrar Clientes          |\n");
        System.out.print("| Opção 3 - Cadastrar Funcionário          |\n");
        System.out.print("| Opção 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
		
        int opcao = menu.nextInt();

        switch (opcao) {
        case 1:
    		//Cadastrar um cliente;
    		Pessoa pes1 = new Pessoa();
    		Pessoa pes2 = new Pessoa();
    		pes1.cadastrar();
//    		System.out.println("Exiba o estado: ");
    		pes1.getEndereco().getRua();
    		pes1.getEndereco().setRua("Nova Rua");;
    		pes2.setEndereco(pes1.getEndereco());
//    		Endereco end1 = new Endereco("Rua", "1", "5555", "cidade", "pb", "brad");
    		Endereco end2 = new Endereco();
    		end2.cadastrar();
    		pes2.setEndereco(end2);
            break;

        case 2:
            System.out.print("\nOpção Clientes Selecionado\n");
            break;

        case 3:
            System.out.print("\nOpção Produtos Selecionado\n");
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;

        case 4:
            System.out.print("\nAté logo!");
            menu.close();       
        }
        
        

		
		//Cadastrar um funcionário;

	}

}
