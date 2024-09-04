package com.org.zero.teste;

import com.org.zero.cliente.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Desmont Miles");
        System.out.println(pessoa.getNome());

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Julia Robert");
        System.out.println(segundaPessoa.getNome());
    }
}
