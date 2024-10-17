package org.zero.sobrecarga;

public class TestaOverload {
    public static void main(String[] args) {
        Overloader overloader = new Overloader();
        overloader.metodo();
        overloader.metodo(536);//passou pelo segundo método
        overloader.metodo("qualquer coisa");//passou pelo terceiro método

        overloader.metodo((Object) "qualquer coisa");// usado o Casting Object para entrar no quarto
        // metodo e não no terceiro (da String)

        overloader.metodo(6,88,"String Here!");
    }
}
