package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.auxclass.Telefone;

public class ListaDeTelefonesNaoOrdenados {
    //Vetor de Telefones onde criaremos nossa lista
    private Telefone[] telefones;
    //Controle do tamanho
    private int tamanho;
    //Capacidade inicial (pode ser alterada depois)
    private static final int CAPACIDADE_PADRAO = 6;

    private int capacidadePadrao = CAPACIDADE_PADRAO;

    public int getCapacidadePadrao() {
        return capacidadePadrao;
    }

    //Construtor da lista
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    //Verificador de Lista vazia
    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    //Verificar se lista cheia
    public boolean isFull(){
        return this.tamanho == CAPACIDADE_PADRAO + 1;
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

    //Adicionar sem se preocupar com a CAPACIDADE_PADRAO
    //Adicionar um telefone VIDA LOKA
    public void addTelefoneNoSQL(Telefone telefone) {
        //length ele pega a capacidade atual em tempo de execu��o,
        //Caso a CAPACIDADE_PADRAO seja alterada.
        if (tamanho == telefones.length) {
            //Se o veotr estiver cheio, aumente sua capacidade
            garantirCapacidade();
        }
        telefones[tamanho] = telefone;
        this.tamanho = tamanho +1;
    }

    private void garantirCapacidade() {
        int novaCapacidade = telefones.length * 2;
        Telefone[] listaTelefones = new Telefone[novaCapacidade];
        for(int i = 0; i < tamanho; i++) {
            listaTelefones[i] = telefones[i];
        }
        telefones = listaTelefones;
    }

    //remover o teleofone informado, buscar o index dele
    public void removerTelefone(Telefone telefone){
        //Buscar o index do telefone desejado
        int index = buscarTelefoneIndex(telefone);
        if (index != -1){
            for (int i = index; i < tamanho - 1; i++) {
                telefones[i] = telefones[i + 1];
            }
            this.tamanho = tamanho - 1;
            telefones[tamanho] = null;
        }

    }

    //Procura o indice(index) do telefone
    private int buscarTelefoneIndex(Telefone telefone) {
        for (int i = 0; i < tamanho; i++){
            //validar se o telefone existe
            if(telefones[i].equals(telefone) ){
                return i;
            }
        }
        //Se não encontrar retorna um valor inválido
        System.out.println("Telefone não encontrado!");
        return -1;
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
