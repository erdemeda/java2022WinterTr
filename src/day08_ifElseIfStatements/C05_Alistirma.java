package day08_ifElseIfStatements;

import java.util.Scanner;

public class C05_Alistirma {
    public static void main(String[] args) {

        //Soru11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “ olup olmadigini kontrol edin Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        //Eger ilk harf kucuk harf ise “ olup olmadigini kontrol edin Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre girin");
        char harf=scan.next().charAt(0);

if (Character.isUpperCase(harf)){

if (harf=='A'){
    System.out.println("Gecerli siftre");
} else{
    System.out.println("Gecersiz sifre");
}}

else if (Character.isLowerCase(harf)){
    if (harf=='z'){
        System.out.println("Gecerli siftre");
    } else{
        System.out.println("Gecersiz sifre");
    }}





















    }
}
