package tech.angelofdiasg.auxclass;

import java.util.Scanner;

public class Cargo {
    private String nome;
    private String info;
    private double salario;
    private String nivel;

    private Scanner leitor = new Scanner(System.in);

    public void cadastrar(){
        System.out.println("Informe o Cargo: ");
        this.nome = leitor.nextLine();
        System.out.println("Informe as informações do Cargo: ");
        this.info = leitor.nextLine();
        System.out.println("Informe o Salário: ");
        this.salario = leitor.nextDouble();
        this.nivel = leitor.nextLine();
        System.out.println("Informe o nível(JR, PL, SR): ");
        this.nivel = leitor.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nome='" + nome + '\'' +
                ", info='" + info + '\'' +
                ", salario=" + salario +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
