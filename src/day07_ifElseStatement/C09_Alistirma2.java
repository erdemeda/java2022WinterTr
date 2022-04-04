package day07_ifElseStatement;

import java.util.Scanner;

public class C09_Alistirma2 {
    public static void main(String[] args) {

        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdorgenin kenar uzunluklarini yaziniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();


       if (kenar1<=0 || kenar2<=0){
           System.out.println("girilen deger dikdorgenin kenar degeri olamaz");
       } else if (kenar1==kenar2){
           System.out.println("girdiginiz dikdortgen bir karedir");
       } else{
           System.out.println("girdiginiz dikdortgen bir kare degildir");
       }







    }
}
