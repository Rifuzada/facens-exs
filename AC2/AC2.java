import java.util.Scanner;

/*
 * Nome: Rafael Perez Viana
 * RA: 240169
 * Turma: Semipresencial - ADS
 * 
 * Nome: Lucas Adriano De Oliveira Balbino
 * RA: 240286
 * Turma: Semipresencial - ADS
 */

public class AC2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double ac1 = 0.0, ac2 = 0.0, ag = 0.0, af = 0.0, formula = 0.0, media = 0.0, pesoAc1 = 0.0, pesoAc2 = 0.0,
                pesoAg = 0.0, pesoAf = 0.0, pesoSomado = 0.0;
        String continuar = "";

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

        pesoSomado = pesoAc1 + pesoAc2 + pesoAg + pesoAf;

        if (pesoSomado == 1) {
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
                    System.out.println("Sua nota final foi: " + formula + " e a media é " + media);
                    System.out.println("Parabens voce foi aprovado!!!");
                } else if (formula < media) {
                    System.out.println("Sua nota final foi: " + formula + " e a media é " + media);
                    System.out.println("Que pena! voce foi reprovado!!!");
                } else if (formula > 10) {
                    System.out.println("Sem mentir, essa nota não é possível.");
                }
                System.out.println("Deseja realizar um novo controle de notas? (S/N): ");
                continuar = scn.next().toUpperCase();
            } while (continuar.equals("S"));
        } else {
            System.out.println("A soma dos pesos tem que resultar em 1.");
        }
        scn.close();
    }
}