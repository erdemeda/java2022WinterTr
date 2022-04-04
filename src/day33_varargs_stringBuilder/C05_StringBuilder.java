package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        Compare iki StringBuilder'i esit mi diye kontrol
        etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz. farkli olan ilk
        karakter icin ascii tablosuna göre kac deger geride
        vaya ileride oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur

        bir StringBuilder ile Stringi compare etmek istersek Java CTE verir
         */

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("Ali can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));//0

        //System.out.println(sb1.compareTo(str));


        //StringBuilder'da equals method'u String'deki == gibi calisir

        System.out.println(sb1.equals(sb2));//false iki farkli obje oldugu icin false veriyor

        System.out.println(sb1.equals(sb1));//true


        System.out.println(sb1.equals(str));//false


       // System.out.println(sb1==str);//farkli obeje turleri oldugu icin java kiyas yapmaz













    }
}
