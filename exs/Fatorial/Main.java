import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero, fatorial;

        System.out.println("Digite um numero para calcular a fatorial dele: ");
        numero = scn.nextInt();

        fatorial = numero;
        if(numero > 1 ){
            for(int cont = numero - 1; cont > 1 ; cont--){
            fatorial = fatorial * cont;
            System.out.println(fatorial);
            }
        }
        else if(numero == 1 || numero == 0){
            fatorial = 1;
            System.out.println(fatorial);
        }else{
            System.out.println("Numeros positivos apenas.");
        }
    }
}
