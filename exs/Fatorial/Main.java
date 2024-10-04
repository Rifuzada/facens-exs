import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero para calcular a fatorial dele: ");
        numero = scn.nextInt();
        int cont = numero;
        while (cont > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves
            System.out.println(cont);
            numero = numero *(cont-1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1
            cont--; // aqui decrementamos o valor de x em um, no final do loop
            System.out.println(numero); // Esse comando imprime o valor de numero. O último será o valor final do Fatorial.
        }
    }
}
