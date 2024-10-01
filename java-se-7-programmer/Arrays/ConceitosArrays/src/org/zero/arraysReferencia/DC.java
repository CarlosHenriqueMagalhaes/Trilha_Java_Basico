package org.zero.arraysReferencia;

import org.zero.arraysReferencia.modelos.Personagem;
import org.zero.arraysReferencia.modelos.Vilao;

public class DC {
    public static void main(String[] args) {
        Personagem personagemDC[] = new Personagem[10];

        personagemDC[0] = new Personagem();
        personagemDC[0].nome = "Batman";

        personagemDC[1] = new Personagem();
        personagemDC[1].nome = "Superman";

        personagemDC[2] = new Personagem();
        personagemDC[2].nome = "Wonder Woman";

        personagemDC[8] = new Personagem();
        personagemDC[8].nome = "Ravena";

        Personagem vilaoBatman = new Vilao();
        vilaoBatman.nome = "Bane";
        personagemDC[3] = vilaoBatman;

        Personagem vilaoSuperman = new Vilao();
        vilaoSuperman.nome = "Brainiac";
        personagemDC[5] = vilaoSuperman;

        System.out.println(personagemDC[0].nome);

        System.out.println("-------DC Comics--------");

        for (int i = 0; i < personagemDC.length; i++) {
            if (personagemDC[i] != null) {
                System.out.println(i + " - " + personagemDC[i].nome);
            } else {
                personagemDC[i] = new Personagem();
                personagemDC[i].nome = " nenhum personagem cadastrado";
            }
        }
    }
}
