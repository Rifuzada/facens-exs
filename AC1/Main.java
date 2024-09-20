import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double ac1, ac2, ag, af, formula, media;

        System.out.println("-----CALCULADORA DE MEDIA ALUNOS-----");
        System.out.println("Digite a media minima: ");
        media = scn.nextDouble();
        System.out.println("Digite a nota da AC1: ");
        ac1 = scn.nextDouble();
        System.out.println("Digite a nota da AC2: ");
        ac2 = scn.nextDouble();
        System.out.println("Digite a nota da AG: ");
        ag = scn.nextDouble();
        System.out.println("Digite a nota da AF: ");
        af = scn.nextDouble();
        formula = (ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.10) + (af * 0.45);
        System.out.println("-----CALCULADORA DE MEDIA ALUNOS-----");

        if (formula >= media) {
            System.out.println("\nSua nota final foi: " + formula + " e a media é " + media);
            System.out.println("\nParabens voce foi aprovado!!!");
        } else if (formula < media) {
            System.out.println("\nSua nota final foi: " + formula + " e a media é " + media);
            System.out.println("\nQue pena! voce foi reprovado!!!");
        }
    }
}
// AC1 * 15% + AC2 * 30% + AG * 10% + AF * 45%
