package com.org.zero.produto;

public class Produto {

    public String produto;
    public int valorDoProduto;

    //construtores: getters e setters
    public void setProduto(String produto){
        this.produto = produto;
    }

    public String getProduto() {
        return this.produto;
    }

    public void setValorDoProduto(int valorDoProduto){
        this.valorDoProduto = valorDoProduto;
    }

    public int getValorDoProduto() {
        return this.valorDoProduto;
    }
}
