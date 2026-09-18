import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
        System.out.println("Será que é numero Primo?");
        System.out.print("Digite um valor para saber se é primo ou não: ");
        Scanner scanner = new Scanner(System.in);
        int numberuser = scanner.nextInt();
        boolean ehPrimo = true;
    if(numberuser < 2){
        System.out.println("Não é primo!");
    }else{
        for (int i = 2; numberuser > i; i++){
            if (numberuser % i == 0) {
                ehPrimo = false;

                break;
            }
        }
        if (ehPrimo == true){
            System.out.println("É primo!");
        }else {
            System.out.println("Não é primo!");
        }

    }
    }
}
