import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        
        int primeiroValor = 0, segundoValor = 0, resultado = 0; //int pq é soma não outro tipo de operação
        
        /*
        OU
            int primeiroValor = 0;
            int segundoValor = 0;
            int resultado = 0;
        */
        
        System.out.println("Digite o primeiro numero da soma: ");
        primeiroValor = scn.nextInt();
        System.out.println("Digite o segundo numero da soma: ");
        segundoValor = scn.nextInt();
        resultado = primeiroValor + segundoValor;
        System.out.println("O resultado da soma é " + resultado);
    }
}
