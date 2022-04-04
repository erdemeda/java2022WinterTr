package day07_ifElseStatement;

import java.util.Scanner;

public class C08_Alistirma1 {
    public static void main(String[] args) {

//Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
//isimlerini yazdirin
//Ornek:
//ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
//ilkHarf=S output = “Sali”
//*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen gün isimlerinden birinin ilk harfini yaziniz");
       String ilkHarf=scan.next().toUpperCase();

if (ilkHarf.equals("P")){
    System.out.println("Girdiginiz gün: Pazar,Pazartesi veya Persembe'dir");
}
else if (ilkHarf.equals("C")){
            System.out.println("Girdiginiz gün: Carsamba, Cuma veya Cumaetesi'dir");
        }
else if (ilkHarf.equals("S")){
    System.out.println("Girdiginiz gün: Sali'dir");
} else {
    System.out.println("Lütfen gecerli bir ilk harf giriniz");
}













    }
}
