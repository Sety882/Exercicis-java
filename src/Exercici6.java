import java.util.Scanner;
public class Exercici6 {
    static void main() {
        System.out.println("quants litres per m2 han plogut?");
        Scanner teclat = new Scanner (System.in);
        double litres = teclat.nextInt();
        if (litres>90){
            System.out.println("comportes obertes");
        } else{
            System.out.println("comportes tancades");
        }

    }
}
