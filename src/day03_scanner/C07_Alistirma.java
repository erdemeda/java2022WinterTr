package day03_scanner;

import java.util.Scanner;

public class C07_Alistirma {
    public static void main(String[] args) {

        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen karenin bir kenar uzunlugunu giriniz");
        int kenarUzunlugu= scan.nextInt();

        System.out.println("Karenin cevresi: "+(kenarUzunlugu*4)+" Karenin alani:"+(kenarUzunlugu*kenarUzunlugu));


       //Kullanicidan iki tam sayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        System.out.println("Lütfen iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("İki sayinin toplami: "+(sayi1+sayi2));
        System.out.println("İki sayinin farki: "+(sayi1-sayi2));
        System.out.println("İki sayinin carpimi: "+(sayi1*sayi2));

    }
}