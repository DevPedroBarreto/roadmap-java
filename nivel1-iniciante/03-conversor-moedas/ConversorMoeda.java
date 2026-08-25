package calculadora;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main (String[] args){
        System.out.println("Seja bem vindo ao nosso conversor de Moeda! Aqui voce tera conversão para U$ RS$ EU$");
        System.out.println("Escolha o Qual moeda deseja:");
        System.out.println("Opção 1 para REAL");
        System.out.println("Opção 2 para DOLAR");
        System.out.println("Opção 3 para EURO");

        System.out.print("Digite a opção desejada: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double dolar = 5.40;
        double euro = 5.85;

        switch (number){
            case 1:
                System.out.println("Voce usa a moeda de origem em REAL!");
                System.out.print("Digite o valor que deseja converter: ");
                double moedaREAL = scanner.nextDouble();
                if (moedaREAL < 0){
                    System.out.print("Voce digitou um valor negativo, por isso não vamos converter. Adeus seu plebeu!");
                }else {
                double converRealParaDolar = moedaREAL / dolar;
                double converRealParaEuro = moedaREAL / euro;
                System.out.printf("O Valor em RS$%.2f%n", moedaREAL);
                System.out.printf("O valor em US$: US$%.2f%n", converRealParaDolar);
                System.out.printf("O valor em EUR$: EUR$%.2f%n", converRealParaEuro);
                }
                break;
            case 2:
                System.out.println("Voce usa a moeda de origem em DOLAR!");
                System.out.println("Digite o valor que deseja converter: ");
                double moedaDolar = scanner.nextDouble();
                if (moedaDolar < 0){
                    System.out.print("Voce digitou um valor negativo, por isso não vamos converter. Adeus seu plebeu!");
                }else {
                double converDolarParaReal = moedaDolar * dolar;
                double converDolarParaEuro = (moedaDolar / euro) * dolar;
                System.out.printf("O valor em US$%.2f%n", moedaDolar);
                System.out.printf("O valor em RS$%.2f%n", converDolarParaReal);
                System.out.printf("O valor em EUR$%.2f%n", converDolarParaEuro);
                }
                break;
            case 3:
                System.out.println("Voce usa a moeda de origem em EURO!");
                System.out.println("Digite o valor que deseja converter: ");
                double moedaEuro = scanner.nextDouble();
                if (moedaEuro < 0){
                    System.out.print("Voce digitou um valor negativo, por isso não vamos converter. Adeus seu plebeu!");
                }else {
                    double converEuroParaReal = moedaEuro * euro;
                    double converEuroParaDolar = (moedaEuro / dolar) * euro;
                    System.out.printf("O valor em EUR$%.2f%n", moedaEuro);
                    System.out.printf("O valor em RS$%.2f%n", converEuroParaReal);
                    System.out.printf("O valor em US$%.2f%n", converEuroParaDolar);
                }
                break;
            default:
                System.out.println("Entrou na exceção");
                break;
        }
    }
}
