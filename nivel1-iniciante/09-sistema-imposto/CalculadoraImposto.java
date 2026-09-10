package calculadora;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Sistema de Calculadora de Imposto!");
        System.out.println("Digite seu Salario Bruto: ");
        Double salarioBruto = scanner.nextDouble();
        double calcValorliquido = 0;
        double calcNumber = 0;

        if (salarioBruto <= 0){
            System.out.println("Valor invalido. Digite valor positivo ou maior que 0");
        }
        else {
            if (salarioBruto <= 2000){
                System.out.println("Isento (0%)");
            } else if (salarioBruto <= 3000) {

                System.out.println("Valor do imposto sera de 7,5%");
                calcNumber = (salarioBruto * 7.5) / 100;
                calcValorliquido = salarioBruto - calcNumber;

            } else if (salarioBruto <= 4500) {

                System.out.println("Valor do imposto sera de 15%");
                calcNumber = (salarioBruto * 15) / 100;
                calcValorliquido = salarioBruto - calcNumber;


            } else if (salarioBruto <= 6000) {

                System.out.println("Valor do imposto sera de 22,5%");
                calcNumber = (salarioBruto * 22.5) / 100;
                calcValorliquido = salarioBruto - calcNumber;

            }else {

                System.out.println("Valor do imposto sera de 27,5%");
                calcNumber = (salarioBruto * 27.5) / 100;
                calcValorliquido = salarioBruto - calcNumber;

            }
            System.out.printf("Desconto sera no valor de: RS$%.2f%n", calcNumber);
            System.out.printf("Salario Liquido: RS$%.2f%n", calcValorliquido);

        }
    }
}
