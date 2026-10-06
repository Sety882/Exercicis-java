import java.util.Scanner;
public class Exercici11 {
    static void main() {
        System.out.println("Digue’m les 4 notes dels apartats");
        Scanner teclat= new Scanner (System.in);
        double nota1 = teclat.nextDouble();;
        double nota2 = teclat.nextDouble();
        double nota3 = teclat.nextDouble();
        double nota4 = teclat.nextDouble();
        double mitjana = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("La mitjana és: " + mitjana);

        if (mitjana >= 5) {
            System.out.println("aprovat");
        } else {
            System.out.println("suspes");
        }
    }
}





