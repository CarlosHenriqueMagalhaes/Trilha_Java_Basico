package org.zero.arraysReferencia;

import org.zero.arraysReferencia.modelos.Personagem;
import org.zero.arraysReferencia.modelos.Vilao;

import java.util.Scanner;

public class HP {
    public static void main(String[] args) {

        Personagem listaDePersonagensHP[] = new Personagem[15];

        Personagem bruxo = new Personagem();
        bruxo.nome = "Hermione Granger";
        listaDePersonagensHP[2] = bruxo;

        listaDePersonagensHP[0] = new Personagem();
        listaDePersonagensHP[0].nome = "Harry Potter";

        listaDePersonagensHP[1] = new Personagem();
        listaDePersonagensHP[1].nome = "Rony Weasley";

        listaDePersonagensHP[14] = new Vilao();
        listaDePersonagensHP[14].nome = "Voldemort";

        Personagem comensal = new Vilao();
        comensal.nome = "Lucio Malfoy";
        listaDePersonagensHP[13] = comensal;

        System.out.println("""
                Lista de personagens do universo Harry Potter:
                    -Já temos uma lista formada!
                    -Adicione um novo personagem:""");
        System.out.print("Novo Personagem: ");


        Scanner leituraDoBruxo = new Scanner(System.in);
        Personagem novoPersonagem = new Personagem();
        novoPersonagem.nome = leituraDoBruxo.nextLine();
        listaDePersonagensHP[3] = novoPersonagem;

        System.out.println("---Personagens Harry Potter ---");
        for (int i = 0; i < listaDePersonagensHP.length; i++) {
            if (listaDePersonagensHP[i] != null) {
                System.out.println(i + " - " + listaDePersonagensHP[i].nome);
            } else {
                listaDePersonagensHP[i] = new Personagem();
                listaDePersonagensHP[i].nome = " ";
            }
        }
    }
}
