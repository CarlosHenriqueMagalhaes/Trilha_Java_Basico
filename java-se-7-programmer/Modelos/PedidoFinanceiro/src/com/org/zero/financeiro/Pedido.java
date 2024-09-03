package com.org.zero.financeiro;

import com.org.zero.cliente.Endereco;
import com.org.zero.cliente.Pessoa;
import com.org.zero.produto.Produto;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static com.org.zero.cliente.Pessoa.idade;
import static com.org.zero.cliente.Pessoa.nome;

public class Pedido {

    Pessoa cliente;
    Endereco enderecoPedido;
    Produto produto;
    Date dataDoPedido = new Date();

    Random random = new Random();
    int numeroPedido = random.nextInt(3000);

    public Pessoa getCliente() {
        return cliente;
    }

    public void printVenda() {
        Scanner leituraDadosDoCliente = new Scanner(System.in);

        //chamando variaveis da classe Pessoa:
        System.out.println("Digite o nome do cliente: ");
        nome = leituraDadosDoCliente.nextLine();
        System.out.println("Digite a idade do cliente: ");
        idade = leituraDadosDoCliente.nextInt();

        //chamando médodo na classe Endereço:
        Endereco endereco = new Endereco();
        endereco.cadastroEndereco();

        System.out.println("Nº Pedido: " + numeroPedido);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        //chamando médodo na classe Endereço:
        endereco.printEndereco();

        System.out.println(dataDoPedido.toString());
        
    }

}

