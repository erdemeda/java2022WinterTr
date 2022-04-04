package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayi alip bu sayiları ve
        // aralarındaki tum tamsayıları yazdıran bir kod olusturun


        int baslangic=50;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

//ayni soruyu while loop ile yapalım
         int i= baslangic;
         while (i<=bitis){

         System.out.print(i+" ");
         i++;
         }

        System.out.println("");
        System.out.println(baslangic);//61


    }
}
