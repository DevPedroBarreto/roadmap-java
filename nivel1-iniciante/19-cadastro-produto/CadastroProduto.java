import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        System.out.println("Cadastro de Produtos");

        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        produtos[0] = "Fone";
        produtos[1] = "Celular";
        produtos[2] = "Tablet";
        produtos[3] = "TV";
        produtos[4] = "Caixa de som";

        int[] estoque = new int[5];
        int valorMaior = 0;
        int somaTotal = 0;
        String produtoMaior = "";

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite a quantidade do produto: " + produtos[i] + " ");
            estoque[i] = scanner.nextInt();
            while (estoque[i] < 0){
                System.out.println("Não é valido o valor negativo");
                System.out.print("Digite a quantidade do produto: " + produtos[i] + " ");
                estoque[i] = scanner.nextInt();
            }
            if(estoque[i] > valorMaior){
                valorMaior = estoque[i];
                produtoMaior = produtos[i];
            }

        }


        System.out.println("LISTA DE PRODUTOS E QUANTIDADES");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + " - " + estoque[i]);
             somaTotal += estoque[i];
        }
        System.out.println("TOTAL EM ESTOQUE: "+ somaTotal);
        System.out.println("ESTE É O PRUDOT COM MAIOR QUANTIDADE : " + produtoMaior  +":"+ valorMaior);
        scanner.close();
    }
}
