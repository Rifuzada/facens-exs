public class Main {
    public static void main(String[] args) {
    int n = 1;
    if(n == 0 ){
        System.out.println("Numero Nulo.");
    }else if(n > 0 ){
        System.out.println("Numero positivo.");
    }else{
        System.out.println("Numero negativo.");
    }
    //OU, caso não precise de condições booleanas e somente necessite verificar se um numero é igual a outro numero. Não sendo variavel, compare uma variavel com um numero ja existente, como:
    /* n = 1
    *
    */
    switch(n){
        case 1:
            System.out.println("Coca") ;
            break;
        case 2:
            System.out.println("Fanta");
            break;
        case 3:
            System.out.println("Kuat");
            break;
        default:
            System.out.println("Opção invalida");
            break;
    }
    } 
}