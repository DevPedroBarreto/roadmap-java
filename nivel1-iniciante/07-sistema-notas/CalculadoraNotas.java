// ATENÇÃO: exercício ainda em andamento — falta corrigir a condição
// redundante no bloco de "Recuperação" (o professor apontou o bug,
// aguardando a correção final do aluno).
package calculadora;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args){
        System.out.println("Seja bem vindo ao nosso calculo de Notas!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Primeira nota: ");
        double nota1 = scanner.nextDouble();

        if (nota1 > 10 || nota1 < 0){
            System.out.println("Nota digitada invalida. Digite um valor entre 0 e 10");
        }else{
            System.out.print("Digite sua Segunda nota: ");
            double nota2 = scanner.nextDouble();
            if (nota2 > 10 || nota2 < 0){
                System.out.println("Nota digitada invalida. Digite um valor entre 0 e 10");
            }else {
                System.out.print("Digite sua Terceira nota: ");
                double nota3 = scanner.nextDouble();
                if (nota3 > 10 || nota3 < 0){
                    System.out.println("Nota digitada invalida. Digite um valor entre 0 e 10");
                }else {
                    double notaMedia = (nota1 + nota2 + nota3) / 3;
                    System.out.printf("Sua média de notas é: %.2f%n", notaMedia);

                    if (notaMedia < 5 ){
                        System.out.print("Sua média é " + notaMedia + " Você esta Reprovado!");

                    } else if (notaMedia <= 6.9) {

                        System.out.print("Você esta de Recuperação!");
                    }else {

                        System.out.print("Você esta de Aprovado!");
                    }
                }
            }
        }
    }
}
