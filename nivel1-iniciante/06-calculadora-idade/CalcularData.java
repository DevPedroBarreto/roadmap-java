package calculadora;

import java.util.Scanner;
import java.time.LocalDate;

public class CalcularData {
    public static void main(String[] args){
        System.out.println("Vamos calcular sua idade e Epóca, seu zé mané!!");
        System.out.println("Digite o Ano em que você nasceu: ");
        Scanner scanner = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int ano = scanner.nextInt();
        if (ano > anoAtual || ano < 1900){
            System.out.println("Idade ta erra seu zé mané!");
        }else {

            System.out.println("Sua idade: " + (anoAtual - ano));
            int anoCalculoResto = ano % 10;
            int anoCalculoDecada = ano - anoCalculoResto;
            System.out.println("Você nasceu na decada de: " + anoCalculoDecada);

        }
    }
}
