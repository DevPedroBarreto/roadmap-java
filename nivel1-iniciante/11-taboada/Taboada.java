import java.util.Scanner;

public class Taboada {
    public static void main(String[] args){
        System.out.println("Seja bem vindo ao Gerador de Taboada!");
        System.out.println("Digite a taboada que você deseja ver o resultado.");
        Scanner scanner = new Scanner(System.in);
        int numeroTaboada = scanner.nextInt();
    if (numeroTaboada <= 0){
        System.out.println("Não pode ser negativo ou 0");
    }else {
        for (int i = 1; i <= 10; i++){
            System.out.println( numeroTaboada + "X" +  i + "=" + i * numeroTaboada );
        }
    }
    }
}
