import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite numeros diferentes");
        System.out.println("Digite o primeiro numero: ");
        numero1 = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = scn.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " maior que " + numero2);
            System.out.println("1");
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " menor que " + numero2);
            System.out.println("2");
        } else if (numero1 == numero2) {
            System.out.println("{ERRO} Numero iguais.");
        }
    }
}
