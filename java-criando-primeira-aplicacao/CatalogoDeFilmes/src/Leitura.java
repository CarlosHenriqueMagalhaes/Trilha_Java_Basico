import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o nome de um filme: ");
        String nomeFilme = leitura.nextLine();
        System.out.print("Avalie esse filme (entre 0 e 10): ");
        double notaFilme = leitura.nextDouble();

        //importante: ao entrar com a nota do filme, em double, deve-se utilizar virgula
        //para a casa decimal e não o ponto (","".") pois a classe Scanner pega a linguagem
        //de entrada do seu sistema (como normalmente é em português) a entrada para separar
        //fica sendo a virgula

        System.out.println("Filme: " + nomeFilme);
        System.out.println("Nota: " + notaFilme);

    }
}
