package org.zero.exercicios;

public class TestaPositivoOuNegativo {
    public String positivoNegativo(int numero) {
        if (numero > 1) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Zero";

        }
    }
}

class InvocaPositivoNegativo {
    public static void main(String[] args) {
        TestaPositivoOuNegativo testes = new TestaPositivoOuNegativo();

        System.out.println(testes.positivoNegativo(7));
        System.out.println(testes.positivoNegativo(0));
        System.out.println(testes.positivoNegativo(-9));
    }
}
