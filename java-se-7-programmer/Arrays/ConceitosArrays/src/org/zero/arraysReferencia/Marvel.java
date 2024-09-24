package org.zero.arraysReferencia;

import org.zero.modelos.Vilao;
import org.zero.modelos.Personagem;

import java.util.Scanner;

public class Marvel {
    public static void main(String[] args) {
        String opcaoMoral[] = new String[3];
        opcaoMoral[0] = "Neutra";
        opcaoMoral[1] = "Boa";
        opcaoMoral[2] = "Mal";

        Personagem marvelPersonagens[] = new Personagem[10];

        Scanner leitura = new Scanner(System.in);
        System.out.print("Adicione o nome de um personagem da Marvel: ");
        marvelPersonagens[0] = new Personagem();
        marvelPersonagens[0].nome = leitura.nextLine();

        System.out.println(marvelPersonagens[0].nome);

        marvelPersonagens[8] = new Personagem();
        marvelPersonagens[8].nome = "Spider-man";

        marvelPersonagens[1] = new Vilao();
        marvelPersonagens[1].nome = "Thanos";
        marvelPersonagens[1].tendencia = "Vilão";

        System.out.println(marvelPersonagens[1].nome + ", tendencia: " + marvelPersonagens[1].tendencia +
                ", moral: " + opcaoMoral[2]);

        Personagem antiHeroi = new Personagem();
        antiHeroi.nome = "Punisher";
        marvelPersonagens[6] = antiHeroi;

        Personagem patrono = new Personagem();
        patrono.nome = "Iron-man";
        marvelPersonagens[2] = patrono;

        marvelPersonagens[4] = new Personagem();
        marvelPersonagens[4].nome = "Wolverine";
        marvelPersonagens[4].tendencia = "Heroí";

        marvelPersonagens[9] = new Vilao();
        marvelPersonagens[9].nome = "Venom";

        System.out.println("-------Marvel--------");
        for (int i = 0; i < marvelPersonagens.length; i++) {
            if (marvelPersonagens[i] != null) {
                System.out.println(i + " - " + marvelPersonagens[i].nome + " - " + marvelPersonagens[i].tendencia);
            } else {
                marvelPersonagens[i] = new Personagem();
                marvelPersonagens[i].nome = "Sem personagem adicionado";
                System.out.println(i + " - " + marvelPersonagens[i].nome);
            }
        }
    }
}
