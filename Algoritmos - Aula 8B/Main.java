import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o valor da linha");
        int linhas = scn.nextInt();
        System.out.println("");
        for(int i = linhas + 1; i > 0;i--){
            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }        
    }
}
