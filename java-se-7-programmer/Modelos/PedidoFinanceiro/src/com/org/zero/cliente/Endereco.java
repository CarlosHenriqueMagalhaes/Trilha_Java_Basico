package com.org.zero.cliente;

import java.util.Scanner;

public class Endereco {
    String rua;
    String cidade;
    int numeroDaResidencia;

    public void cadastroEndereco() {
        Scanner leituraEdereco = new Scanner(System.in);
        System.out.println("Digite o nome da rua: ");
        rua = leituraEdereco.nextLine();
        System.out.println("Digite o nome da cidade: ");
        cidade = leituraEdereco.nextLine();
        System.out.println("Digite o número da sua residência: ");
        numeroDaResidencia = leituraEdereco.nextInt();

        System.out.println("Rua: " + rua + "\n" + "Cidade: " + cidade + "\n" +
                "Numero da residência: " + numeroDaResidencia);
    }

}
