public class TestaBreakContinue {
    public static void main(String[] args) {
        System.out.println("---While break:---");
        int i = 1;
        while (i < 10) {
            i++;
            if (i == 5)
                break; // sai do while com i valendo 5
            System.out.println(i);
        }
        System.out.println("Fim");

        System.out.println("---While continue:---");
        int j = 1;
        while (j < 10) {
            j++;
            if (j == 5)
                continue; // vai para a condição com o j valendo 5
            System.out.println(j);
        }

        System.out.println("---for break e continue:---");
        for (int k = 1; k < 10; k++) {
            if (k == 8) {
                break; // sai do for sem executar mais nada do laço.
            }
            if (k == 5) {
                // pula para a atualização sem executar o resto do corpo.
                continue;
            }
            System.out.println(k);
        }

        /* Usando labels:
        for (int i = 1; i < 10; i++) { //laço externo
            for (int j = 1; j < 10; j++) { // laço interno
                if (i * j == 25)    {
            break; // qual for será quebrado?
         */

        System.out.println("---Break com label:---");
        externo:
        for (int l = 1; l < 10; l++) {
            interno:
            for (int m = 1; m < 10; m++) {
                if (l * m == 25) {
                    break externo; // quebrando o for externo
                }
                if (l * m == 16) {
                    continue interno; // pulando um iteração do for interno
                }
            }
        }
    }
}

class TestaBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 4)
                break;
        }
    }
}

class TestaBreakContinueSwitchCase {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println("Estou antes do switch");
            label:
            segundoLabel:
            switch (i) {
                case 0:
                case 1:
                    System.out.println("Caso " + i);
                    for (int j = 0; j < 3; j++) {
                        System.out.println(j);
                        if (j == 1) break label;
                    }
                case 2:
                    System.out.println("Estou em i = " + i);
                    continue;
                case 3:
                    System.out.println("Cheguei no 3");
                    break;
                default:
                    System.out.println("Estranho...");
                    break;
            }
            System.out.println("Estou apos o switch");
        }
    }
}

class TestaLacosLabelFor {
    public static void main(String[] args) {
        fora:
        for (int a = 0; a < 30; a++)
            for (int b = 0; b < 1; b++)
                if (a + b == 25) continue fora;
                else if (a + b == 20) break;
                else System.out.println(a);//imprime 0 até 19, 21 até 24, 26 até 29.
    }
}

class TestaLacosSwitchCase {
    public static void main(String[] args) {
        int a = args.length;
        int i = 0;
        switch (a) {
            case 0:
            case 1:
                for (i = 0; i < 15; i++, System.out.println(i))
                    if (i == 5) continue;
                if (i == 15) break;
            case 2:
                System.out.println("2");
        }
        System.out.println("fim");
    }
}