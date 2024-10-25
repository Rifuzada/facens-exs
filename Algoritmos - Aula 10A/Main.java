import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int qtdNotas = 2;
        // double[] notas = new double[qtdNotas];
        // double soma = 0.0, media = 0.0, notaTmp;
        // System.out.println("Digite as notas: ");

        // for(int i = 0 ; i < qtdNotas ; i++){
        //     do{
        //         System.out.println("Digite a nota " + (i + 1) +": ");
        //         notaTmp =  scn.nextDouble();
        //     }while(!(notaTmp >=0 && notaTmp <=10));
        //     notas[i] = notaTmp;
        //     soma += notas[i];
        // }

        // media = soma/notas.length;
        // System.out.println("A media é "+ media);

        char[] vetorChar;
        String texto = "Qualquer coisa";

        vetorChar = new char[texto.length()];
        for(int i = texto.length() - 1; i >=0 ;i--){
            vetorChar[i] = texto.charAt(i);
            System.out.print(vetorChar[i]);
        }
    }
}