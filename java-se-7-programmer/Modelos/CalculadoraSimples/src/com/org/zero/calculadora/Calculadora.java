/*
Explicação do código:
    O (int.. valores) significa que pode ter valores infinitos, por exemplo:
se eu deixar (int valorA, int ValorB) só podera ser somado dois valores.
    No código que você forneceu, valores.length é usado para obter o número
de elementos no array valores. Isso é necessário porque o método calculoSoma
recebe um número variável de parâmetros, representados pelo parâmetro int... valores,
que é um array de inteiros.
    No loop for, valores.length é usado como condição de parada, para que o loop intere
sobre todos os elementos do array valores. Em outras palavras, valores.length
indica quantos elementos estão presentes no array valores, e o loop for itera
sobre cada um deles, somando-os à variável soma.
    Se você não usasse valores.length, não teria como saber quantos elementos estão
presentes no array valores, e o loop for não saberia quando parar.
 */

package com.org.zero.calculadora;

public class Calculadora {

    public int calculoSoma(int... valores) {
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }


}
