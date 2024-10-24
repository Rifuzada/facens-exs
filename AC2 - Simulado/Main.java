import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Integer> quantidades = new ArrayList<>();
        List<Integer> preços = new ArrayList<>();
        List<Integer> limitesMinimos = new ArrayList<>();
        String continuar;

        do {
            int qtdProdutos;

            // Solicitar o número de produtos no estoque
            System.out.print("Digite o número de produtos no estoque: ");
            qtdProdutos = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após o número

            // Entrada de dados para cada produto
            for (int i = 0; i < qtdProdutos; i++) {
                System.out.println("\nProduto " + (i + 1) + ":");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);

                System.out.print("Quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                quantidades.add(quantidade);

                System.out.print("Limite mínimo de estoque: ");
                int limiteMinimo = scanner.nextInt();
                limitesMinimos.add(limiteMinimo);

                System.out.print("Preço do produto: ");
                int preço = scanner.nextInt();
                preços.add(preço);
                scanner.nextLine();
            }

            // Calcular quantidade total de produtos em estoque
            int quantidadeTotal = 0;
            System.out.println("\nResumo do Estoque:");
            for (int i = 0; i < qtdProdutos; i++) {
                quantidadeTotal += quantidades.get(i);
                String status;
                if (quantidades.get(i) >= limitesMinimos.get(i)) {
                    status = "Adequada";
                } else {
                    status = "Baixa";
                }
                System.out.println(
                        "Produto: " + nomes.get(i) +
                                ", Quantidade: " + quantidades.get(i) +
                                ", Status: " + status +
                                ", Preço: " + preços.get(i));

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
