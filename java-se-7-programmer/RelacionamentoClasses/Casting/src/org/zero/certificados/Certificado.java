package org.zero.certificados;

public class Certificado {
    public static void main(String[] args) {
        Object objetos[] = new Object[100];
        String objString = "Objeto String";
        objetos[0]= objString;

        /* Info:
            String é um objeto, porém é necessário fazer um casting
         para o Objeto identificar que naquela posição há um String,
         pois Objeto pode ser qualquer coisa! Por isso o casting ao
         recuperar o item na array
         */
        String recuperada = (String) objetos[0];//Cast String
        System.out.println(recuperada);
    }

}
