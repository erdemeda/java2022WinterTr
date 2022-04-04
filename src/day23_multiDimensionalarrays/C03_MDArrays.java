package day23_multiDimensionalarrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        //boyutları belli bir arrayi elementleri girmeden olusturalım

        //bir okulda icinde 24 ögrenci olan 8 sinif vardir

        int arr[][]=new int[8][24];


        // bir ilcede herbirinde 24 ogrencilik 8 sinif bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kisilik 2 tane de 22 kisilik sinif vardir

        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][22];

        //olustururken elementleri atama yaparsak farkli uzunluktaki inner array'ler tanimlayabiliriz

        int arr1[][]={{3,1,7,5},{6,10}};



    }
}
