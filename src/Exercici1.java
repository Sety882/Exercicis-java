import java.util.Scanner;
public class Exercici1 {
    static void main() {
        System.out.println("Digues-me un numero");
        Scanner teclat= new Scanner (System.in);
        double numero = teclat.nextDouble();
    while (numero < 0 || numero > 10) {
        System.out.println("Digues-me un numero");
       numero = teclat.nextDouble();
}
    }
}


