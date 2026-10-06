import java.util.Scanner;
public class Exercici5 {
    static void main() {
        Scanner teclat = new Scanner (System.in);
        double preu = 73490;
        System.out.println("És Camper Full Equip?");
        String fullEquip = teclat.next();
        if (fullEquip.equals("si")){
            double PreuFull=preu+20000;
        }
        System.out.println("quants km?");
        double km = teclat.nextDouble();
        double percentperdut=(km*0.00001);
        double desgastcotxe=(preu*percentperdut/100);
        double preu_final=(preu-desgastcotxe);
        System.out.println("El preu final son");
        System.out.println(preu_final);


    }



    }

