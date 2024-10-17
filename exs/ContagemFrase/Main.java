import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String frase = "";
        int contConsoantes = 0, contVogais = 0;

        System.out.println("Digite a frase para contagem: ");
        frase = scn.nextLine().toLowerCase();
        char c = ' ';
        
        for(int cont = 0; cont < frase.length();cont++){
            c = frase.charAt(cont);
           if(c >='a' && c <= 'z'){
                if(c == 'a'||  c == 'e'|| c =='o' || c == 'u'|| c =='i'){
                    contVogais++;
                }else{
                    contConsoantes++;
                }         
           }            
        }
        System.out.println("Total de vogais: " + contVogais);
        System.out.println("Total de consoantes: "+contConsoantes);  
    }
}