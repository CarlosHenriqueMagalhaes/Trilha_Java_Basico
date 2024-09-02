package org.zero;

/*
Além de classes, também podemos declarar interfaces em nossos arquivos
java. Para definir uma interface usamos a palavra reservada interface:
Em uma interface, devemos apenas definir a assinatura do método,
sem a sua implementação. Além da assinatura de métodos, também é possível
declarar constantes em interfaces.
 */
interface Autenticavel {

    final int TAMANHO_SENHA = 8;

    void autentica(String login, String senha);
}