package org.zero.construtor;

// A ordem que inicializa as variaveis importa! Exemplo:
public class TestaConstrutor {
    int i;
    TestaConstrutor() {
        System.out.println(i); // vale 0 por padrão
        i = 15; // agora i vale 15
        System.out.println(i); // 15
    }

    public static void main(String[] args) {
        new TestaConstrutor();
    }
}
