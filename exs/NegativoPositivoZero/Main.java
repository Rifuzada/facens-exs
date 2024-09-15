import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero, sendo positivo negativo ou zero: ");
        numero = scn.nextInt();

        if (numero == 0) {
            System.out.println("O seu numero é zero");
        }
        if (numero < 0) {
            System.out.println("O seu numero é negativo");
        }
        if (numero > 0) {
            System.out.println("O seu numero é positivo");
        }
    }
}
