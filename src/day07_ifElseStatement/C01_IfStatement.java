package day07_ifElseStatement;

public class C01_IfStatement {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        if (a == b) {
            System.out.println("verilen sayilar esit");

        }

        if (a > 100) {
            System.out.println("a yüzden büyük");
        }

        if (a * b > 1) {
            System.out.println("sayilarin carpimi 1 den buyuk");
        }
        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //  hicbirisinin body'si calismayada bilir

    }
}
