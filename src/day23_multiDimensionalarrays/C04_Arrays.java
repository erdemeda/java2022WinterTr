package day23_multiDimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip, array'e atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yazin");

        int uzunluk=scan.nextInt();// kullanıcı 5 yazarsa

        int arr[]=new int[uzunluk];//[0,0,0,0,0]

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin"+(i+1)+"elemani giriniz");
            arr[i]=scan.nextInt();

            System.out.println(Arrays.toString(arr));

        }








    }
}
