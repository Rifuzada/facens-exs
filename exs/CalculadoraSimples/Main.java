import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double Primeiro = 0.0, Segundo = 0.0, Resultado = 0.0;
        char operacao = ' ', escolhaSaida = ' ';

        do {
            System.out.println("Insira dois numeros: ");

            System.out.print("Primeiro: ");
            Primeiro = scn.nextDouble();

            System.out.print("Segundo: ");
            Segundo = scn.nextDouble();

            System.out.println("-------Menu-------\nSelecione uma operacao\n+ = Soma\n- = Subtracao\n/ = Divisao\n* = Multiplicacao\n-------Menu-------");
            operacao = scn.next().charAt(0);

            switch(operacao){
                case '+':
                    Resultado = Primeiro + Segundo;
                    System.out.println(Primeiro + " + " + Segundo + " = "+ Resultado);
                    break;
                case '-':
                    Resultado = Primeiro - Segundo;
                    System.out.println(Primeiro + " - " + Segundo + " = "+ Resultado);
                    break;
                case '/':
                    Resultado = Primeiro / Segundo;
                    System.out.println(Primeiro + " / " + Segundo + " = "+ Resultado);
                    break;
                case '*':
                    Resultado = Primeiro * Segundo;
                    System.out.println(Primeiro + " * " + Segundo + " = "+ Resultado);
                    break;
                default:
                    System.out.println("Operacao invalida. ");
                    break;


            }
            System.out.println("Deseja realizar outra operacao? s - sim, qualquer para continuar.");
            escolhaSaida = scn.next().charAt(0);
        } while (escolhaSaida == 's');
        scn.close();
    }
}