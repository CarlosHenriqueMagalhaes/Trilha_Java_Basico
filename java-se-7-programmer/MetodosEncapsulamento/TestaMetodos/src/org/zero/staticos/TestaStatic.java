package org.zero.staticos;

import org.zero.staticos.automoveis.Carros;
import org.zero.staticos.automoveis.Motos;

public class TestaStatic {
    public static void main(String[] args) {
        // consigo acessar porque total de motos é statico
        //Isso quer dizer que "totaDeMotos" pertence a classe e não ao objeto
        //sendo assim não tenho que criar uma nova moto para usar o total de motos!
        Motos.totalDeMotos = 20;

        //usando static da variavel (é possivel alterar valor)
        System.out.println("Total de motos: " + Motos.totalDeMotos);

        // usando static do metodo, a variavel só tem seu valor alterado no método
        System.out.println("Total de carros: " + Carros.getTotalDeCarros());
    }
}
