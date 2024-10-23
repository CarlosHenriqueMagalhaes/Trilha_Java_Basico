package org.zero.exercicios;

public class TestaReferencia {
}

class Prova {
    int tempo;
}

class TestaReferenciaEPrimitivo {
    public static void main(String[] args) {
        Prova prova = new Prova();
        prova.tempo = 100;
        teste(prova); // invoca o método teste
        System.out.println(prova.tempo); // printa 210 que é o valor
        // referenciado agora (após a invocação do método

        teste2(prova); // invoca o metodo teste2
        System.out.println(prova.tempo); // imprime 210, pois esta referenciando o mesmo Objeto.
        // o metodo teste2 criou um novo Objeto, e peara printa-lo devemos referenciar a ele!


        int i = 2;
        i = teste(i);
        System.out.println(i);// imprime 5, pois ao invocar o metodo teste a variavel
        // i que era 2 passou a ser 5, nesse caso dos primitivos é alterado o valor e não a referência
    }
    static void teste2(Prova prova) {
        prova = new Prova();
        prova.tempo = 520;
    }

    static void teste(Prova prova) {
        prova.tempo = 210;
    }

    static int teste(int i) {
        i = 5;
        System.out.println(i); // imprime 5, o valor foi alterado de 2 para 5 na linha acima
        return i; // esse retorno vai refletir na mudança do objeto e não na referencia
    }
}
