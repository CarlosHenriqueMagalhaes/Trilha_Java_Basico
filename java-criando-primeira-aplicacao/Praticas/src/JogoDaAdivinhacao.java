/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior
ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
 */

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {

        Random random = new Random();
        int chave = random.nextInt(101); // gera um número entre 0 e 100

        System.out.println("-----Jogo da adivinhação-----");
        Scanner leitura = new Scanner(System.in);
        int chute = 0;
        int contagem = 0;

        while (chute != chave) {
            System.out.print("Digite um número da 1 a 100: ");
            chute = leitura.nextInt();

            if (chute < chave) {
                System.out.print("O número chave é MAIOR! ");
            } else {
                System.out.print("O número chave é MENOR! ");
            }
            contagem++;

        }
        System.out.println("Você acertou! O número chave é: " + chave);
        System.out.println("Numero de tentativas: " + contagem);

        if (contagem <= 1) {
            System.out.println("Você roubou??? Rank S");
        }
        if (contagem > 1 && contagem <= 5) {
            System.out.println("Incrivel! Rank A");
        }
        if (contagem > 5 && contagem <= 10) {
            System.out.println("muito bem! Rank B");
        }
        if (contagem > 11 && contagem <= 20) {
            System.out.println("Rank baixo!!!! Rank C");
        }
        if (contagem >20) {
            System.out.println("Você é muito ruim!!!! Rank D");
        }

    }

}
/*
Outra solução:

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
             System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}
 */

