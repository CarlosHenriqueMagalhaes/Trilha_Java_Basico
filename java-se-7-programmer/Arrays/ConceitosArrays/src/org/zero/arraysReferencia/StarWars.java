package org.zero.arraysReferencia;

import org.zero.arraysReferencia.modelos.Personagem;
import org.zero.arraysReferencia.modelos.Vilao;

public class StarWars {
    public static void main(String[] args) {
        Personagem starWarsPersonagens[] = new Personagem[10];

        //Adiciona um novo personagem na posição 0 e adiciona o nome dele
        starWarsPersonagens[0] = new Personagem();
        starWarsPersonagens[0].nome = "Luke Skywalker";

        starWarsPersonagens[3] = new Personagem();
        starWarsPersonagens[3].nome = "Obi-Wan Kenobi";

        starWarsPersonagens[6] = new Personagem();
        starWarsPersonagens[6].nome = "Princesa Leia";

        System.out.println(starWarsPersonagens[0].nome);
        System.out.println(starWarsPersonagens[3].nome);

        //Como a classe arraysReferencia.Vilao extende da classe arraysReferencia.Personagem,
        //também podemos colocar esse objet na mesma array.
        starWarsPersonagens[1] = new Vilao();
        starWarsPersonagens[1].nome = "Darth Vader";

        //Outra maneira de adicionar um novo personagem na array
        Personagem mestre = new Personagem();
        mestre.nome = "Yoda";
        starWarsPersonagens[8] = mestre;

        //Esse codigo daria erro pois o nome das outras posições estão vazias ou nulls,
        //nas Arrays.Arrays de Referência não é atribuido o default como nos tipos primitivos (int, long, etc.)
        //String é um Objeto Object!
        //for (int i = 0; i < starWarsPersonagens.length; i++) {
        //    System.out.println(starWarsPersonagens[i].nome);}
        // Print the names of all characters in the array

        System.out.println("-------Star Wars--------");
        for (int i = 0; i < starWarsPersonagens.length; i++) {
            if (starWarsPersonagens[i] != null) {
                System.out.println(i + " " + starWarsPersonagens[i].nome);
            } else {
                System.out.println(i + " " +"Null");
            }
        }
    }
}

