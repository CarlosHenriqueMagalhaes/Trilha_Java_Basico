import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        System.out.println("++++++++++++Conta Bancaria App+++++++++++");

        String nome;
        String conta;
        int tipoConta = 0;
        int escolha = 0;
        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

        Scanner leituraNomeConta = new Scanner(System.in);
        System.out.print("Digite seu nome para acessar sua conta: ");
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

            if (tipoConta == 1 || tipoConta == 2) {
                double saldo = 0;

                if (tipoConta == 1) {
                    conta = "Conta Sálario";
                } else {
                    conta = "Conta Corrente";
                }

                while (escolha != 4) {
                    System.out.println("-------------------------------------");
                    System.out.println("Status do Cliente: ");
                    System.out.println("Cliente: " + nome);
                    System.out.println("Conta: " + conta);
                    System.out.println("Saldo: " + formato.format(saldo));
                    System.out.println("-------------------------------------");

                    Scanner operacao = new Scanner(System.in);
                    System.out.println("MENU:");
                    System.out.println("""
                            Operacoes:
                            1 - Consultar Saldo;
                            2 - Receber Valor;
                            3 - Transferir/Pagar Valor;
                            4 - Sair""");
                    System.out.println("-------------------------------------");

                    escolha = operacao.nextInt();

                    if (escolha == 1) {
                        System.out.println("Você possui o saldo de R$ " + saldo);

                    } else if (escolha == 2) {
                        Scanner leituraValorAReceber = new Scanner(System.in);
                        System.out.print("Qual valor à ser recebido? R$");
                        double valorRecebido = leituraValorAReceber.nextDouble();

                        if (valorRecebido >= 0) {
                            saldo = saldo + valorRecebido;
                            System.out.println("Recebido: R$" + formato.format(valorRecebido));
                        } else {
                            System.out.println("Valores negativos são inválidos para essa operação!");
                        }

                    } else if ((escolha == 3)) {
                        Scanner leituraTransferencia = new Scanner(System.in);
                        System.out.print("Qual o valor deseja transferir ou pagar? R$");
                        double debito = leituraTransferencia.nextDouble();
                        if(debito<saldo){
                            saldo-=debito;
                            System.out.println("Pagamento/Transferência de: R$"
                                    + formato.format(debito) + " realizada!");
                        } else{
                            System.out.println("Não há saldo suficiente para realizar esse Pagamento/Transferência");
                        }

                    } else if (escolha == 4) {
                        System.out.println("Operações Encerradas");
                    } else {
                        System.out.println("Opção de operações invalida!");
                    }

                }
                tipoConta = 3;
            } else if (tipoConta == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Digite uma opção válida!");

            }
        }

    }

}
