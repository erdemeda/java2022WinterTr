package day13_stringManipulation;

import java.util.Scanner;

public class C06_Alistirma3 {
    public static void main(String[] args) {

        //Sor 4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi ve soyisminizi yaziniz: ");
        String isim=scan.next().toLowerCase();
        String soyisim=scan.next().toLowerCase();


        if (isim.length() > soyisim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        } else if (isim.length() < soyisim.length()){
            System.out.println(" soyisminiz isminizden daha uzun");
        }else if (isim.length() == soyisim.length()){
            System.out.println(" soyisminiz ve isminiz ayni uzunlukta");
        } else{
            System.out.println("lutfen uygun veri giriniz");
        }






    }
}
