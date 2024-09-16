import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int primeiroLado, segundoLado, terceiroLado;

        System.out.println("Digite a medida do primeiro lado: ");
        primeiroLado = scn.nextInt();

        System.out.println("Digite a medida do segundo lado: ");
        segundoLado = scn.nextInt();

        System.out.println("Digite a medida do terceiro lado: ");
        terceiroLado = scn.nextInt();

        if (primeiroLado == terceiroLado && primeiroLado == segundoLado) {
            System.out.println("O triangulo é equilatero");
        } else if (primeiroLado == terceiroLado || primeiroLado == segundoLado || segundoLado == terceiroLado) {
            System.out.println("O triango é isosceles");
        } else {
            System.out.println("É escaleno");
        }
    }
}
