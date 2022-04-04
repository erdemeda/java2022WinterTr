package day13_stringManipulation;

import javax.print.attribute.IntegerSyntax;

public class C02_substring {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 7000 results for\"java\"";

int ilkSpace= str.indexOf(" ");
int ikinciSpace= str.indexOf(" ",ilkSpace+1);
int ucuncuSpace= str.indexOf(" ",ikinciSpace+1);


String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucSayisiStrInt= Integer.valueOf(aramaSonucSayisiStr);

if (aramaSonucSayisiStrInt>100){
    System.out.println("Super");
}else{
    System.out.println("az sonuc bulundu");
}





    }
}
