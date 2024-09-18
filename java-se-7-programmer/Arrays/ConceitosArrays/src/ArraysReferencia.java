public class ArraysReferencia {
    public static void main(String[] args) {
        Personagem personagens[] = new Personagem[10];

        //Adiciona um novo personagem na posição 0 e adiciona o nome dele
        personagens[0] = new Personagem();
        personagens[0].nome = "Luke Skywalker";

        personagens[3] = new Personagem();
        personagens[3].nome = "Obi-Wan Kenobi";

        System.out.println(personagens[0].nome);
        System.out.println(personagens[3].nome);

        //Como a classe Vilao extende da classe Personagem, também podemos colocar esse objeto
        //na mesma array.
        personagens[1] = new Vilao();
        personagens[1].nome = "Darth Vader";

        //Outra maneira de adicionar um novo personagem na array
        Personagem mestre = new Personagem();
        mestre.nome = "Yoda";
        personagens[2] = mestre;

        //Esse codigo daria erro pois o nome das outras posições estão vazias ou nulls,
        //nas Arrays de Referência não é atribuido o default como nos tipos primitivos (int, long, etc.)
        //String é om Objeto Object!
        //for (int i = 0; i < personagens.length; i++) {
        //    System.out.println(personagens[i].nome);}
    }
}

class Personagem {
    String nome;
    String tendencia;
}

class Vilao extends Personagem {
}