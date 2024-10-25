package org.zero.polimorfismo;

public class TestaSubscrita {
    static void metodoPolimorfico(Veiculo veiculo) {
        veiculo.ligaVeiculo();
    }

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.ligaVeiculo();//Liga veiculo!

        Veiculo h1 = new Helicoptero(); // polimorfismo
        h1.ligaVeiculo();//Helicoptero ligado

        metodoPolimorfico(new Carro());//Liga veiculo!
        metodoPolimorfico(new Veiculo());//Liga veiculo!
        metodoPolimorfico(new Helicoptero());//Helicoptero ligado
        metodoPolimorfico(new Moto()); // Liga veiculo! Ran dan dan
    }
}
