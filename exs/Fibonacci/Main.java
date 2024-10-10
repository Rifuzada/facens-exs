import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero, numeroEscolhido;

        System.out.println("Digite um numero para calcular a fatorial dele: ");
        numeroEscolhido = scn.nextInt();
        //5
        while (numero > numeroEscolhido){ // Enquanto x for menor que 1 faça o que está entre as chaves
            //System.out.println(cont);
            int formula = (numeroEscolhido - 1) + (numeroEscolhido -2);
            cont--; // aqui decrementamos o valor de x em um, no final do loop
            if(cont == 1){
                break;
            }
            System.out.println(numero); // Esse comando imprime o valor de numero. O último será o valor final do Fatorial.
            
        }
    }
}
