package day07_ifElseStatement;

import java.util.Scanner;

public class C12_Alistirma5 {
    public static void main(String[] args) {
        // Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun
        //  * Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
        //  * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen aldiginiz urunun adedini ve liste fiyatini giriniz");
        int urunAdedi= scan.nextInt();
        double listeFiyati= scan.nextDouble();

        System.out.println("Musteri kartiniz var midir?");
        String musteriKarti= scan.next().toUpperCase();

        if (musteriKarti.equals("EVET") && urunAdedi>10){
            System.out.println("%20 indirim kazandiniz.Yeni fiyat: "+ (listeFiyati-0.2*listeFiyati));
        } else if (musteriKarti.equals("HAYIR") && urunAdedi>10){
            System.out.println("%15 indirim kazandiniz. Yeni fiyat: "+ (listeFiyati-0.15*listeFiyati));
        } else if (musteriKarti.equals("HAYIR")&&urunAdedi>10){
            System.out.println("%15 indirim kazandiniz. Yeni fiyat: "+ (listeFiyati-0.15*listeFiyati));
        } else {
            System.out.println("%10 indirim kazandiniz. Yeni fiyat: "+ (listeFiyati-0.1*listeFiyati));
        }







    }
}
