import java.util.Scanner;

public class PraticaConceitos {

    public static void main(String[] args) {
        //saida de textos:
        System.out.println("Relembrando conceitos:");
        System.out.println("---------------------------------------------------");

        //Concatenar:
        String palavraAmor = " Amor ";
        String palavraOdio = " Ódio";
        char letraO = 'O';
        char letraE = 'e';
        System.out.println(letraO + palavraAmor + letraE + palavraOdio);

        //text blocks:
        System.out.println("""
                O test blocks realiza a fatoração do texto, conforme esse exemplo!
                    É usado as duas aspas no começo do texto que sera digitado!""");
        System.out.println("---------------------------------------------------");

        //casting:
        double numeroCasasDecimais = 4.6;
        int numeroInteiro = 6;
        int castingSoma = numeroInteiro + (int) numeroCasasDecimais;
        System.out.println("""
                     O casting transforma um número de um tipo para outro
                nesse caso o número esperado é um numero inteiro (variavel castingSoma)
                assim o double tem que ser tranformado, basta adicionar o tipo a ser
                transformado entre parenteses em frente à variavel criada.
                     O valor da soma é: """
                + castingSoma);
        System.out.println("---------------------------------------------------");

        //Condicional if else:
        int valor1 = 5; //mude para um valor acima de 10
        String passagem = "passa"; //mude para "negado"

        if (valor1 < 10) {
            System.out.println("Entrou no if!");
        } else {
            System.out.println("Nao entrou no if!");
        }

        if (passagem.equals("passa")) {
            System.out.println("Entrada da passagem liberada");
        } else {
            System.out.println("Passagem revogada!");
        }
        System.out.println("---------------------------------------------------");

        //Switch case:
        int numeroEmIngles = 2;
        switch (numeroEmIngles) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
        System.out.println("---------------------------------------------------");

        //Scanner
        Scanner leitura = new Scanner(System.in);

        int valorInteiro;
        double valorDouble;
        String nome;

        System.out.print("Entre com seu nome: ");
        nome = leitura.nextLine();
        System.out.print("Digite um valor inteiro: ");
        valorInteiro = leitura.nextInt();
        System.out.print("Digit em valor com virgula: ");
        valorDouble = leitura.nextDouble();
        System.out.println(nome + ", o resultado da soma é: " + ((int) valorDouble + valorInteiro));
        System.out.println("---------------------------------------------------");

        //For
        int valor;
        for (valor = 1; valor <= 4; valor++) {
            System.out.println("O loop passou aqui: " + valor + " vezes!");
        }
        System.out.println("O valor de valor agora é: " + valor);
    }
}
