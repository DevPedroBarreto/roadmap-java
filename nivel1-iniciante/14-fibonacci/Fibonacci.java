import java.util.Scanner;

public class Fibonacci {
      public static void main(String[] args) {
            System.out.println("Sequencia de Fibonacci");
            System.out.print("Digite um valor para ver a sequencia: ");
            Scanner scanner = new Scanner(System.in);
            int numberUser = scanner.nextInt();
            int anterior = 0;
            int atual = 1;
            if (numberUser <= 0){
                System.out.print("Valor não pode ser 0 ou negativo. Eu não DEIXO!");
            }else {

                for (int i = 0; numberUser > i; i++ ){

                    int proximo = atual + anterior;
                    System.out.println(anterior + ",");
                     anterior = atual;
                     atual = proximo;

                }
            }

    }
}
