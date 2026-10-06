import java.util.Scanner;
public class Exercici3 {
    static void main() {
        System.out.println("quant costen les figures?");
        Scanner teclat = new Scanner (System.in);
                double PreuFigures = teclat.nextDouble();
        System.out.println("estàn en bon estat?");
        int estat = teclat.nextInt();
        double Preu_Final;
        if (estat== 1) {
            double graninc=(PreuFigures*25/100);
            Preu_Final=(PreuFigures+graninc);
        }else{
            double inc;
            inc=(PreuFigures*10/100);
            Preu_Final=(PreuFigures+inc);
        }
        System.out.println(Preu_Final);

    }

        }



