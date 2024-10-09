import org.zero.metodos.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora result = new Calculadora();

        System.out.println(result.mensagem());

        System.out.println(result.somador(6,8,65));
        System.out.println(result.somador(9,8,3,2,1,15));
        System.out.println(result.somador(1,1));
        System.out.println(result.somador(-15,3,2,-99));//deve retornar 0 pela logica criada no método

        result.mensagemFinal(); // como não retorna nada não precisa do sout
    }
}
