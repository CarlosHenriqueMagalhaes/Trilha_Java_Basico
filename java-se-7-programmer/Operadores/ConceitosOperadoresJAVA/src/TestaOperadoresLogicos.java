public class TestaOperadoresLogicos {

    public static boolean metodo(String msg) {
        System.out.println(msg);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(1 == 2 & metodo("oi"));
        // imprime oi, depois false
        System.out.println(1 == 2 && metodo("tchau"));
        // não imprime tchau, imprime false
    }
}
