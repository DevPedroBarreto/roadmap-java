package cadastro;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main (String[] args){
        System.out.println("ESTE É NOSSO SIMTEMA DE CADASTRO DE USUARIO!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();
        if (idade <= 0 || idade > 120){
            System.out.println("Você digitou um valor invalido para idade:");
        }else {
            scanner.nextLine();
            System.out.print("Digite a cidade onde você mora: ");
            String cidade = scanner.nextLine();

            System.out.print("Digite a a sua profissão: ");
            String profissao = scanner.nextLine();
            System.out.println("=========== Dados do Usuário ============");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Cidade: " + cidade);
            System.out.println("Profissao: " + profissao);
        }
        scanner.close();
    }
}
