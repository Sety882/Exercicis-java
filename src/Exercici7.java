import java.util.Scanner;
public class Exercici7 {
    static void main() {
        double SouBase = 1250;
        System.out.println("Quantes hores extra has fet?");
        Scanner teclat = new Scanner (System.in);
                int horesExtra = teclat.nextInt();
        System.out.println("Estàs exposat al COVID?");
        String COVID = teclat.next();
        double extraCOVID;
        if (COVID.equals("si")) {
            SouBase = SouBase+250;
            extraCOVID=(horesExtra*5);
        }else
                 extraCOVID=0;

        double dinersExtra;
            if(horesExtra<=5){
                dinersExtra=(horesExtra*15);
        }else{
        double horesRestants=(horesExtra-5);
        dinersExtra=(5*15)+(horesRestants*12);
    }
    double souFinal=(SouBase+dinersExtra+extraCOVID);
System.out.println(souFinal);

        }



    }

