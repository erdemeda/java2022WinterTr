package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C10_Alistirma3 {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        // gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kutsal bir gun yaziniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("CUMA")){
            System.out.println("Muslumanlar icin kutsal gundur");
        } else if (gunIsmi.equals("CUMARTESI")){
            System.out.println("Yahudiler icin kutsal gundur");
        } else if (gunIsmi.equals("PAZAR")){
            System.out.println("Hiristiyanlar icin kutsal gundur");
        } else {
            System.out.println("Lütfen farkli bir gun yaziniz");
        }







    }
}
