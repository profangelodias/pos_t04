package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxclass.Profissao;

import java.util.Scanner;
import java.util.UUID;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;

    private Scanner leitor = new Scanner(System.in);

    public Cliente(){
        this.codigo = UUID.randomUUID().toString();
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe a profissão do cliente: ");
        this.profissao = Profissao.valueOf(leitor.nextLine());
    }
    //Finalizar o cliente, podem colocar o tostring

    public String getCodigo() {
        return codigo;
    }

    public void setNewCodigo() {
        this.codigo = UUID.randomUUID().toString();
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        System.out.println("Dados cadastrados: ");
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                "} " + super.toString();
    }

}
