import java.util.Scanner;
public class Exercici4 {
    static void main() {
        System.out.println("Quants nois hi ha?");
        Scanner teclat = new Scanner (System.in);
        double nois = teclat.nextDouble();
        System.out.println("Quants noies hi ha?");
        double noies = teclat.nextDouble();
        double total= nois+noies;
        double PerNois=(nois/total*100);
        double PerNoies=(noies/total*100);
        System.out.println(PerNois);
        System.out.println(PerNoies);


    }
}
