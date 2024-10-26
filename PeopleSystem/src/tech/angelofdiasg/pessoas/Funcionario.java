package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxclass.Cargo;
import tech.angelofdiasg.auxclass.Endereco;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    private Scanner leitor = new Scanner(System.in);

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o matricula: ");
        this.matricula = leitor.nextInt();
        System.out.println("Deseja cadastre os dados do Cargo: ");
        cargo = new Cargo();
        cargo.cadastrar();
        this.salario = cargo.getSalario();
        System.out.println("Informe o dia da admissão: ");
        int dia = leitor.nextInt();
        System.out.println("Informe o mês da admissão: ");
        int mes = leitor.nextInt();
        System.out.println("Informe o ano da admissão: ");
        int ano = leitor.nextInt();
        this.dataAdmissao = LocalDate.of(ano, mes, dia);
    }

    public void reajustarSalario(double percentual) {
        this.salario = this.salario * percentual;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}
