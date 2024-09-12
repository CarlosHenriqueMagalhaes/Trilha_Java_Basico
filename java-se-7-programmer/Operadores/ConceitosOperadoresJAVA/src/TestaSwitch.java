public class TestaSwitch {
    public static void main(String[] args) {
        int opcao = 3; //altere esse valor para o teste

        switch(opcao){
            case 1:
                System.out.println("PRIMEIRA OPÇÃO");
            break;
            case 2:
                System.out.println("SEGUNDA OPÇÃO");
                break;
            case 3:
                System.out.println("TERCEIRA OPÇÃO");
                break;
            default:
                System.out.println("caso padrão");
        }
    }
}
