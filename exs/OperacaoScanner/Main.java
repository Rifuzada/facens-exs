import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double resultadoDiv;
        int primeiroNumero = 0, segundoNumero = 0, resultado = 0;
        String op;

        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        segundoNumero = scn.nextInt();
        System.out.println("Digite o operador: ");
        op = scn.next();

        if (op.equals("/")) {
            resultadoDiv = (double) primeiroNumero / segundoNumero;
            System.out.println("O resultado da divisao é " + resultadoDiv);
        }
        if (op.equals("+")) {
            resultado = primeiroNumero + segundoNumero;
            System.out.println("O resultado da soma é " + resultado);
        }
        if (op.equals("-")) {
            resultado = primeiroNumero - segundoNumero;
            System.out.println("O resultado da subtracao é " + resultado);
        }
        if (op.equals("*")) {
            resultado = primeiroNumero * segundoNumero;
            System.out.println("O resultado da multiplicacao é " + resultado);
        }

    }
}
