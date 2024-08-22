import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite uma nota para o filme: ");
            notaFilme = leitura.nextDouble();
            media += notaFilme;
        }

        System.out.println("A média das notas é: " + media/3);

    }
}
