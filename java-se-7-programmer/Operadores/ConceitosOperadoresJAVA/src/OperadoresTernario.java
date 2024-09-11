/* Operador ternário - Condicional:
Há também um operador para controle de fluxo do programa, como um if. É chamado de
operador ternário. Se determinada condição acontecer, ele vai por um caminho, caso
contrário vai por outro.

A estrutura do operador ternário é a seguinte:

variável = teste_booleano ? valor_se_verdadeiro : valor_se_falso;
 */

public class OperadoresTernario {
    public static void main(String[] args) {

        int i = 5;
        System.out.println(i == 5 ? "verdadeiro": "falso");// verdadeiro
        System.out.println(i != 5 ? 1: 2);                 // 2

        String mensagem = i % 2 == 0 ? "é par" : "é ímpar";
        System.out.println("A sobra da divisão de " + i + " por 2 " + mensagem);
    }
}
