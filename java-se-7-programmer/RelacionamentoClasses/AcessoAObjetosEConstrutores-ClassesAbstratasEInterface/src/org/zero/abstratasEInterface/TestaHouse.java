package org.zero.abstratasEInterface;

public class TestaHouse extends House implements MaterialConstrucao {
    public static void main(String[] args) {
        System.out.println("Quantidade de pregos: " + quantidadePregos);
        TestaHouse preco = new TestaHouse();
        preco.calculoPreco(0.50);
        preco.construcao();
    }

    // implementado da classe abstrata
    @Override
    public void construcao() {
        int quantidadeUsada = 45;
        int nova = quantidadePregos - quantidadeUsada;
        System.out.println("Quantidade após o uso: " + nova);
    }

}
