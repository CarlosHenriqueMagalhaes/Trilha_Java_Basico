import org.zero.heranca.Filha;
import org.zero.heranca.Mae;
import org.zero.heranca.Neta;

public class Main {
    public static void main(String[] args) {
        Mae teste1 = new Mae();
        teste1.imprimeMensagem();//Invoca metodo presente na classe
        //Mae

        Filha teste2 = new Filha();
        teste2.imprimeMensagem();//invocando metodo da classe herdada
        //Mae

        Neta teste3 = new Neta();
        teste3.imprimeMensagem();//invocando metodo e alterado variavel herdado da superclasse
        //Neta

        Mae teste4 = new Neta();
        teste4.imprimeMensagem();//invocando metodo e alterado variavel herdado da superclasse
        //Neta

        Neta teste5 = new Neta();
        teste5.leitura();//invocando metodo da classe herdada
        //Filha

    }
}