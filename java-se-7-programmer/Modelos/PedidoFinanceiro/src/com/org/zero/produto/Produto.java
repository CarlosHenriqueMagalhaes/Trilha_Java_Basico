package com.org.zero.produto;

public class Produto {

    public String produto1;
    public int valorDoProduto1;

    //getters e setters
    public void setProduto(String produto){
        this.produto1 = produto;
    }

    public String getProduto() {
        return this.produto1;
    }

    public void setValorDoProduto(int valorDoProduto){
        this.valorDoProduto1 = valorDoProduto;
    }

    public int getValorDoProduto() {
        return this.valorDoProduto1;
    }
}
