/* 1- Crie um programa que solicite ao usuário digitar um número. Se o número for
positivo, exiba: "Número positivo", caso contrário, exiba "Número negativo".*/

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = leitura.nextInt();

        if (numero < 0) {
            System.out.println("Número NEGATIVO");
        } else {
            System.out.println("Número POSITIVO");
        }
    }
}
