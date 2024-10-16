package org.zero.staticos.automoveis;

public class Carros {
    //variavel privada
    private static int totalDeCarros;

    //método para acessar a variavel (nesse caso atribui o valor da variavel.)
    public static int getTotalDeCarros() {
        return totalDeCarros = 50;
    }
}
