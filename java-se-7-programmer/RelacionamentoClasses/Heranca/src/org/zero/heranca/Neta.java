package org.zero.heranca;

public class Neta extends Filha {
    @Override
    public void imprimeMensagem() {
        mensagem = "Neta";
        super.imprimeMensagem();
    }
}
