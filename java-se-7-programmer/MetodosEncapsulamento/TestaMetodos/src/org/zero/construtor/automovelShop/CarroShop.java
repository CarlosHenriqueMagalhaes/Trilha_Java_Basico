package org.zero.construtor.automovelShop;

public class CarroShop {
    String modelo;
    int ano;

    //construtor
    public CarroShop(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    //sobrecarga de Construtor
    public CarroShop(String modelo) {
        this.modelo = modelo;
        System.out.println("Apenas o modelo foi passado: " + modelo);
    }

    //método
    public void exibirInfoDoCarro() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);

    }

    //Inicialização e invocação
    public static void main(String[] args) {
        CarroShop carro1 = new CarroShop("Ferrari", 2016);
        carro1.exibirInfoDoCarro();

        CarroShop carro2 = new CarroShop("Opala", 1986);
        carro2.exibirInfoDoCarro();

        //invocação da sobrecarca de método
        //Como passei apenas a String ele caiu no contrutor da linha 14
        new CarroShop("Fusca");
        new CarroShop("Mercedes");
    }
}
