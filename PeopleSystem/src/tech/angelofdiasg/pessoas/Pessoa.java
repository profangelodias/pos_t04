package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import tech.angelofdiasg.auxclass.Endereco;
import tech.angelofdiasg.auxclass.Telefone;
import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private ListaDeTelefonesNaoOrdenados telsContato;

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
		telsContato = new ListaDeTelefonesNaoOrdenados();
		for(int i = 0; i < telsContato.getCapacidadePadrao(); i++) {
			System.out.println("Deseja cadastar um telefone: ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			int tel = leitor.nextInt();
			if(tel == 1) {
				System.out.println("Informe os dados do telefone: ");
				Telefone tele = new Telefone();
				tele.cadastrar();
				telsContato.adicionarTelefone(tele);
				System.out.println();
			}else {
				break;
			}
		}
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

	public ListaDeTelefonesNaoOrdenados getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(ListaDeTelefonesNaoOrdenados telsContato) {
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
