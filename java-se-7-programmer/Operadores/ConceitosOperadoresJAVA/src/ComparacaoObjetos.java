/*Comparação de Strings:
para de fato compararmos o conteudo de uma String, por outra, usamos o .equals
no caso o nome == nome2 também retorna true pois o conteudo "Mario" é salvo na "POOL"
de Strings, mas como new em nome3 cria um novo objeto, isso não acontece.
Já == apenas verifica se as duas variaveis estão apontando para a mesma referência.
 */

public class ComparacaoObjetos {
    public static void main(String[] args) {
        String nome = "Mario";
        String nome2 = "Mario";
        String nome3 = new String("Mario");
        String nomeConcatenado = "Ma" + "rio";

        System.out.println(nome == nome3);//false
        System.out.println(nome == nome2);//true
        System.out.println(nome.equals(nome3));//true
        System.out.println(nome == nomeConcatenado);//true

        String a = "a";
        String ab = a + "b"; //usando uma referência e um literal
        System.out.println("ab" == ab); // false

        String str = "um texto qualquer";
        String txt1 = "texto";
        String txt2 = str.substring(3, 8); //cria uma nova string
        System.out.println(txt1 == txt2); // false
        System.out.println(txt1.equals(str.substring(3, 8))); // true

        String strHelloWorld = "HELLO WORLD";
        String upper = strHelloWorld.toUpperCase();          // já está maiúscula
        String subs = strHelloWorld.substring(0, 11);         // string completa
        System.out.println(strHelloWorld == upper);          // true
        System.out.println(strHelloWorld == subs);           // true
        System.out.println(strHelloWorld == strHelloWorld.toString()); // true
    }
}
