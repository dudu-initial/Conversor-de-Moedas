import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        double valorPesoArgentina = 184.6;
        double valorYene = 25.66;
        double valorDolar = 0.1736;


        System.out.println("Valor em Reais (BRL) que deseja converter:");
        double valor = le.nextDouble();

        System.out.println("Converter de: ");
        System.out.println("1 - Dólar");
        System.out.println("2 - Peso Argentino");
        System.out.println("3 - Yene Jpy");
        System.out.println("Escolha uma opção: ");
        int moeda = le.nextInt();

        double valorConvertido = 0;
        String moedaDestino = "";

        switch (moeda) {
            case 1:
                valorConvertido = valor * valorDolar;
                moedaDestino = " Dólares (USD)";
                break;
            case 2:
                valorConvertido = valor * valorPesoArgentina;
                moedaDestino = " Pesos Argentinos (ARS)";
                break;
            case 3:
                valorConvertido = valor * valorYene;
                moedaDestino = " Ienes Japoneses (JPY)";
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Valor convertido: " +  valorConvertido + moedaDestino);

        le.close();
    }
}
