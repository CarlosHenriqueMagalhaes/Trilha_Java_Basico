import java.util.ArrayList;

public class TestaFor {
    public static void main(String[] args) {
        /* for
        O for tem três argumentos separados por ;.
    O primeiro é a inicialização,
    o segundo, a condição,
    e o terceiro, a atualização.

        A inicialização é executada somente uma vez no começo do for. A condição é
    verificada no começo de cada rodada (iteração). A atualização é executada
    no fim de cada iteração.

        Todos os três argumentos do for são opcionais.
 */
        for (int i = 0, j = 10; i <= 10; i++, j--) {
            System.out.println(i + " " + j);
        }

        System.out.println("----------------");
        int numeroInteiro;
        double numeroDecimal;
        for (numeroInteiro = 0, numeroDecimal = 0.01; numeroInteiro < 5; numeroInteiro++) {
            System.out.println(numeroInteiro + numeroDecimal);
        }
        System.out.println("----------------");

        /*enhanced for ou for each
            Quando vamos percorrer uma coleção de objetos ou um array, podemos usar uma versão
        simplificada do for para percorrer essa coleção de maneira simplificada.
            Essa forma simplificada é chamada de ::enhanced for::, ou ::foreach::
         */
        int listNumeros[] = {1, 3, 6, 9, 12};
        for (int i = 0; i < listNumeros.length; i++) {
            System.out.println(i); //percorrendo lista
        }
        System.out.println("numero de elementos: " + listNumeros.length);

        for (int num : listNumeros) {//enhanced for
            System.out.println(num);
        }
        System.out.println("----------------");

        //Com ArrayList
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Matheus");
        nome.add("João");
        nome.add("Maria");

        for (String nomes : nome) {
            System.out.println(nomes);
        }
    }
}