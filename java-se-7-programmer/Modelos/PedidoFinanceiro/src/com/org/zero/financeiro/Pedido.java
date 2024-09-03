package com.org.zero.financeiro;

import com.org.zero.cliente.Endereco;
import com.org.zero.cliente.Pessoa;
import com.org.zero.produto.Produto;

import java.text.DecimalFormat;
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
        //veja sobre essa linha em Documentos:
        //Diferenca_entre_variaveis_referencias_e_objetos_e_tipos_primitivos.txt
        Endereco endereco = new Endereco();
        endereco.cadastroEndereco();

        System.out.println("Nº Pedido: " + numeroPedido);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        //chamando médodo na classe Endereço:
        endereco.printEndereco();

        System.out.println("Data do pedido: " + dataDoPedido.toString());

        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

        //chamando variaveis do classe Produto usando "getter e setter":
        Produto produtoComprado = new Produto();
        produtoComprado.setProduto("Teclado");
        produtoComprado.setValorDoProduto(25);
        System.out.println("Produto: " + produtoComprado.getProduto());
        System.out.println("Valor do produto: " + formato.format(produtoComprado.getValorDoProduto()));

    }

}

