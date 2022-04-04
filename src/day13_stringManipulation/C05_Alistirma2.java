package day13_stringManipulation;

import java.util.Scanner;

public class C05_Alistirma2 {
    public static void main(String[] args) {
//Soru3 Kullanicidan isim isteyin Eger
//isim "a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
//isim "z“ harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
//ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.next().toLowerCase();

        if (isim.contains("a") && isim.contains("z") ){
            System.out.println("Girdiginiz isim hem a harfi hem de z harfini iceriyor");
        }else if(isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if(isim.contains("z")) {
            System.out.println("Girdiginiz isim z harfi iceriyor");
        } else{
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }











    }
}
