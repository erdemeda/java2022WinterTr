package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {


     LocalTime tm= LocalTime.now();
        System.out.println(tm);//22:10:10.898082900

//bir islemin nekadar surede bittigini bulmak istersek islemden once ve sonra
        //.......
        int sayi=0;

        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }

        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi);//22:14:54.231963800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem "+(nano2-nano1)+" nanosaniyede bitti");


        //ileri veya geri gidebiliriz

        System.out.println(tm.plusMinutes(1000));//14:59:55.599293300

       //istersek zoom id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz









    }
}
