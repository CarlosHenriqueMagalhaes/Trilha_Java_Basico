package org.zero.metodos;

//Essa classe e esses métodos são invocado na classe Main;
public class Calculadora {

    //esse metodo deve retornar uma String
    public String mensagem() {
        return "Calculadora: ";
    }

    //O método deve sre publico para ser invocado
    //um método sempre deve ter um retorno, a não ser que ele seja void
    //esse metodo deve retornar um int
    public int somador(int... valores) {
        int resultadoSoma = 0;

        for (int i = 0; i < valores.length; i++) {
            resultadoSoma += valores[i];
        }
        if (resultadoSoma < 0) { //sempre que um valor for negativo ele deve retornar 0
            return 0;
        }

        return resultadoSoma;
    }

    public int subtracao(int... valores) {
        int resultadoSubtracao = valores[0];

        for (int i = 1; i < valores.length; i++) { //i deve começar em 1 para não subtrair do primeiro valor
            resultadoSubtracao -= valores[i];
        }
        return resultadoSubtracao;

    }

    //metodos void não retornam nada! Apenas executam o que esta em seu bloco
    public void mensagemFinal() {
        System.out.println("FIM!");
    }

}
