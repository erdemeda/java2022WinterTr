package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz?\nEvet veya Hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: "+cevap+" derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz: "+cevap+" sonraki dersimize bekleriz");
        } else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }






    }
}
