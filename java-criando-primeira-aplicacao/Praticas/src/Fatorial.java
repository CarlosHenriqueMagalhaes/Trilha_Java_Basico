/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
Fatorial:
O fatorial é uma operação que, ao aumentar o valor de n, o resultado também aumentará muito. Por exemplo:
  4! =4 · 3 · 2 · 1 = 24,
  5! = 5 · 4 · 3 · 2 · 1= 120,
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numeroDeEntrada = 0;
        int fatorial = 1;

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número para obter seu fatorial: ");
        numeroDeEntrada = leitura.nextInt();

        for (int i = 1; i <= numeroDeEntrada; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numeroDeEntrada + " é " + fatorial);
    }
}
