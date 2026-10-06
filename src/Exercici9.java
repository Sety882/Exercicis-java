import java.util.Scanner;
public class Exercici9 {
    static void main() {
        System.out.println("Quin és el teu sou base?");
        Scanner teclat= new Scanner (System.in);
                int SouBase = teclat.nextInt();
        System.out.println("Digue'm el preu de les tres vendes");
        double venta1 = teclat.nextDouble();
        double venta2 = teclat.nextDouble();
        double venta3 = teclat.nextDouble();
        double SumaVentes = venta1 + venta2 + venta3;
        double comissio = (SumaVentes * 0.1);
        double SouFinal = (SouBase + comissio);
        System.out.println("El teu sou final es de");
        System.out.println (SouFinal);

    }
}
