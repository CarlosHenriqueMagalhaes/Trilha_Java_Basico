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
