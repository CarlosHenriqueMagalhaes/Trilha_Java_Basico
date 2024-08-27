/*
Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar
e exiba uma mensagem correspondente
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numeroEntrada = 0;


        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");

        numeroEntrada = leitura.nextInt();

        // O operador % é o resto da divisão o resto da divisão de qualquer numero par por 2 é 0)
        // também poderia fazer: if ((numeroEntrada % 2) == 0)
        if ((numeroEntrada % 2) != 0) {
            System.out.println("O número: " + numeroEntrada + " é ÍMPAR");
        } else {
            System.out.println("O número: " + numeroEntrada + " é PAR");
        }
    }
}
