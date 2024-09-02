/*
Pacotes:
Pacotes servem para separar e organizar as diversas classes que temos
em nossos sistemas. Todas as classes pertencem a um pacote, sendo que,
caso o pacote não seja explicitamente declarado, a classe fará parte do
que chamamos de pacote padrão, ou default package. Todas as classes no
default package se enxergam e podem ser utilizadas entre si. Classes no
pacote default não podem ser importadas para uso em outros pacotes.
    Para definir qual o pacote a que a classe pertence, usamos a palavra-chave
package, seguida do nome do pacote. Só pode existir um único package definido
por arquivo, e ele deve ser a primeira instrução do arquivo. Após a definição
do package, devemos finalizar a instrução com um ;.
 */

// Declaração de pacote
package org.zero;

// imports

/*
Uma classe é a forma no Java onde definimos os atributos e comportamentos
de um objeto. A declaração de uma classe pode ser bem simples, apenas a
palavra class seguida do nome e de {}.
Dentro de uma classe, podemos ter variáveis, métodos e construtores.
Essas estruturas são chamadas de membros da classe.
 */

// Declaração da classe
class Pessoa {
// conteúdo da classe

    /*Classe:
    Usando como exemplo a classe Pessoa definida, nome e sobrenome são
variáveis. A declaração de variáveis é bem simples, sempre o tipo seguido
do nome da variável. Dizemos que essas são variáveis de instância, pois existe
uma cópia delas para cada objeto Pessoa criado em nosso programa. Cada cópia
guarda o estado de uma certa instância desses objetos.
    Existem ainda variáveis que não guardam valores ou referências para uma
determinada instância, mas sim um valor compartilhado por todas as instâncias
de objetos. Essas são variáveis estáticas, definidas com a palavra-chave static.
    */
    String nome;
    String sobrenome;

    /*Construtores:
    Construtores
Uma classe pode possuir zero ou vários construtores. Nossa classe Pessoa
possui um construtor que recebe como parâmetros o nome e o sobrenome da pessoa.
A principal diferença entre a declaração de um método e um construtor é que um
construtor não tem retorno e possui o mesmo nome da classe.
    */
    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    /*Métodos:
    A declaração de métodos é um pouquinho diferente pois precisamos do tipo
do retorno, seguido do nome do método e seguido de parênteses, sendo que pode
ou não haver parâmetros de entrada desse método. Cada parâmetro é uma declaração
de variável em si. Essa linha do método, onde está definido o retorno, o nome e
os parâmetros é onde temos a assinatura do método. Cuidado, pois a assinatura de um
método inclui somente o nome do método e os tipos dos parâmetros.
    Assim como variáveis, métodos também podem ser static.
    */
    public String getNomeCompleto() {
        return this.nome + this.sobrenome;
    }

}

