/*Regra de Negócio — Agenda (com Arrays)

O programa deve funcionar como uma agenda de contatos simples, guardando vários nomes numa única estrutura.

Fluxo esperado:

O programa define um tamanho fixo pra agenda (ex: 5 contatos)
O usuário cadastra nomes, um de cada vez, até preencher todas as posições
Ao final, o programa lista todos os contatos cadastrados

Validação: não deve ser possível cadastrar além do tamanho máximo da agenda. */

import java.util.Scanner;

public class Agenda {
    public static void main(String[] args){
        System.out.println("MINHA AGENDA");
        String[] nomes = new String[4]; // 0,1,2,3
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome da opciçao "+ i +":" );
            String nomeUser = scanner.nextLine();
            nomes[i] = nomeUser;

        }
        for (int c = 0; c < nomes.length; c++ ){
            System.out.println(nomes[c]);
        }

    }
}
