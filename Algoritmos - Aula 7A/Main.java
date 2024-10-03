import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // System.out.println("Digite o horario do dia: ");
        // int horario = scn.nextInt();
        
        // if(horario < 12 && horario >= 6){
        //     System.out.println("Esta de manha.");
        // }else if(horario >= 12 && horario < 18){
        //     System.out.println("Esta de tarde.");
            
        // }else if(horario >= 18){
        //     System.out.println("Esta de noite.");
        // }else {
        //     System.out.println("Esta de madrugada.");
        // }

        //exercicio switch//

        System.out.println("Digite um numero para comparar o dia com ele.");
        int numeroDia = scn.nextInt();
        switch(numeroDia){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda-Feira");
            break;
            case 3:
            System.out.println("Terca-Feira");
            break;
            case 4:
            System.out.println("Quarta-Feira");
            break;
            case 5:
            System.out.println("Quinta-Feira");
            break;
            case 6:
            System.out.println("Sexta-Feira");
            break;
            case 7:
            System.out.println("Sabado");
            break;
            default:
            System.out.println("Invalido");
            break;
        }
        scn.close();
    }
}