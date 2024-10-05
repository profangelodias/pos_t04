package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

import tech.angelofdiasg.auxclass.Endereco;
import tech.angelofdiasg.auxclass.Telefone;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;

	private Scanner leitor = new Scanner(System.in);
	
	public void cadastrar() {
		System.out.println("Informe o nome: ");
		this.nome = leitor.nextLine();
		System.out.println("Informe a data de nascimento! ");
		System.out.println("Informe o dia: ");
		int dia = leitor.nextInt();
		System.out.println("Informe o mês: ");
		int mes = leitor.nextInt();
		System.out.println("Informe o ano: ");
		int ano = leitor.nextInt();
		this.dataNascimento = LocalDate.of(ano, mes, dia);
		System.out.println("Informe o tel Contato: ");
		telsContato = new Telefone();
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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

	
	public int obterIdade(){
		LocalDate dataNascimento = this.dataNascimento;
		LocalDate dataAtual = LocalDate.now();

		Period periodo = Period.between(dataNascimento, dataAtual);

		return periodo.getYears();
	}


	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", dataNascimento=" + dataNascimento +
				", endereco=" + endereco +
				", telsContato=" + telsContato +
				'}';
	}
}
