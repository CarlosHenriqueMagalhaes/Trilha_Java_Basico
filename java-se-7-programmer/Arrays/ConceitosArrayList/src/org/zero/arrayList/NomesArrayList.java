package org.zero.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class NomesArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Mario");
        nomes.add("Erica");
        nomes.add("Carlos");

        //size: funciona como o lenght dos arrays! Mostra o tamanho da lista
        System.out.println(nomes);//os nomes dentro da lista
        System.out.println(nomes.size());//4

        //contains: devolve um boolean verificando se o item esta ou não na lista
        System.out.println(nomes.contains("Mario"));//true

        //remove: remove um item da lista
        nomes.remove("Carlos");// remove o primero Carlos da lista
        System.out.println(nomes);

        ArrayList<String> sobrenome = new ArrayList<>();
        sobrenome.add("Henrique");
        sobrenome.add("Felicio");

        //adiciona outras ArrayList em uma nova
        ArrayList<String> tudo = new ArrayList<>();
        tudo.addAll(nomes);
        tudo.addAll(sobrenome);
        System.out.println(tudo);
        System.out.println(tudo.size());

        //get: pega o item da lista na posição desejada
        System.out.println(tudo.get(3)); //pega o quarto elemento Henrique

        //consigo adicionar a posição que quero inserir um item no .add
        //basta colocar a posição antes do elemento:
        tudo.add(2, "Nátalia");
        System.out.println(tudo);

        tudo.remove(0);// remove o item da primeira posição
        // o que esta na posição 1 vai para a posição 0
        // Mario foi removido, Erica vai ser a nova posição 0

        tudo.set(3, "Josias");// muda o valor de um item dado sua posição
        // nesse caso Henrique ira vira Josias

        tudo.indexOf("Felicio");// mostra a posição do primeiro Felicio que encontrar //4
        System.out.println(tudo.lastIndexOf("Nátalia"));//1 mostra a posição do ultimo Nátalia que encontrar

        System.out.println(tudo);

        //exemplo Iterator:
        Iterator<String> interatorTudo = tudo.iterator();

        while (interatorTudo.hasNext()) {
            String percorreListaTudo = interatorTudo.next();
            System.out.println("-> " + percorreListaTudo);
        }
    }
}

class NomesArrayListToArrays {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Sanara");
        nome.add("Josefino");
        nome.add("Tereza");

        //métodos que transforma para array:
        String nomeArrays[] = nome.toArray(new String[nome.size()]);//ou:
        String nomeArrays2[] = nome.toArray(new String[0]);//ao deixar 0,
        // o array ja é criado do tamanho certo do arrayList

    }
}

class IteratorLists {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Felipe");
        nome.add("Anderson");
        nome.add("Joelma");

        //método para percorrer uma arraylist
        Iterator<String> iterator = nome.iterator();

        // enquanto a lista tudo tiver valores
        while (iterator.hasNext()) {
            String atual = iterator.next();
            System.out.println(atual);
            //iterator.remove(); // remove os elementos da lista
        }

        System.out.println("-------------");

        // for each para percorrer a lista:
        for (String nomes : nome){
            System.out.println(nomes);
        }

    }
}