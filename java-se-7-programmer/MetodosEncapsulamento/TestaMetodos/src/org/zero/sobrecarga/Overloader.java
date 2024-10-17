package org.zero.sobrecarga;

public class Overloader {

    //Mesmo nome os dois métodos, um exige argumentos para entrar nele, o outro não!
    //Ocorreu uma "sobrecarga de métodos"
    public void metodo(){
        System.out.println("Sem argumento");
    }

    public void metodo (int a){
        System.out.println("com int");
    }

    public void metodo (String s){
        System.out.println("com String");
    }

    //Nesse caso ele só entrara no metodo se ele for "forçado", pois na classe TestaOverload
    //é usado uma String como argumento, assim o copilador usa o mais genérico.
    public void metodo (Object o){
        System.out.println("com Object");
    }

    public void metodo (int a, int b, String c){
        System.out.println("Com int, int e String");
    }
}
