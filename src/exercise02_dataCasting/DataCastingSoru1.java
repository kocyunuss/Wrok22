package exercise02_dataCasting;

import java.util.Scanner;

public class DataCastingSoru1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        /*
              Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
            ile 127 arasindaki bir sayiya donusturup yazdirin.

         */


        System.out.println("Bir sayı girin : ");
        int sayi1 = scan.nextInt();
        byte sayi2 = 18;
        sayi1 = (Byte)sayi2;
        System.out.println("Sayi1 : " + sayi1);



        /*
              Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
             isleminin sonucununun tamsayi kismini yazdirin.


         */

        System.out.println("sayı 3 : ");
        double sayi3 = scan.nextDouble();

        System.out.println("sayı 4 : ");
        double sayi4 = scan.nextDouble();

        int ortalama = (int) (sayi3/sayi4);
        System.out.println(ortalama);





    }

}
