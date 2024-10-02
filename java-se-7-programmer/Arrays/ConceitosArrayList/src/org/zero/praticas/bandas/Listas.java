package org.zero.praticas.bandas;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas {
    public static void main(String[] args) {

        ArrayList<Banda> listaDeBandas = new ArrayList<Banda>();

        Banda novaBanda = new Banda();
        novaBanda.setNome("Linkin Park");
        //System.out.println(novaBanda.getNome()); // como alterei na classe Banda
        // o método toString, não preciso do getNome para pegar o conteudo da "referencia"

        Banda nacional = new Banda();
        nacional.setNome("Tim Maia");

        listaDeBandas.add(novaBanda);
        listaDeBandas.add(nacional);

        //Percorrendo lista com for each
        System.out.println("Primeira Lista: (for each)");
        int i = 0;
        for (Banda banda : listaDeBandas) {
            i++;
            System.out.println(i + " - " + banda);
        }
        System.out.println(" ");

        //Percorrendo lista com iterator
        System.out.println("Segunda Lista: (iterator)");
        int j = 0;
        Iterator<Banda> iterator = listaDeBandas.iterator();
        while (iterator.hasNext()) {
            Banda listaAtual = iterator.next();
            j++;
            System.out.println(j + " - " + listaAtual);
        }
        System.out.println(" ");

        ArrayList<String> novaLista = new ArrayList<>();
        novaLista.add("Black Sabbath");
        novaLista.add("Metallica");
        novaLista.add("Linkin Park");
        novaLista.add(1, "Beatles");
        novaLista.add("Capital Inicial");

        //Percorrendo lista com for each
        System.out.println("Nova Lista: (usando ArrayList de String e não de Banda)");
        for (String novaListaBanda : novaLista) {
            System.out.println(novaListaBanda);
        }
        System.out.println(" ");

        //Adicionado as duas listas em uma única:
        //Para adicionar os elementos esei o método addAll
        ArrayList<Object> listaCompleta = new ArrayList<>();
        listaCompleta.addAll(novaLista);
        listaCompleta.addAll(listaDeBandas);

        System.out.println("Lista Completa: (adicionando as duas listas em uma única");
        Iterator<Object> iteratorDaListaCompleta = listaCompleta.iterator();
        while (iteratorDaListaCompleta.hasNext()) {
            Object listaAtual = iteratorDaListaCompleta.next();
            System.out.println(listaAtual);
        }
        System.out.println(" ");

        System.out.println(listaCompleta);

    }
}
