public class Main {
    public static void main(String[] args)
    {
        System.out.println("Catalogo de filmes: Screen Zero");

        System.out.println("Filme: Star Wars - O despertar da força");

        int anoDeLancamento = 2015;
        boolean inclusoNaPlataforma = true;
        double notaDoFilme = 9.5;
        String sinopse;
        int classificacao;

        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota do filme: " + notaDoFilme);
        System.out.println("Incluso no Screen Zero: " + inclusoNaPlataforma);

        sinopse = """
                Sétimo filme da franquia Star Wars
                - Aventura espacial
                - Volta da nostalgia""";

        System.out.println("Sinopse: " + sinopse);

        //Esse recurso se chama casting que nada mais é que transformar
        //um tipo de variavel para outro tipo, nesse caso a notaDoFilme era
        //do tipo double e foi feita o cast para int.
        //Veja que o int ficou entre parenteses indicando o cast para double
        //notaDoFilme:
        classificacao = (int) (notaDoFilme/2);
        System.out.println("Classificação: " + classificacao + " estrelas");
    }
}
