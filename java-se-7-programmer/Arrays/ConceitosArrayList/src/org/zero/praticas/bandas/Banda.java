package org.zero.praticas.bandas;

public class Banda {
    private String nome;
    private String genero;

    // Construtor padrão
    public Banda() {}

    // Construtor com parâmetros
    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /*
    Para exibir a lista captando o nome e não a referência, você precisa sobrescrever
    o método toString() na classe Banda. Isso ocorre porque quando você imprime um
    objeto em Java, o método toString() é chamado automaticamente. Por padrão,
    o método toString() retorna a referência do objeto, que é o "endereço"/"referencia".
     */
    @Override
    public String toString() {
        return this.nome;
    }
}
