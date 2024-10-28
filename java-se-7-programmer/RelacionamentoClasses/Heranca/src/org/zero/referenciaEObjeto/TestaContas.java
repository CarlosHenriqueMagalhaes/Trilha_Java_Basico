package org.zero.referenciaEObjeto;

public class TestaContas {
    public static void main(String[] args) {
        //mesmo que tenho criado uma nova ContaJuridica, nem toda conta possui cnpj
        // ou seja nem toda conta é uma conta juridica
        Conta conta1 = new ContaJuridica();
        conta1.id = 896001;
        //conta1.cnpj = "256.359.648.108"; //não aceita

        //Ja aqui é herdado o id da classe pai! Assim é possível usar tanto o id,
        // quanto o cnpj, pois já esta sendo criado a ContaJuridica.
        ContaJuridica conta2 = new ContaJuridica();
        conta2.id = 350694;
        conta2.cnpj = "108.170.999.078";
    }
}
