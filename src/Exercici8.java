import java.util.Scanner;
public class Exercici8 {
    static void main() {
        System.out.println("Quantes nits et quedes?");
        Scanner teclat= new Scanner(System.in);
        int nits = teclat.nextInt();
        System.out.println("Quantes persones sou?");
        int persones = teclat.nextInt();
        int preuBasicEstada =  (nits * persones * 20);
        System.out.println("Marxes després de les 12?");
        String resposta = teclat.next();
        int preuFinalEstada;
        if (resposta.equals("si")) {
         preuFinalEstada = preuBasicEstada + 15;
        }else{
            preuFinalEstada = preuBasicEstada;

        }
        System.out.println("Voleu mitja pensió?");
        String pensio = teclat.next();
        double preuTotal;
        if (pensio.equals("si")) {
        System.out.println("Quants dies?");
        int dies = teclat.nextInt();

        while (dies > nits){
            System.out.println("Quants dies?");
            dies = teclat.nextInt();
        }

        double preuMitjaPensio = dies * persones * 20;
             preuTotal = preuFinalEstada + preuMitjaPensio;
        }else{
             preuTotal = preuFinalEstada;
        }

        System.out.println("El preu total és");
        System.out.println(preuTotal);


        }



    }