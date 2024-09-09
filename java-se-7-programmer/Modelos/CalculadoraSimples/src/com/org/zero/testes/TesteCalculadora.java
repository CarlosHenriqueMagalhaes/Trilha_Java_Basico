package com.org.zero.testes;

import com.org.zero.calculadora.Calculadora;
import org.w3c.dom.ls.LSOutput;

public class TesteCalculadora {

    public void testeCalculoSoma() {
        // Objeto foi criado e atribuído a variável:
        Calculadora calc = new Calculadora();

        //foi passado os valores para o metodo calculoSoma da classe Calculadora
        //usando a referência calc:
        System.out.println("Calculo Soma");
        System.out.println(calc.calculoSoma(10,5,9));//=24
        System.out.println(calc.calculoSoma(9,3));//=12
        System.out.println(calc.calculoSoma());// =0

        System.out.println("Calculo Subtração");
        System.out.println(calc.calculoSubtracao(10,5,3));//2
        System.out.println(calc.calculoSubtracao(30,15));//15
        System.out.println(calc.calculoSubtracao(2,10,10,10));//-28
        System.out.println(calc.calculoSubtracao());// =0
    }

}
