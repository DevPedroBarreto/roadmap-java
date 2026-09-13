import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhação {
    public static void main(String[] args){
        System.out.println("Seja bem-vindo ao Jogo de Adivinhação!");
        System.out.println("");
        System.out.println("Digite um valor de 1 a 100 para adivinhar o valor!");
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int numeroUser = 0;
        int contador = 0;

        do {
            numeroUser = scanner.nextInt();
            if(numeroSecreto < numeroUser){
                System.out.println("Numero secreto é menor que " + numeroUser);

            } else if (numeroSecreto > numeroUser) {
                System.out.println("Numero secreto é Maior que " + numeroUser);
            } else {
                System.out.println("Você acertou parabens!");

            }
            contador++;

        } while (numeroSecreto != numeroUser);

        System.out.println("Voce encontrou o numero secreto! o numero é: " + numeroSecreto + " Numero de tentativas foi de " + contador);
    }
}
