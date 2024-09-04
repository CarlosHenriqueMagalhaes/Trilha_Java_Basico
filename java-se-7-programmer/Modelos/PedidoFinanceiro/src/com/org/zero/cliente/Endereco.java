package com.org.zero.cliente;

import java.util.Scanner;

public class Endereco {
    String rua;
    String cidade;
    int numeroDaResidencia;

    public void cadastroEndereco() {
        Scanner leituraEdereco = new Scanner(System.in);
        System.out.print("Digite o nome da rua: ");
        rua = leituraEdereco.nextLine();
        System.out.print("Digite o nome da cidade: ");
        cidade = leituraEdereco.nextLine();
        System.out.print("Digite o número da sua residência: ");
        numeroDaResidencia = leituraEdereco.nextInt();
    }

    public void printEndereco(){
        System.out.println("Rua: " + rua + "\n" + "Cidade: " + cidade + "\n" +
                "Numero da residência: " + numeroDaResidencia);
    }
}
