import java.util.Scanner;
public class Excercici2 {
    static void main() {
        System.out.println("Quan val?");
        Scanner teclat = new Scanner (System.in);
        double preu = teclat.nextDouble();
        System.out.println("Ets VIP?");
        int VIP = teclat.nextInt();
         double Preu_Final;
                if (VIP==1|| preu>200){
                    double descompte=(preu*20/100);

                    Preu_Final=(preu-descompte);
                }else{
                    Preu_Final = preu;
                }
        System.out.println(Preu_Final);


    }

}
