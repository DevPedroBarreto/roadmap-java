/*
 * ============================================================
 * DESAFIO: Caça-palavras Simples
 * ============================================================
 *
 * REGRA DE NEGÓCIO:
 * O programa deve verificar se uma palavra digitada pelo usuário
 * está escondida dentro de um texto fixo, maior, sem usar métodos
 * prontos de busca (como .contains()). A busca deve ser feita
 * manualmente, caractere por caractere, usando laços de repetição.
 *
 * VALIDAÇÃO:
 * A palavra digitada não pode ser vazia (usuário não pode só
 * apertar Enter sem digitar nada).
 *
 * O QUE O CÓDIGO DEVE FAZER:
 * 1. Ter um texto fixo, já definido no código.
 * 2. Ler a palavra que o usuário quer procurar dentro desse texto.
 * 3. Validar que a palavra não está vazia.
 * 4. Percorrer o texto posição por posição (loop externo), tentando
 *    "encaixar" a palavra a partir de cada posição possível.
 * 5. Para cada posição testada, comparar caractere por caractere
 *    (loop interno) se a palavra bate com o trecho do texto.
 * 6. Informar ao usuário se a palavra foi encontrada ou não.
 *
 * CONCEITOS PRATICADOS:
 * - Laços de repetição aninhados (loop dentro de loop)
 * - Acesso a caracteres individuais de uma String (charAt)
 * - Tamanho de uma String (length)
 * - Variável de controle booleana (padrão "suposição otimista",
 *   já usado no exercício de Números Primos)
 *
 * ============================================================
 */

import java.util.Scanner;

public class CacaPalavra {
    public static void main(String[] args){
        boolean encontrou = false;
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        String texto = "Casa";

        if (0 < palavra.length() ){
            for (int i = 0; i <= texto.length() - palavra.length(); i++) {
                boolean bateu = true;

                for (int j = 0; j < palavra.length(); j++) {

                    if (texto.charAt(i + j) != palavra.charAt(j)){
                        bateu = false;
                    }

                }

                if (bateu) {
                    encontrou = true;
                }
            }if(encontrou){
                System.out.println("Você encontrou, parabens!");
            }else {
                System.out.println("Não encontrou!");
            }

        }else {
            System.out.println("Digite Alguma coisa, não pode ficar sem nada.");
        }

    }
}
