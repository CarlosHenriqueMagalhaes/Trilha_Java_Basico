public class OperadoresIncrementosEDecrementos {
    public static void main(String[] args) {
        int i = 5;

        // 5 - pós-incremento, i agora vale 6
        System.out.println(i++);

        // 6 - pós-decremento, i agora vale 5
        System.out.println(i--);

        // 5
        System.out.println(i);
        System.out.println("--------------------");

        System.out.println(++i);    // 6 - pré-incremento
        System.out.println(--i);    // 5 - pré-decremento
        System.out.println(i);      // 5
        System.out.println("--------------------");

        int a = 10;

        // 10, primeiro imprime, depois incrementa
        System.out.println(a++);

        // 11, valor já incrementado.
        System.out.println(a);

        // 12, incrementa primeiro, depois imprime
        System.out.println(++a);

        // 12, valor incrementado.
        System.out.println(a);
        System.out.println("--------------------");

        // para somar 2 em a
        a = a + 2;

        //podemos obter o mesmo resultado com:
        a += 2;

        //exemplos de operadores:
        //lembrando que i vale 5
        i += 10; //soma e atribui
        System.out.println(i);        // 15

        i -= 10; //subtrai e atribui
        System.out.println(i);        // 5

        i *= 3; // multiplica e atribui
        System.out.println(i);        // 15

        i /= 3; // divide a atribui
        System.out.println(i);        // 5

        i %= 2; // divide por 2, e atribui o resto
        System.out.println(i);        // 1

        System.out.println(i += 3); // soma 3 e retorna o resultado: 4
        System.out.println("--------------------");

        byte b1 = 3; // compila, dá um desconto
        //b1 = b1 + 4; // não compila, conta com int devolve int

        byte b2 = 3; // compila, dá um desconto
        b2 += 4; // compila também, compilador gente boa!

        a = 10;
        a += ++a + a + ++a; //44
        //a += ++a + a + ++a;
        // a = a + ++a + a + ++a;
        // a = 10 +11 + a + ++a;
        //a = 10 + 11 + 11 + ++a;
        //a = 10 + 11 + 11 + 12;
        //a = 44; // a passa a valer 44
        System.out.println(a);
        System.out.println("--------------------");

        int j = 0;
        int i2 = (j++ * j + j++);
        System.out.println(i2);
        System.out.println(j);
        System.out.println("--------------------");

        i = (0 * j + j++); // j vale 1
        i = (0 * 1 + j++); // j vale 1
        i = (0 * 1 + 1); // j vale 2
        i = 1; // j vale 2


        int a3 = 15, b = 20, c = 30;
        a = b = c; // b = 30, portanto a = 30
        a = (b = c + 5) + 5; // c = 30, portanto b = 35, portanto a = 40
    }
}
