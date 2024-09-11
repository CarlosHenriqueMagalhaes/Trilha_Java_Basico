public class OperadoresLogicos {
    public static void main(String[] args) {

        System.out.println(1 == 1 & 1 > 2);    // false.
        System.out.println(1 == 1 | 2 > 1);    // true.
        System.out.println(1 == 1 ^ 2 > 1);    // false.
        System.out.println(!(1 == 1));        // false.
        System.out.println("-----------");

        System.out.println(1 != 1 && 1 > 2);
        // false, o segundo termo não é avaliado.

        System.out.println(1 == 1 || 2 > 1);
        // true, o segundo termo não é avaliado.
        System.out.println("-----------");

        int i = 10;
        System.out.println(i == 2 & i++ == 0);
        // imprime false, soma mesmo assim
        System.out.println(i);
        // imprime 11
        System.out.println("-----------");

        int j = 10;
        System.out.println(j == 2 && j++ == 0);
        // imprime false, não soma
        System.out.println(j);
        // imprime 10
    }
}

