import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String medidaTipo;
        double medidaEscolhida , medidaKm, medidaCm, medidaM;

        System.out.println("KM = Quilometros |M = Metros|CM = Centimetros");
        System.out.println("Digite qual tipo de medida voce quer converter: ");

        medidaTipo = scn.next();
        medidaTipo.toLowerCase();
        
        System.out.println("Digite qual a distancia: ");
        
        medidaEscolhida = scn.nextDouble();
        
        switch(medidaTipo){
            case "km":
            medidaM = medidaEscolhida * 1000;
            medidaCm = medidaEscolhida * 100000;
            System.out.println("A medida escolhida: "+ medidaEscolhida + "Km, em metros ficaria: "+medidaM+"M e em centimetros ficaria: "+medidaCm+"Cm.");
            break;
            case "m":
            medidaKm = medidaEscolhida / 1000;
            medidaCm = medidaEscolhida * 100;
            System.out.println("A medida escolhida: "+ medidaEscolhida + "m, em quilometros ficaria: " + medidaKm + "Km e em centimetros ficaria: "+medidaCm+"Cm.");
            break;
            case "metros":
            medidaKm = medidaEscolhida / 1000;
            medidaCm = medidaEscolhida * 100;
            System.out.println("A medida escolhida: "+ medidaEscolhida + "m, em quilometros ficaria: " + medidaKm + "Km e em centimetros ficaria: "+medidaCm+"Cm.");
            break;
            case "cm":
            medidaM = medidaEscolhida / 100;
            medidaKm = medidaEscolhida / 100000;
            System.out.println("A medida escolhida: "+ medidaEscolhida + "cm, em metros ficaria: " + medidaKm + "Km e em metros ficaria: "+medidaM+"M.");
            break;
            case default:
            System.out.println("Opção invalida. Tente Metros, M, KM, CM");
        }
        
    }
}