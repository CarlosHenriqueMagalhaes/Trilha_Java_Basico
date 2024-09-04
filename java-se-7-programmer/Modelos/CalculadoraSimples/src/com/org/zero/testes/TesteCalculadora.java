package com.org.zero.testes;

import com.org.zero.calculadora.Calculadora;

public class TesteCalculadora {

    public void testeCalculoSoma() {
        // Objeto foi criado e atribuído a variável:
        Calculadora calc = new Calculadora();

        //foi passado os valores para o metodo calculoSoma da classe Calculadora
        //usando a referência calc:
        System.out.println(calc.calculoSoma(10,5,9));//=24
        System.out.println(calc.calculoSoma(9,3));//=12
        System.out.println(calc.calculoSoma());// =0
    }
}
