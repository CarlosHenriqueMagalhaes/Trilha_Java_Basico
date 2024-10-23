package org.zero.encapsulamento;

// Nessa classe a variavel nome pode ser acessado através dos métodos
//getNome e SetNome, a String nome esta privada, portando encapsulada/protegida
public class Pessoa {
    private String nome;

    String getNome() {
        return nome;
    }

    void setNome (String nome){
        if(nome==null) nome = "";
        this.nome = nome;
    }
}
