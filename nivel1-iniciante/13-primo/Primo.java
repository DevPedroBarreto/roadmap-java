import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
        System.out.println("Será que é numero Primo?");
        System.out.print("Digite um valor para saber se é primo ou não: ");
        Scanner scanner = new Scanner(System.in);
        int numberuser = scanner.nextInt();
        boolean ehPrimo = true;

        for (int i = 2; numberuser > i; i++){
            if (numberuser % i == 0) {
                ehPrimo = false;
                System.out.println(numberuser);
                System.out.println(i);
                break;
                // encontrou um divisor! não precisa nem continuar testando
            }
        }
    }
}
