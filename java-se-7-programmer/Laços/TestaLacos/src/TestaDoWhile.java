public class TestaDoWhile {
    public static void main(String[] args) {
        System.out.println("-----while----");
        //while: faz a verificação, depois executa
        int i = 1;
        while (i < 1) {
            System.out.println(i);//não vai imprimir i, ja foi realizado a validação/verificaçao
            i++;
        }

        System.out.println("----do while----");
        //do while: executa, depois faz a verivicação
        int j = 1;
        do {
            System.out.println(j);// vai imprimir j, ainda vai ser realizado a validação/verificaçao
            j++;
        } while (j < 1);
    }
}

