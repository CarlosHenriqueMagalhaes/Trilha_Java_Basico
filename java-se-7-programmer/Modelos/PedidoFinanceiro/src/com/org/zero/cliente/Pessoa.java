package com.org.zero.cliente;

public class Pessoa {
    public static String nome;
    public static int idade;

    public void setNome(String nome) {
        //usamos this.nome (porém devido a outro teste que tornou String nome static
        //foi passado a referencia da classe, temos outro exemplo melhor na classe Produto
        Pessoa.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
