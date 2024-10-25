package org.zero.praticas;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExerciciosPolimorfismo {
}

class Ba {
    void x() throws IOException {
        System.out.println("c");
    }
}
class Ca extends Ba {
    void x() throws FileNotFoundException {
        System.out.println("b");
    }
}
class Aa {
    public static void main(String[] args) throws IOException {
        new Ca().x();
    }
}
