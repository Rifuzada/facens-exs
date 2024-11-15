import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);    
        // char [] letras = new char[3];
        // System.out.println("Digite 3 letras separadamente");
        // for(int i = 0; i <= 2 ;i++){
            
        //     letras[i] = scn.next().charAt(0);
        //     System.out.println(letras[i]);
        // }
        int[] vetorInt = {1,2,3,4};
        for(int i = 0; i < 4; i++){
            vetorInt[i] *= 2;
            System.out.println(vetorInt[i]);
        }
        scn.close();
    }
}