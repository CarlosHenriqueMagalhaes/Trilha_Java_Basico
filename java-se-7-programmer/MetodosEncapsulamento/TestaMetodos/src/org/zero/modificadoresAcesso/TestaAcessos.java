package org.zero.modificadoresAcesso;

public class TestaAcessos {
    public static void main(String[] args) {

        //Só são acessados na própria classe
        ExemploPrivate acessoItemPrivado = new ExemploPrivate();
        //acessoItemPrivado.nomePrivado = "não acessa";

        //Acessados no mesmo pacote
        ExemploProtected acessoItemProtected = new ExemploProtected();
        acessoItemProtected.nomeProtegido = "acessado";

        //Acessado por qualquer classe
        ExemploPublic acessoItemPublico = new ExemploPublic();
        acessoItemPublico.nome = "acessado";
    }
}
