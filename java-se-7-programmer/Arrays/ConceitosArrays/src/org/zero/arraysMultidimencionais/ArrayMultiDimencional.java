package org.zero.arraysMultidimencionais;

public class ArrayMultiDimencional {
    public static void main(String[] args) {

        // Perceba que as dimensões podem ser definidas do lado
        // esquerdo ou direito da variável.

        // Inicializando a primeira dimensão com 10 e a segunda com 5
        int tabela[][] = new int[10][5]; // Um array de duas dimensões.

        // Inicializando a primeira dimensão com 3 e deixando as outras
        // para serem iniciadas depois
        int[] cubo[][] = new int[3][][]; // Um array de três dimensões.

        int[][] megaTabela[][];          // Um array de quatro dimensões.

        // Inicializando com valores
        //Em Java, quando você cria um array 2D ou 3D, todos os sub-arrays devem ter o mesmo tamanho.
        int megaCubo[][][] = new int[][][]{{{3, 5, 8, 16}, {1, 2, 3, 22, 9},{9,12,13}},
        {{3, 5, 8}, {1, 2, 3},{5,7,18},{5},{9, 9, 9, 9, 9}},
        {{3, 5, 8}, {1, 2, 3}, {3,4,7,9}}};

        // Acessando a posição (0,1)
        System.out.println(megaCubo[0][1]);


        int[][] estranha = new int[2][];
        estranha[0] = new int[20];
        estranha[1] = new int[10];
        for (int i = 0; i < estranha.length; i++) {
            System.out.println(estranha[i].length); // imprime 20 e 10 já que ele percorre o "length"
        }
    }
}
