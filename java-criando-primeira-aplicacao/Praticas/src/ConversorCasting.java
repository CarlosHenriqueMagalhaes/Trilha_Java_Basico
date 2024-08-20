public class ConversorCasting {
    public static void main(String[] args) {
        //Terceiro desafio proposto 1:
        double nota1 = 10;
        double nota2 = 6.5;
        int media = (int)(nota1 + nota2)/2;
        System.out.println("desafio proposto 1: " + "Média: " + media);

        //Terceiro desafio proposto 2:
        double variavelDouble = 5.7;
        int variavelInt = (int) variavelDouble;
        System.out.println("desafio proposto 2: O inteiro do double é: " + variavelInt);

        //Terceiro desafio proposto 3:
        char letra = 'O';
        String palavra = " Final";
        System.out.println("desafio proposto 3: " + letra + palavra);

        //Terceiro desafio proposto 4:
        double precoProduto = 3.75;
        int quantidade = 12;
        double precoTotal = (precoProduto * quantidade);
        System.out.println("desafio proposto 4: O preço total é: R$ " + precoTotal);

        //Terceiro desafio proposto 5:
        double valorEmDolares = 2;
        double taxaDeConversao = 4.94;
        double valorReal = valorEmDolares * taxaDeConversao;
        System.out.println("desafio proposto 5: " + valorEmDolares + " dolar(es) equivale á: R$ "
                + valorReal);

        //Terceiro desafio proposto 6:
        double precoOriginal = 2.80;
        double percentualDesconto = 50;
        double desconto = (percentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - desconto;
        System.out.println("desafio proposto 6: Valor final com desconto R$ " + valorFinal);
    }
}
