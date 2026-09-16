import java.util.Scanner;

public class Fatorial {
     public static void main(String[] args){
        System.out.println("Bem-Vindo a calculadora de FATORIAL!");
        System.out.print("Digite o valor que gostaria de saber o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        int resultado = 1;
        int numeroUser = scanner.nextInt();
        if (numeroUser < 0){
            System.out.println("Valor invalido! Digite um numero positivo.");
        }else{
            for (int i = 1; i <= numeroUser; i++){
                resultado = resultado * i;
            }
            System.out.println(resultado);
        }
        scanner.close();

    }
}
