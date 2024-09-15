import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int idade;
        System.out.println("Digite quantos anos você tem: ");
        idade = scn.nextInt();

        if (idade <= 15) {
            System.out.println("Voce tem" + idade + "anos, voce pode ser considerado uma crianca.");
        }
        if (idade >= 15 && idade <= 21) {
            System.out.println("Voce tem " + idade + "anos, voce pode ser considerado um adolescente/jovem adulto.");
        }
        if (idade >= 21 && idade <= 60) {
            System.out.println("Voce tem " + idade + "anos, voce pode ser considerado um adulto.");
        } else {
            System.out.println("Voce tem " + idade + " anos, voce pode ser considerado um idoso.");
        }
    }
}
