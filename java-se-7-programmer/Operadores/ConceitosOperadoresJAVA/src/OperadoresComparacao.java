public class OperadoresComparacao {
    public static void main(String[] args) {

        System.out.println(1 == 1);        // true.
        System.out.println(1 != 1);        // false.
        System.out.println(2 < 1);        // false.
        System.out.println(2 > 1);        // true.
        System.out.println(1 >= 1);        // true.
        System.out.println(2 <= 1);        // false.

        // true.
        System.out.println(1 == 1.0);

        // true.
        System.out.println(1 == 1);

        // true. 1.0 float é 1.0 double
        System.out.println(1.0f == 1.0d);

        // true. 1.0 float é 1 long
        System.out.println(1.0f == 1l);

        // não compila, tipo não primitivo só aceita != e ==
        //System.out.println("Mario" > "Luigi");

        // não compila, boolean só aceita != e ==
        //System.out.println(true < false);

        // não compila, boolean é boolean
        //System.out.println(true == 1);

        // compila, 'a' tem valor numérico também
        System.out.println('a' > 1);

        int a = 5;
        System.out.println(a = 5); // não imprime true, imprime 5
    }
}
