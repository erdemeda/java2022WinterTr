package day10_switch_StringManipulation;

import java.util.Scanner;

public class C06_Alistirma2 {
    public static void main(String[] args) {
//Soru3
// Kullanicidan bir sayi girmesini isteyin.
// Girilen sayi 10 ise “Iki basamakli en kucuk sayi
//100 ise “uc basamakli en kucuk sayi”
//1000 ise “dort basamakli en kucuk sayi”
//diger durumlarda “Girdigin sayiyi degistir” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        switch (sayi){
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistiriniz");






        }




















    }
}
