package day07_ifElseStatement;

import java.util.Scanner;

public class C11_Alistirma4 {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char karakter=scan.next().toLowerCase().charAt(0);


        if (Character.isLetter(karakter)){
            System.out.println("girdiginiz karakter bir harftir");
        } else if (Character.isDigit(karakter)){
            System.out.println("girdiginiz karakter bir rakamdir");
        } else {
        System.out.println("girdiginiz karakter bir semboldur");
    }





    }
}
