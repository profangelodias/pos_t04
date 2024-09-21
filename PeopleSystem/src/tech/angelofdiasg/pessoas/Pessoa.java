package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.composicao.Telefone;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;
	private Scanner leitor = new Scanner(System.in);
	
	public void cadastrar() {
		System.out.println("Informe o nome: ");
		this.nome = leitor.nextLine();
		System.out.println("Informe a data de nascimento: ");
		this.dataNascimento = leitor.nextLine();
		System.out.println("Informe o tel Contato: ");
		this.telsContato.cadastrar();
		System.out.println("Deseja cadastra o endereço: ");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		int end = leitor.nextInt();
		if(end == 1) {
			System.out.println("Deseja cadastra o endereço: ");
			endereco = new Endereco();
			endereco.cadastrar();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}

	
//	obterIdade

	
}
