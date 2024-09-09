package com.org.zero.testes;

import com.org.zero.calculadora.Calculadora;

public class TesteCalculadora {

    public void testeCalculos() {
        StringBuilder label= new StringBuilder("Calculadora Básica ");

        // Objeto foi criado e atribuído a variável:
        Calculadora calc = new Calculadora();

        //foi passado os valores para o metodo calculoSoma da classe Calculadora
        //usando a referência calc:
        System.out.println(label + "Calculo Soma");
        System.out.println(calc.calculoSoma(10,5,9));//=24
        System.out.println(calc.calculoSoma(9,3));//=12
        System.out.println(calc.calculoSoma());// =0

        System.out.println(label + "Calculo Subtração");
        System.out.println(calc.calculoSubtracao(10,5,3));//2
        System.out.println(calc.calculoSubtracao(30,15));//15
        System.out.println(calc.calculoSubtracao(2,10,10,10));//-28
        System.out.println(calc.calculoSubtracao());// =0

        System.out.println(label.append("Calculo Multiplicação"));//usando a classe StringBuilder para exemplo.
        System.out.println(calc.calculoMultiplicacao(0));//1
        System.out.println(calc.calculoMultiplicacao(2,3));//6
        System.out.println(calc.calculoMultiplicacao(2,5,2,6));//120
        System.out.println(calc.calculoMultiplicacao());//1
    }

}
