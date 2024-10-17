package org.zero.exercicios;

public class TestaStatic {
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
/////////////////////////////////////////////

class BlocoA {
    void y() {
        this.z();
    }

    static void z() {
        System.out.println("z");
    }
}

class TestaStatic2 {
    public static void main(String[] args) {
        new TestaStatic2().x();
    }

    static void x() {
        new BlocoA().y();
    }
}
/////////////////////////////////////////////

class BlocoB {
    static void x() {
        System.out.println("x");
    }

    static void y() {
        System.out.println("y");
    }
}

class TestaStatic3 extends BlocoB {
    public static void main(String[] args) {
        x();
        TestaStatic3.y();
    }
}
