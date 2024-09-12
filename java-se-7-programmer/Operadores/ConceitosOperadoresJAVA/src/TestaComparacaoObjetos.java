public class TestaComparacaoObjetos {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Luigi");
        Pessoa pessoa2 = new Pessoa("Mario");
        System.out.println(pessoa1.equals(pessoa2)); // false
        System.out.println(pessoa1.equals(pessoa1)); // true
        // pois na classe Pessoa o metodo equals foi alterado

        Pessoa pessoa3 = new Pessoa("Luigi");
        System.out.println(pessoa1.equals(pessoa3)); // true
        System.out.println(pessoa1.equals((Object) pessoa3)); // false, o compilador não sabe
        // que Object é Pessoa (observe o casting para Object), invoca o equals tradicional.
    }
}

class Pessoa {
    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public boolean equals(Pessoa outro) {
        return this.nome.equals(outro.nome);
    }
}
