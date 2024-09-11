public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int dois = 2;
        int dez = 10;

        // Fazendo uma soma com o operador "+".
        int doze = dois + dez;

        // Fazendo uma subtração com o operador "-".
        int oito = dez - dois;

        // Fazendo uma multiplicação com o operador "*".
        int vinte = dois * dez;

        // Fazendo uma divisão com o operador "/".
        int cinco = dez / dois;

        // Calculando o resto da divisão de 10 por 2.
        int zero = dez % dois;

        int idade = 15;
        long anos = 5;

        // ok, o maior tipo era long
        long daquiCincoAnos = idade + anos;

        // não compila, o maior tipo era long, devolve long
        //int daquiCincoAnos2 = idade + anos;


        byte numeroByte = 1;
        short numeroShort = 2;

        // devolve no mínimo int, compila
        int numeroInteiro = numeroByte + numeroShort;

        // não compila, ele devolve no mínimo int
        //numeroByte = numeroInteiro + numeroShort;

        // compila forçando o casting, correndo risco de perder
        // informação
        byte numeroByte2 = (byte) (numeroInteiro + numeroShort);

        numeroInteiro = 200;
        int valor = 0;

        // compila, mas exception
        //System.out.println(numeroInteiro / valor);

        // compila e roda, infinito positivo
        System.out.println(numeroInteiro / 0.0);

        double positivoInfinito = 100 / 0.0;
        double negativoInfinito = -100 / 0.0;

        // número não definido (NaN)
        System.out.println(positivoInfinito + negativoInfinito);
    }
}
