package tech.angelofdiasg.estruturas;

import tech.angelofdiasg.pessoas.Cliente;

public class FilaDeClientes {
    private Cliente[] fila;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaDeClientes(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Cliente[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }
    
    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public void adicionarCliente(Cliente cliente) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            fila[fim] = cliente;
            tamanho++;
            System.out.println("Cliente " + cliente.getNome() + " adicionado � fila.");
        } else {
            System.out.println("A fila est� cheia. N�o � poss�vel adicionar mais clientes.");
        }
    }

    public Cliente atenderProximoCliente() {
        if (tamanho > 0) {
            Cliente clienteAtendido = fila[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            System.out.println("Atendendo cliente " + clienteAtendido.getNome() + ".");
            return clienteAtendido;
        } else {
            System.out.println("A fila est� vazia. N�o h� clientes para atender.");
            return null;
        }
    }

    public void exibirFila() {
        System.out.println("Fila de clientes:");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.println(fila[index].getNome());
        }
    }
    
    public void exibirPrimeiroCliente() {
        if (!isEmpty()) {
            System.out.println("Primeiro cliente na fila: " + fila[inicio].getNome());
        } else {
            System.out.println("A fila est� vazia. N�o h� clientes.");
        }
    }

    public void exibirUltimoCliente() {
        if (!isEmpty()) {
            System.out.println("�ltimo cliente na fila: " + fila[fim].getNome());
        } else {
            System.out.println("A fila est� vazia. N�o h� clientes.");
        }
    }
}