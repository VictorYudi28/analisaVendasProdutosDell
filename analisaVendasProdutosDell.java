import java.util.Scanner;

public class analisaVendasProdutosDell {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--- DELL ---");

        System.out.println();

        String linhaProdutos[] = new String[] {"Notebook","Computadores","Tablets","Servidores"};
        int metaVendasProd[] = new int[] {100,150,200,250};

        int vendas[][] = vendasTrimestre(linhaProdutos);

        int somaLinha[] = verificaVendasPorLinha(vendas);

        int somaTrimestre[] = verificaVendasPorTrimestre(vendas);

        String armazenaMetas[] = verificaMetaVendas(metaVendasProd,somaLinha);

        System.out.println();
        System.out.println();

        for(int i = 0; i < 4; i++) {

            System.out.println(linhaProdutos[i] + ": " + armazenaMetas[i]);
            System.out.println();

        }// For exibe metas

    }// Main

    public static int[][] vendasTrimestre(String linhaProdutos[]) {

        int vendas[][] = new int[4][3];

        for(int i = 0; i < 4; i++) {

            System.out.println("Linha " + linhaProdutos[i]);

            for(int j = 0; j < 3; j++) {

                System.out.println("Informe a venda no trimestre " + (j+1));
                vendas[i][j] = entrada.nextInt();

            }// Colunas

            System.out.println();

        }// Linhas

        return vendas;
    }// Método vendasTrimestre

    public static int[] verificaVendasPorLinha(int vendas[][]) {

        int somaLinha[] = new int[4];

        for(int i = 0; i < 4; i++) {

            for(int j = 0; j < 3; j++) {

                somaLinha[i] += vendas[i][j];

            }// Coluna

        }// Linha

        return somaLinha;

    }// Método verificaVendasPorLinha

    public static int[] verificaVendasPorTrimestre(int vendas[][]) {

        int somaTrimestre[] = new int[3];

        for(int j = 0; j < 3; j++) {

            for(int i = 0; i < 4; i++) {

                somaTrimestre[j] += vendas[i][j];

            }// Linhas

        }// Colunas

        return somaTrimestre;
    } // Método verificaVendasPorTrimestre

    public static String[] verificaMetaVendas(int metaVendasProd[], int somaLinha[]) {

        String armazenaMetas[] = new String[4];

        for(int i = 0; i < 4; i++) {

            if(somaLinha[i] >= metaVendasProd[i]) {

                armazenaMetas[i] = "Atingiu meta";

            }else {

                armazenaMetas[i] = "Não atingiu meta";

            }

        }// For compara metas

        return armazenaMetas;

    }// Método verificaMetaVendas

}// Class
