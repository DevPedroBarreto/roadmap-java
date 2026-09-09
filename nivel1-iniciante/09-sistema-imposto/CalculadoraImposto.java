package calculadora;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Sistema de Calculadora de Imposto!");
        Double salarioBruto = scanner.nextDouble();
        System.out.println("Digite seu Salario Bruto: ");
        if (salarioBruto <= 2000){
            System.out.println("Isento (0%)");
        } else if (salarioBruto <= 3000) {
            System.out.println("Valor do imposto sera de 7,5%");
        } else if (salarioBruto <= 4500) {
            System.out.println("Valor do imposto sera de 15%");
        } else if (salarioBruto <= 6000) {
            System.out.println("Valor do imposto sera de 22,5%");
        }else {
            System.out.println("Valor do imposto sera de 27,5%");
        }
    }
}
