package org.zero.praticas;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercicios {
}

class Veiculo {
    protected void liga () throws IOException {}
}

//A reescrita é válida, pois FileNotFoundException é subclasse de IOException.
class Carro extends Veiculo {
    public void liga() throws FileNotFoundException {}
}

class B {
    protected String s = "a";
    protected B() {}
    static A B(String s) {
        return new A(s);
    }
}

class A extends B {
    A(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        A b = A.B("t");
        System.out.println(b.s);
    }
}