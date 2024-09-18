package org.zero.Hortifruti;

import java.util.Scanner;

public class Hortifruti {
    String listaDeFrutas[] = {"Maça", "Uva", "Melancia", "Laranja", "Acerola", "Melão"};

    public void escolhaAFruta() {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----Hortifuti-----");
            for (int i = 0; i < listaDeFrutas.length; i++) {
                System.out.println(i + ": " + listaDeFrutas[i]);
            }

            System.out.print("Escolha a fruta do Hortifuti (ou digite -1 para sair):");
            int frutaSelecionada = leitura.nextInt();

            if (frutaSelecionada >= 0 && frutaSelecionada < listaDeFrutas.length) {
                System.out.println("Você escolheu: " + listaDeFrutas[frutaSelecionada]);
            } else if (frutaSelecionada == -1) {
                System.out.println("Até logo!");
                continuar = false;
            } else {
                System.out.println("Escolha uma fruta válida!");
            }

        }
    }
}