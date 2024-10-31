package org.zero.construtores;

public class TestaConstrutores {
    public static void main(String[] args) {
        new Filha("Leia");//usando o String como argumento
        new Filha(88);//usando int como argumento
        new Filha("Maria", 42);
    }
}

class Mae {
    Mae(String s) {
        System.out.println("Mãe!");
    }

    Mae(int i) {
    }

    Mae(String s, int i) {
        System.out.println("Nome: " + s + " - Idade: " + i);
    }
}

class Filha extends Mae {
    Filha(String s) {
        super(s);
        System.out.println(s);
    }

    Filha(int i) {
        this("número: " + i);
        System.out.println("Fim do construtor com número");
    }

    Filha(String s, int i) {
        super(s, i);
    }
}