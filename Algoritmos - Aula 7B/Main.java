import java.util.Scanner;

public class Main{
    //Exemplo 1 - for
    // public static void main(String[] args) {
    //     for (int cont = 2; cont <= 10; cont+=2){
    //             System.out.println(cont);
    //     }
    // }

    //Exemplo 3 - for
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rangeMin, rangeMax;
        System.out.println("digite apartir de qual numero: ");
        rangeMin = scn.nextInt();
        System.out.println("digite ate qual numero: ");
        rangeMax = scn.nextInt();

        for(int cont = rangeMin ;cont <= rangeMax && cont % 7 != 0; cont++ ){
            System.out.println(cont + " não é divisivel por 7");
        }
    }
}