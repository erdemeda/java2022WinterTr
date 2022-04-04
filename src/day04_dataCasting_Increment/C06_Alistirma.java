package day04_dataCasting_Increment;

public class C06_Alistirma {
    public static void main(String[] args) {

       //Soru 1) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1=25;
        System.out.println(sayi1);

        short sayi2 = sayi1;
        System.out.println(sayi2);

        int sayi3= sayi2;
        System.out.println(sayi3);

        float sayi4=sayi3;
        System.out.println("float "+sayi4);

        double sayi5=sayi4;
        System.out.println(" double "+sayi5);

       //Soru 2)int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi6=546;
        short sayi7= (short)sayi6;
        System.out.println("narrowing short "+sayi7);

        byte sayi8=(byte) sayi7;
        System.out.println("narrowing byte "+sayi8);

        //Soru 4 )double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin

        double sayi9=255.36;
        int sayi10= (int) sayi9;
        System.out.println("narrowing double-int "+sayi10);

        byte sayi11= (byte) sayi10;
        System.out.println("narrowing int-byte "+sayi11);

        //Soru 5 )int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int sayi12=sayi6/sayi10;
        System.out.println("int/int "+sayi12);


       // Soru 6 )int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        System.out.println("int/double  "+ sayi6/sayi5);



    }
}
