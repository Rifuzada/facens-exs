import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Solicitar o número de produtos no estoque
            System.out.print("Digite o número de produtos no estoque: ");
            int qtdProdutos = scanner.nextInt();
            String[] nomes = new String[qtdProdutos];
            int[] quantidades = new int[qtdProdutos];
            int[] limitesMinimos = new int[qtdProdutos];
            int[] preços = new int[qtdProdutos];
            scanner.nextLine(); // Consumir nova linha após o número

            // Entrada de dados para cada produto
            for (int i = 0; i < qtdProdutos; i++) {
                System.out.println("\nProduto " + (i + 1) + ":");

                System.out.print("Nome: "); 
                String nome = scanner.nextLine();
                nomes[i] = nome;

                System.out.print("Quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                quantidades[i] = quantidade;

                System.out.print("Limite mínimo de estoque: ");
                int limiteMinimo = scanner.nextInt();
                limitesMinimos[i] = limiteMinimo;

                System.out.print("Preço do produto: ");
                int preço = scanner.nextInt();
                preços[i] = preço;
                scanner.nextLine();
            }

            // Calcular quantidade total de produtos em estoque
            int quantidadeTotal = 0;
            System.out.println("\nResumo do Estoque:");
            for (int i = 0; i < qtdProdutos; i++) {
                quantidadeTotal += quantidades[i];
                String status;
                if (quantidades[i] >= limitesMinimos[i]) {
                    status = "Adequada";
                } else {
                    status = "Baixa";
                }
                System.out.println(
                        "Produto: " + nomes[i] +
                                ", Quantidade: " + quantidades[i] +
                                ", Status: " + status +
                                ", Preço: " + preços[i]);

            }
            System.out.println("\nQuantidade total de produtos em estoque: " + quantidadeTotal);

            // Perguntar ao usuário se deseja realizar um novo controle de estoque
            System.out.print("\nDeseja realizar um novo controle de estoque? (S/N): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar == "S"); 

        System.out.println("Aplicativo encerrado.");
        scanner.close();
    }
}
