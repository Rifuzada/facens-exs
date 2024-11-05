import java.util.Scanner;

//Refazer codigo ac1 + simulado ac2

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double ac1, ac2, ag, af, formula, media, pesoAc1, pesoAc2, pesoAg, pesoAf;
        String continuar;

        System.out.println("Digite a media minima: ");
        media = scn.nextDouble();
        System.out.println("Defina o peso da AC1: ");
        pesoAc1 = scn.nextDouble();
        System.out.println("Defina o peso da AC2: ");
        pesoAc2 = scn.nextDouble();
        System.out.println("Defina o peso da AG: ");
        pesoAg = scn.nextDouble();
        System.out.println("Defina o peso da AF: ");
        pesoAf = scn.nextDouble();
        // deixo fora do loop dowhile para nao ficar repetindo toda vez que precisar
        // calcular nota.
        do {
            System.out.println("-----CALCULADORA DE MEDIA ALUNOS-----");
            System.out.println("Digite a nota da AC1: ");
            ac1 = scn.nextDouble();
            System.out.println("Digite a nota da AC2: ");
            ac2 = scn.nextDouble();
            System.out.println("Digite a nota da AG: ");
            ag = scn.nextDouble();
            System.out.println("Digite a nota da AF: ");
            af = scn.nextDouble();
            formula = (ac1 * pesoAc1) + (ac2 * pesoAc2) + (ag * pesoAg) + (af * pesoAf);
            System.out.println("-----CALCULADORA DE MEDIA ALUNOS-----");
            if (formula >= media) {
                System.out.println("\nSua nota final foi: " + formula + " e a media é " + media);
                System.out.println("\nParabens voce foi aprovado!!!");
            } else if (formula < media) {
                System.out.println("\nSua nota final foi: " + formula + " e a media é " + media);
                System.out.println("\nQue pena! voce foi reprovado!!!");
            } else if (formula < 10) {
                System.out.println("Sem mentir, essa nota não é possível.");
            }
            System.out.println("Deseja realizar um novo controle de notas? (S/N): ");
            continuar = scn.next().toUpperCase();
        } while (continuar.equals("S"));
        scn.close();
    }
}