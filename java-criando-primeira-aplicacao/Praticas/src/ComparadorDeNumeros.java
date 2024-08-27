/* Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem
 indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/


import java.util.Scanner;

public class ComparadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro número é maior que o segundo: "
                        + primeiroNumero + " > " + segundoNumero);
            } else {
                System.out.println("O primeiro número é menor que o segundo: "
                        + primeiroNumero + " < " + segundoNumero);
            }
        }

    }
}
