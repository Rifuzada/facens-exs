import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //EXERCICIO 1:
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        // System.out.println("Digite o valor da linha");
        // int linhas = scn.nextInt();
        // System.out.println("");
        // for(int i = linhas + 1; i > 0;i--){
        //     for(int j = 1; j < i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println("");
        // }        
        //EXERCICIO 2:
        //VOGAIS EM ORDEM ALFABETICA
        System.out.println("Digite o primeiro caractere: ");
        char inicio = scn.next().toLowerCase().charAt(0);
        System.out.println("Digite o segundo numero: ");
        char fim = scn.next().toLowerCase().charAt(0);
        for(char cont = inicio; cont <= fim ;cont++){
            if(cont == 'a'|| cont == 'e'|| cont == 'i'|| cont == 'o'|| cont == 'u'){
                System.out.println(cont);
            }
        }
        scn.close();
    }
}
