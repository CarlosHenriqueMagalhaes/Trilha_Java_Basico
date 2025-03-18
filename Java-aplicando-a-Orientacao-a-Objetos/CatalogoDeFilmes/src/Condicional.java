public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2015;
        boolean inclusoNaPlataforma = true; //altere para false para testar a condicao
        String tipoDeConta = "plus"; //altere para normal para testar a condicao

        if (anoDeLancamento >= 2024){
            System.out.println("Lançamento");
        } else {
            System.out.println("Filme retrô");
        }

        if (inclusoNaPlataforma || tipoDeConta.equals("plus")){
            System.out.println("Assista agora!");
        } else {
            System.out.println("Adquira o plano PLUS!");
        }

    }
}
