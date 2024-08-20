public class ConversorDeTemperaturas {
    public static void main (String []args){

        double celcius = 25.8;
        double fahrenheit = (celcius * 1.8) + 32;

        System.out.println("Conversão de Celcius para Fahrenheit:");
        System.out.println("Celsius: " + celcius);
        System.out.println("fahrenheit: " + fahrenheit);

        int fahrenhetParaInteira = (int) fahrenheit;
        System.out.println(fahrenhetParaInteira);

    }
}