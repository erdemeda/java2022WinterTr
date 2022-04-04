package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {


        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;

        // variable'larin degerlerini degistirmeden
        // asagidaki ifadeleri, bu variable'lari kullanarak yazdirin

        System.out.println(str1+sayi1+str2);//Java5Güzel

        System.out.println((sayi1-sayi2)+str2+sayi1*sayi2);//2Güzel15

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));//Java22

        System.out.println(""+sayi1+sayi2+str2);//53Güzel

        System.out.println(sayi1+(sayi2+str2));//53Güzel

        /*
        Eger tamamen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek
        Integer.valueOf(str)

        bir sayiyi String'e cevirmek istersem
        ""+sayi
         */




    }

}
