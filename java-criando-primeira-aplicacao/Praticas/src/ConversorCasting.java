public class ConversorCasting {
    public static void main(String[] args) {
        /*
        Terceiro desafio proposto 1:
        Crie um programa que realize a média de duas notas decimais e exiba o resultado.
         */
        double nota1 = 10;
        double nota2 = 6.5;
        int media = (int)(nota1 + nota2)/2;
        System.out.println("desafio proposto 1: " + "Média: " + media);

         /*
        Terceiro desafio proposto 2:
        Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da
        variável double para int e imprima o resultado.
         */
        double variavelDouble = 5.7;
        int variavelInt = (int) variavelDouble;
        System.out.println("desafio proposto 2: O inteiro do double é: " + variavelInt);

          /*
        Terceiro desafio proposto 3:
        Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.
         */
        char letra = 'O';
        String palavra = " Final";
        System.out.println("desafio proposto 3: " + letra + palavra);

          /*
        Terceiro desafio proposto 4:
        Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado
        em uma mensagem.
         */
        double precoProduto = 3.75;
        int quantidade = 12;
        double precoTotal = (precoProduto * quantidade);
        System.out.println("desafio proposto 4: O preço total é: R$ " + precoTotal);

          /*
        Terceiro desafio proposto 5:
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
        dólares para reais e imprima o resultado formatado.
         */
        double valorEmDolares = 2;
        double taxaDeConversao = 4.94;
        double valorReal = valorEmDolares * taxaDeConversao;
        System.out.println("desafio proposto 5: " + valorEmDolares + " dolar(es) equivale á: R$ "
                + valorReal);

          /*
        Terceiro desafio proposto 6:
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal = 2.80;
        double percentualDesconto = 50;
        double desconto = (percentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - desconto;
        System.out.println("desafio proposto 6: Valor final com desconto R$ " + valorFinal);
    }
}
