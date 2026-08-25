import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Veja a nossa calculadora");
        Scanner scanner = new Scanner(System.in);
        //CAPTURANDO OS NUMEROS COM O USUARIO
        System.out.println("Agora você precisa escolher dois numeros para fazer uma operação:");
        System.out.print("Escolha o primeiro numero: ");
        float numero1 = 0;
        try {
            numero1 = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você digitou uma letra, digite um numero: ");
            scanner.nextLine();

        }
        System.out.print("Escolha o Segundo numero: ");
        float numero2 = scanner.nextFloat();


        //LEGENDA DAS OPERAÇÕES
        System.out.println("Escolha um das operações abaixo: ");
        System.out.println("Digite: 1 para +");
        System.out.println("Digite: 2 para -");
        System.out.println("Digite: 3 para *");
        System.out.println("Digite: 4 para /");
        System.out.print("Qual operação desejada? Digite o numero para operação:  ");

        float resultado = 0;

        int opcao = scanner.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("Você escolheu somar os valores!");
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.println("Você escolheu subtrair os valores!");
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                System.out.println("Você escolheu multiplicar os valores!");
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.println("Você escolheu Dividir os valores!");
                if (numero2 == 0){
                    System.out.println("Danadinho, não pode dividir por 0");
                }
                else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Nenhum valor foi escolhido!");
        }
        scanner.close();
    }
}
