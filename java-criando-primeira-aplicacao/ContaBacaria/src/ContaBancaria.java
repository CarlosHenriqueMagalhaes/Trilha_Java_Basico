import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        System.out.println("++++++++++++Conta Bancaria App+++++++++++");
        String nome;
        int tipoConta = 0;

        Scanner leituraNomeConta = new Scanner(System.in);
        System.out.print("Digite se nome para abrir uma conta: ");
        nome = leituraNomeConta.nextLine();

        while (tipoConta != 3) {

            Scanner leiruraTipoConta = new Scanner(System.in);
            System.out.println("***************MENU***********************");
            System.out.println("""
                    Escolha o tipo da conta:
                    1 - conta salario;
                    2 - conta  corrente;
                    3 - sair""");
            System.out.println("**************************************");

            tipoConta = leiruraTipoConta.nextInt();

            if (tipoConta == 1) {
                System.out.println("Conta Salario");
                tipoConta = 3;
            } else if (tipoConta == 2) {
                System.out.println("Conta Corrente");
                tipoConta = 3;
            } else if (tipoConta == 3 ){
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Digite uma opção válida");

            }
        }

    }


}
