package calculadora;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args){

        boolean continuar = true;
        double saldo = 1000.00;
        System.out.println("Seja bem vindo ao caixa banco BARRETO");
        Scanner scanner = new Scanner(System.in);
        while (continuar) {

            System.out.println("Opção 1: consultar saldo\nOpção 2: Depositar\nOpção 3: Sacar\nOpção 4: SAIR");

            System.out.print("Digite opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // consultar saldo
                    System.out.println("Saldo é de: " + saldo);
                    break;
                case 2: // depositar
                    System.out.println("Digite o valor que deseja DEPOSITAR");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Você digitou um valor invalido. DEPOSITO precisa ser positivio e maior que 0");
                    }else {
                        saldo = saldo + deposito;
                        System.out.println("Seu Saldo Atual: " + saldo);
                    }
                    break;
                case 3: // sacar
                    System.out.println("Digite o valor que deseja SACAR");
                    double sacar = scanner.nextDouble();
                    if (sacar <= 0 || sacar > saldo){
                        System.out.println("Você digitou um valor invalido. SAQUE precisa ser positivio e maior que 0");
                    }else {
                        saldo = saldo - sacar;
                        System.out.println("Seu Saldo Atual: " + saldo);
                    }
                    break;
                case 4:
                    continuar = false; // isso é o que "quebra" o while
                    break;
            }
        }
        scanner.close();
    }
}
