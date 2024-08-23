import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double notaFilme = 0;

        //Sobre esse "for": i começa em 0, enquanto i for menor que 3 ele corre o codigo
        //dentro do "for", i++ o i soma em +1 e o codigo repete, até ele bater e "3" e
        // parar, encerrando assim o laço/loop
        // nesse exemplo a variavel média vai se acumulando a cada loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite uma nota para o filme: ");
            notaFilme = leitura.nextDouble();

            // media = media + nota do filme; simplificado:
            media += notaFilme;
        }

        System.out.println("A média das notas é: " + media/3);

    }
}
