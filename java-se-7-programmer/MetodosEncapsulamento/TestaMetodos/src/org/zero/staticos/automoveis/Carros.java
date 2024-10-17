package org.zero.staticos.automoveis;

public class Carros {
    //Outra maneira, e mais usada de usar uma variavel:
    public static final int PADRAO_NUMERO_DE_CARROS = 100;
    //Uma variavel statica pode receber outra:
    public static int maximoDeCarros = PADRAO_NUMERO_DE_CARROS;

    //variavel privada
    private static int totalDeCarros = 5;

    //método para acessar a variavel (nesse caso atribui o valor da variavel.)
    public static int getTotalDeCarros() {
        return totalDeCarros;
    }

    public static int getMaximoDeCarros() {
        return maximoDeCarros;
    }
}
