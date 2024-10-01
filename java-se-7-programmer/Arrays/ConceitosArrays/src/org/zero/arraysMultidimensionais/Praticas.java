package org.zero.arraysMultidimensionais;

public class Praticas {
    public static void main(String[] args) {

        int[] tabelaDeNotas[];
        tabelaDeNotas = new int[5][]; //inicializei a primeira dimensão com 5 "gavetas"

        tabelaDeNotas[1] = new int[]{8, 7, 15, 22, 10, 12, 9, 96};
        System.out.println(tabelaDeNotas.length); //5 que é o numero de gavetas da tabela

        System.out.println(tabelaDeNotas[1].length); //8 que é o numero de elementos da
        // primeira gaveta da tabela de notas

        tabelaDeNotas[6] = new int[]{8, 7, 15, 22, 10, 12, 9, 96};//retorna exception pois
        // não existe a gaveta 6!

    }
}

class Praticas2 {
    public static void main(String[] args) {

        int[][][] tabelaDeNotas;

        tabelaDeNotas = new int[][][]{{{8, 7, 15, 22, 10, 12, 9, 96}}
                , {{5}}};
        System.out.println(tabelaDeNotas.length); //2

        System.out.println(tabelaDeNotas[1].length); //1
    }
}

class Praticas3 {
    public static void main(String[] args) {

        int[][][] tabelaDeNotas;

        tabelaDeNotas = new int[][][]{{{8, 7, 15, 22, 10, 12, 9, 96}, {5, 3}}
                , {{5}, {36, 8, 12}, {0}, {150, 9, 36, 45}}};
        System.out.println(tabelaDeNotas.length); //2
        System.out.println(tabelaDeNotas[1].length); //3

        System.out.println("################");

        // Loop para percorrer a primeira dimensão (tabelaDeNotas.length)
        for (int i = 0; i < tabelaDeNotas.length; i++) {
            // Loop para percorrer a segunda dimensão (tabelaDeNotas[i].length)
            System.out.println("--------Tabela--------");
            for (int j = 0; j < tabelaDeNotas[i].length; j++) {
                // Loop para percorrer a terceira dimensão (tabelaDeNotas[i][j].length)
                for (int k = 0; k < tabelaDeNotas[i][j].length; k++) {
                    System.out.print(tabelaDeNotas[i][j][k] + " ");
                }
                System.out.println(); // quebra de linha após imprimir uma linha da tabela
            }
            System.out.println(); // quebra de linha após imprimir uma tabela
        }
    }
}
