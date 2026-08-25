package calculadora;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String[] args){
        System.out.println("Vamos Calcular o seu IMC?");
        System.out.println("Digite o seu Peso Atual. EX: 80. Não digite valor negativo ou 0");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        if (peso <= 0){
            System.out.print("Você digitou um valor invalido para peso");
        }else {
            System.out.println("Digite a sua Altura. EX: 1,85 Não digite valor negativo ou 0");
            double altura = scanner.nextDouble();
            if (altura <= 0) {
                System.out.print("Você digitou um valor invalido para Altura");
            }else {
                double calcIMC = peso / (altura * altura);
                System.out.printf("Seu IMC: %.2f%n", calcIMC);
                if (calcIMC < 18.5){
                    System.out.print("Você esta na categoria: Abaixo do peso");

                } else if (calcIMC <= 24.9) {

                    System.out.print("Você esta na categoria: Peso normal");
                }else if (calcIMC <= 29.9) {

                    System.out.print("Você esta na categoria: Sobrepeso");
                }else if (calcIMC <= 34.9) {

                    System.out.print("Você esta na categoria: Obesidade Grau I");
                }else if (calcIMC <= 39.9) {

                    System.out.print("Você esta na categoria: Obesidade Grau II");
                }else{
                    System.out.print("Você esta na categoria: Obesidade Grau III");
                }
            }
        }
    }
}
