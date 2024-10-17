package org.zero.exercicios;

public class TestaStatic {
    public static void main(String[] args) {
        System.out.println("Testes usando static");
    }
}

class TesteA {
    public static void main(String[] args) {
        x();
    }

    static void x() {
        System.out.println("x");
        y();
    }

    static void y() {
        System.out.println("y");
    }
}
////////////////////////////////////

class BlocoB {
    void y() {
        this.z();
    }

    static void z() {
        System.out.println("z");
    }
}

class BlocoA {
    public static void main(String[] args) {
        new BlocoA().x();
    }

    static void x() {
        new BlocoB().y();
    }
}
/////////////////////////////////////////////

class B {
    static void x() {
        System.out.println("x");
    }

    static void y() {
        System.out.println("y");
    }
}

class A extends B {
    public static void main(String[] args) {
        x();
        A.y();
    }
}
