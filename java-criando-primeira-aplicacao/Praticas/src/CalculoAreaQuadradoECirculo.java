/* Crie um menu que oferece duas opções ao usuário:
 "1. Calcular área do quadrado";
 "2. Calcular área do círculo";
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

// Como calcular a área do quadrado? Multiplicamos o comprimento da sua base pela sua altura.
// Como, no quadrado, a base e a altura possuem a mesma medida, a área do quadrado pode ser
// calculada pelo quadrado do lado.;

//Para calcular a área de um círculo, usa-se a fórmula A = π r², onde π é o número irracional pi
//(aproximadamente 3,1415) e r é o raio do círculo. O raio é a distância entre o centro do círculo
//e a sua extremidade

import java.util.Scanner;

public class CalculoAreaQuadradoECirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        int quadrado = 1;
        int circulo = 2;

        System.out.println("""
                Escolha:
                    1 - Para calcular a area de um quadrado;
                    2 - Para calcular a area de um circulo;
                Digite:""");

        escolha = scanner.nextInt();

        if (escolha == quadrado || escolha == circulo) {

            if (escolha == quadrado) {
                Scanner leituraQuadrado = new Scanner(System.in);
                double lado;

                System.out.println("Digite a base ou altura do quadrado para calcular sua area!");
                lado = leituraQuadrado.nextDouble();
                System.out.println("A área desse quadrado é: " + (lado * lado));

            }
            if (escolha == circulo) {
                Scanner leituraCirculo = new Scanner(System.in);
                double raio;

                System.out.println("Digite o raio do circulo para calcular sua area!");
                raio = leituraCirculo.nextDouble();
                System.out.println("A área desse circulo é: " + ((raio * raio) * 3.1415));

            }

        } else {
            System.out.println("Apenas 1 e 2 são validos!");
        }
    }
}
/*
Outra maneira de fazer:
import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
 */