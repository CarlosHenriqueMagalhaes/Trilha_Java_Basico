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
                ,{{5}}};
        System.out.println(tabelaDeNotas.length); //2

        System.out.println(tabelaDeNotas[1].length); //1
    }
}
