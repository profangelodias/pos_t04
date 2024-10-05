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
    //Criar o cadastrar cliente, funcional no menu principal

}
