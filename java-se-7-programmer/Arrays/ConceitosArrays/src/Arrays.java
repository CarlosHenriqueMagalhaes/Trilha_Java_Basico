public class Arrays {
    public static void main(String[] args) {

        //Cria uma Array já passando a quantidade de argumentos:
        int numeros[] = {25, 30, 45, 12, 33, 18};
        System.out.println(numeros[3]);// retorna 12 que é a quarta posição do array (começa no 0)
        System.out.println(numeros.length);//retorna o número de elementos dessa array

        //Outra maneira de criar e instanciar uma array:
        double[] valores;
        valores = new double[5];// tamanho do array
        System.out.println(valores.length);// 5 que é a quantidade definida de elementos dessa array
        System.out.println(valores[3]);//imprime 0 (0.0 pois é double) que é valor default
        // (pois esta zerado essa posição

        valores[2] = 3.8; //adicionei o valor 3.8 na posição 3 do array valores
        System.out.println(valores[2]);//3.8

        // Outro exemplo de criação, instanciar e adicionar o valor em uma posição:
        // Coloca o valor 73.14 na última variável do array pesos.
        double pesos[] = new double[50];
        pesos[49] = 73.14;

        // Entendendo as posições:
        // irá imprimir: 0 1 2 3 4 5 6 7 8 9
        // que são 10 elementos!
        int numeroDeElementos[] = new int[10];
        for (int i = 0; i < numeroDeElementos.length; i++) {
            numeroDeElementos[i] = i;
            System.out.print(i + " ");
        }
    }
}
