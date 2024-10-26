package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.auxclass.Telefone;

public class ListaDeTelefonesNaoOrdenados {
    //Vetor de Telefones onde criaremos nossa lista
    private Telefone[] telefones;
    //Controle do tamanho
    private int tamanho;
    //Capacidade inicial (pode ser alterada depois)
    private static final int CAPACIDADE_PADRAO = 7;

    //Construtor da lista
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    //Verificador de Lista vazia
    public boolean isEmpty(){
        return this.tamanho == 0;
    }
//tamanho = 0
    public void adicionarTelefone(Telefone telefone){
        //Verificar length em tempo real a capacidade "atual" da lista
        if(this.tamanho < CAPACIDADE_PADRAO){
            //tamanho é o "index+1", usar o tamanho para adicionar
            this.telefones[this.tamanho] = telefone;
            //incrementar o tamanho
            this.tamanho = this.tamanho + 1;
        } else {
            System.out.println("Não há mais espçado para adicionar" + telefone);
        }
    }

    //Validar se a lista está vazia e imprimir a informação
    public void exibirTelefone(){
        //Percorrer o vetor/array
        for(int i = 0; i < this.tamanho; i++){
            //E imprimir os objetos encontrados
            System.out.println(this.telefones[i]);
        }
    }
}
