public class Contador {
    public static void main(String[] args) {
        int contador = 1;
                while (contador <= 10){
                    System.out.println("Contagem laço com while: " + contador);
                    contador++;
                }

                for (contador= 1; contador<=10; contador++ ){
                    System.out.println("Contagem laço com for: " + contador);
                }
    }
}
