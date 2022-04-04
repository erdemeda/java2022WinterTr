package day11_StringManipulation;

import java.util.Scanner;

public class C06_Alistirma1 {
    public static void main(String[] args) {

         //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin.
        //Girilen kelime cumlede kullanilmamis.
        //Girilen kelime cumlede 1 kere kullanilmis.
        //Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle =scan.nextLine();

        System.out.println("Lütfen aradiginiz kelimeyi giriniz");
        String kelime =scan.nextLine();


        if (cumle.indexOf(kelime)==-1){
            System.out.println("Girilen kelime cumlede kullanilmamistir");
        }
        else {
            if(cumle.indexOf(kelime, cumle.indexOf(kelime)+1) == -1) {
                System.out.println("Girilen kelime cumlede 1 kere " + cumle.indexOf(kelime) + " nolu index'te kullanilmistir.");
            }else
                System.out.println("Girilen kelime cümlede 1'den fazla kullanilmistir.");
        }





    }
}
