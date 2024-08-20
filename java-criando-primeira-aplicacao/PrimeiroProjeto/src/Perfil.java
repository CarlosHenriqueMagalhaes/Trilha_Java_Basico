import java.util.Scanner;

public class Perfil {
    public static void main (String[] args){
// A classe Scanner permite a entrada de dados, usamos o System.in conforme abaixo:
        Scanner seuNome = new Scanner(System.in);
        System.out.println("Qual o seu nome?");

        String nomeDigitado = seuNome.nextLine();

        System.out.println("Olá, "+ nomeDigitado + "! Tudo bem?");

        // Essa é a maneira que o "curso" esperava:
        //System.out.println("Olá, <seu nome>! Tudo bem?");
    }
}
