import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Digite a nota do filme ou -1 para sair: ");
            notaFilme = leitura.nextInt();

            if (notaFilme != -1) {
                media += notaFilme;
                totalDeNotas++;
            }

        }
        if (media != 0){
            System.out.println("A média das notas é: " + media/totalDeNotas);
        }else{
            System.out.println("Obrigado pela avaliação!");
        }

    }
}
