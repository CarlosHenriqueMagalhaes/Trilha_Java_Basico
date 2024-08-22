/*
Essa classe testa a Condicional usando if/else e o switch case
 */

public class DiasDaSemana {
    public static void main(String[] args) {
        int diaDaSemana = 5;
        String nomeDoDia = "";

        if (diaDaSemana == 0 || diaDaSemana > 7) {
            System.out.println("Não existe esse dia da semana");
        } else {
            switch (diaDaSemana) {
                case 1:
                    nomeDoDia = "domingo";
                    break;
                case 2:
                    nomeDoDia = "segunda-feira";
                    break;
                case 3:
                    nomeDoDia = "terça-feira";
                    break;
                case 4:
                    nomeDoDia = "quarta-feira";
                    break;
                case 5:
                    nomeDoDia = "quinta-feira";
                    break;
                case 6:
                    nomeDoDia = "sexta-feira";
                    break;
                case 7:
                    nomeDoDia = "sabado";
                    break;

            }
        /* Também pode ser feito assim de forma simplificada:
        nomeDoDia = switch (diaDaSemana) {
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sabado";
            default -> nomeDoDia;
        };
        */
            System.out.println(nomeDoDia);

        }
    }
}
