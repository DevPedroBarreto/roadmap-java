package calculadora;

import java.util.Scanner;

public class CalculadoraTemperatura {
    public static void main(String[] args){
        System.out.println("Escolha a unidadade de temperatura: ");
        System.out.println("Escolha a 1 para Celcios: ");
        System.out.println("Escolha a 2 para Fahrenheit: ");
        System.out.println("Escolha a 3 para Kelvin: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a opção desejada: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Você escolheu Celcios! °C");
                System.out.print("Digite a temperatura que deseja converter: ");
                double numberCelcios = scanner.nextDouble();
                double calculoCparaF = (numberCelcios * 9/5) + 32; // Converte para Fahrenheit (C × 9/5) + 32
                double calculoCparaK = numberCelcios + 273.15; // Converte para Kelvin C + 273.15
                if (calculoCparaK < 0){
                    calculoCparaK = 0;
                    System.out.println("Não existe valor de Kelvin abaixo de zero! Valor da conversão abaixo de zero. Kelvin equivale a 0");
                }else {
                    System.out.printf("Temperatura em Fahrenheit: %.2f%n", calculoCparaF);
                    System.out.printf("Temperatura em Kelvin: %.2f%n", calculoCparaK);
                }
                break;
            case 2:
                System.out.println("Você escolheu Fahrenheit! °F");
                System.out.print("Digite a temperatura que deseja converter: ");
                double numberFahrenheit = scanner.nextDouble();
                double calculoFparaC = (numberFahrenheit - 32) * 5/9; // Converte para Celcios (F - 32) × 5/9
                double calculoFparaK = (numberFahrenheit - 32 ) * 5/9 + 273.15; // Converte para Kelvin (F - 32) × 5/9 + 273.15
                if (calculoFparaK < 0){
                    calculoFparaK = 0;
                    System.out.println("Não existe valor de Kelvin abaixo de zero! Valor da conversão abaixo de zero. Kelvin equivale a 0");
                }else {
                    System.out.printf("Temperatura em Celcios: %.2f%n", calculoFparaC);
                    System.out.printf("Temperatura em Kelvin: %.2f%n", calculoFparaK);
                }
                break;

            case 3:
                System.out.println("Você escolheu Kelvin! K");
                System.out.print("Digite a temperatura que deseja converter: ");
                double numberkelvin = scanner.nextDouble();
                if (numberkelvin < 0){
                    System.out.println("Não existe valor de Kelvin abaixo de zero! Valor da conversão abaixo de zero. Kelvin equivale a 0");
                }else {
                    double calculoKparaC = numberkelvin - 273.15; // Converte para Celcios K - 273.15
                    double calculoKparaF = (numberkelvin - 273.15 ) * 9/5 + 32; // Converte para Fahrenheit (K - 273.15) × 9/5 + 32
                    System.out.printf("Temperatura em Celcios: %.2f%n", calculoKparaC );
                    System.out.printf("Temperatura em Fahrenheit: %.2f%n", calculoKparaF );
                }
                break;

            default:
                System.out.println("Você digitou uma opção que não existe!");
                break;
        }
    }
}
