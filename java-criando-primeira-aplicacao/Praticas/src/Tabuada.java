/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("----------------Tabuada---------------");
        Scanner leitura = new Scanner(System.in);
        int numero;
        int resultado = 0;

        System.out.print("Digite um número para obter a tabuada: ");
        numero = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = (numero * i);
            System.out.println(numero + " X " + i + " = " + resultado);

        }
    }
}
