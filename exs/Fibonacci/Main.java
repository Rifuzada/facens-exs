import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0, aux = 0, i = 0, n = 0, b = 1;
        System.out.println("Digite o ate qual numero de fibonacci voce quer ver: ");
        n = scn.nextInt();
        System.out.println("-------------------------");
        for(i = 0; i < n ;i++){
            aux = a;
            a +=b;
            b = aux;
            System.out.println(a);
        }
    }
}
