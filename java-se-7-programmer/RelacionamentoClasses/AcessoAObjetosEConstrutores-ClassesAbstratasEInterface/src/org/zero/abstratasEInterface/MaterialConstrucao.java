package org.zero.abstratasEInterface;

public interface MaterialConstrucao {
    //todas variaveis  são public final static,
    //isto é, constantes, mesmo que não esteja escrito abaixo!
    int quantidadePregos = 500;

    public default double calculoPreco(double preco) {
        double total = quantidadePregos * preco;
        System.out.println("Preço total da quantidade máxima: " + total);
        return total;
    }
}
