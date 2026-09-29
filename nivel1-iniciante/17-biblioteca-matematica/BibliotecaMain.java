/*
 * ============================================================
 * DESAFIO: Biblioteca Matemática (com Métodos)
 * ============================================================
 *
 * REGRA DE NEGÓCIO:
 * O programa deve funcionar como uma coleção de métodos
 * matemáticos reutilizáveis, mais especializados do que as
 * operações básicas da Calculadora. O usuário escolhe, por um
 * menu, qual operação matemática deseja testar.
 *
 * MÉTODOS A IMPLEMENTAR:
 * 1. potencia(base, expoente) — calcula um número elevado a uma
 *    potência (ex: 2³ = 8).
 * 2. raizQuadrada(numero) — calcula a raiz quadrada de um número.
 * 3. ehPar(numero) — verifica se um número é par ou ímpar,
 *    devolvendo true ou false.
 * 4. maiorEntreDois(a, b) — devolve o maior valor entre dois
 *    números.
 *
 * VALIDAÇÃO:
 * A raiz quadrada de um número negativo não existe nos números
 * reais. Essa validação deve ficar DENTRO do próprio método
 * "raizQuadrada", seguindo o mesmo princípio de encapsulamento de
 * responsabilidade já aplicado no método "dividir" do desafio
 * anterior.
 *
 * O QUE O CÓDIGO DEVE FAZER:
 * 1. Ter os quatro métodos descritos acima, cada um com o tipo de
 *    retorno adequado ao que calcula (double para contas com casas
 *    decimais, boolean para verificações verdadeiro/falso).
 * 2. Ter um menu (switch) no main, onde o usuário escolhe qual
 *    operação testar.
 * 3. Ler os valores necessários via Scanner, de acordo com a
 *    operação escolhida.
 * 4. Chamar o método correspondente e mostrar o resultado.
 *
 * CONCEITOS PRATICADOS:
 * - Métodos com tipos de retorno diferentes (double, boolean)
 * - Uso de ferramentas prontas do Java: Math.pow() e Math.sqrt()
 * - Expressões booleanas diretas no return (sem precisar de if/else
 *   completo para devolver true/false)
 * - Reforço de encapsulamento de responsabilidade (validação dentro
 *   do método que a exige)
 *
 * ============================================================
 */

import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args){
        System.out.println("Biblioteca Matematica");
        System.out.println("MENU DE OPERAÇÕES: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha Opção 1 para Potencia");
        System.out.println("Escolha Opção 2 para Raiz");
        System.out.println("Escolha Opção 3 para Par ou Impar");
        System.out.println("Escolha Opção 4 para Maior entre");
        int opcao = input.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Opção 1");
                System.out.println("Escolha DOIS numeros: ");
                double num1 = input.nextDouble();
                double num2 = input.nextDouble();
                double resultado = metodosMain.MetodosMain.potencia(num1, num2);
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Opcao 2");
                System.out.println("Escolha UM numero: ");
                double numRaiz = input.nextDouble();
                double resultadoRaiz = metodosMain.MetodosMain.raiz(numRaiz);
                System.out.println(resultadoRaiz);
                break;
            case 3:
                System.out.println("Opcao 3");
                System.out.println("Escolha UM numero: ");
                double numParImpar = input.nextDouble();
                boolean resultadoParImpar = metodosMain.MetodosMain.ehPar(numParImpar);
                if(resultadoParImpar){
                    System.out.println("Numero é Par");
                }else {
                    System.out.println("Numero é Impar");
                }
                break;
            case 4:
                System.out.println("Opcao 4");
                System.out.println("Escolha DOIS numero: ");
                double numberUser1 = input.nextDouble();
                double numberUser2 = input.nextDouble();
                double resultadoMaiorQue = metodosMain.MetodosMain.maiorEntreDois(numberUser1, numberUser2);
                System.out.println("Valor maior é: " + resultadoMaiorQue);

                break;
            default:
                System.out.println("Opço invalida");
                break;
        }
    }
}
