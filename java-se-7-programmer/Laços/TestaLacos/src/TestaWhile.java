//O corpo do while é executado repetidamente até que a condição se torne falsa.
//Em outras palavras, enquanto a condição for verdadeira.
//Assim como no if, a condição de um bloco while deve ser um booleano.
public class TestaWhile {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 20) {
            System.out.println(numero++);
        }
    }
}
