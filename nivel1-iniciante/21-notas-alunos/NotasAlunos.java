/*
 * ============================================================
 * DESAFIO: Notas de Alunos (com Arrays)
 * ============================================================
 *
 * REGRA DE NEGÓCIO:
 * O programa deve registrar as notas de uma turma de 5 alunos
 * (nomes fixos no código) e gerar um resumo da turma.
 *
 * SITUAÇÃO DE CADA ALUNO:
 * - Nota menor que 5.0       -> Reprovado
 * - Nota de 5.0 até 6.9      -> Recuperação
 * - Nota 7.0 ou mais         -> Aprovado
 *
 * VALIDAÇÃO:
 * Cada nota deve estar entre 0 e 10. Se estiver fora desse
 * intervalo, o programa deve pedir a nota novamente até que um
 * valor válido seja digitado.
 *
 * O QUE O CÓDIGO DEVE FAZER:
 * 1. Ter um array de nomes de alunos e um array de notas
 *    (arrays paralelos, ligados pela posição).
 * 2. Ler a nota de cada aluno, validando o intervalo de 0 a 10.
 * 3. Listar cada aluno com sua nota e sua situação.
 * 4. Calcular e mostrar a média da turma.
 * 5. Mostrar o aluno com a maior nota e o aluno com a menor nota.
 * 6. Mostrar quantos alunos foram aprovados.
 *
 * CONCEITOS PRATICADOS:
 * - Arrays de tipos diferentes (String[] e double[])
 * - Acumulador para calcular média
 * - Padrão "achar o maior" e "achar o menor"
 * - Contador condicional (conta só quando a condição é verdadeira)
 * - Validação com laço while
 *
 * ============================================================
 */

import java.util.Arrays;
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alunos = new String[5];
        alunos[0] = "Maria";
        alunos[1] = "Ana";
        alunos[2] = "Clara";
        alunos[3] = "Jose";
        alunos[4] = "Pedro";

        double[] notasAlunos = new double[5];
        String[] status = new String[5];
        double maiorNOTA = 0;
        double menorNOTA = 10;
        int contadorSTATUS = 0;
        double media = 0;
        String alunoMaior = "";
        String alunoMenor = "";

        for (int i = 0; i < alunos.length; i++){
            System.out.print("Digite a nota do aluno " + alunos[i] + ": ");
            notasAlunos[i] = input.nextDouble();
            while(notasAlunos[i] < 0 || notasAlunos[i] > 10){
                System.out.println("Valor invalido! Digite note entre 0 e 10");
                System.out.print("Digite a nota do aluno " + alunos[i] + ": ");
                notasAlunos[i] = input.nextDouble();
            }if(notasAlunos[i] < 5){
                status[i] = "REPROVADO";

            } else if (notasAlunos[i] < 7) {
                status[i] = "RECUPERAÇÃO";
            }else {
                status[i] = "APROVADO";
                contadorSTATUS++;
            }
            if(notasAlunos[i] > maiorNOTA){
                maiorNOTA = notasAlunos[i];
                alunoMaior = alunos[i];
            }
            if(notasAlunos[i] < menorNOTA){
                menorNOTA = notasAlunos[i];
                alunoMenor = alunos[i];
            }

            media = media + notasAlunos[i];
        }
        System.out.println("");
        for (int i = 0; i < notasAlunos.length; i++){
            System.out.println("Aluno: "+ alunos[i]+" "+ notasAlunos[i] + " STATUS: "+ status[i]);
        }
        System.out.println("");
        System.out.println("Media da turma: " + media / notasAlunos.length);
        System.out.println("Aluno com MAIOR nota: " + alunoMaior +": "+ maiorNOTA);
        System.out.println("Aluno com MENOR nota: " + alunoMenor +": " + menorNOTA);
        System.out.println("Quantidade de alunos APROVADOS: " + contadorSTATUS);

    }
}
