package exercise02_dataCasting;

import java.util.Scanner;

public class DataCastingSoru2 {


    public static void main(String[] args) {

        /*
               Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
              ve bolum isleminin sonucununun tamsayi kismini yazdirin.

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayı 1 : ");
        double sayi1 = scan.nextDouble();

        System.out.println("sayi 2 : ");
        int sayi2 = scan.nextInt();

        int sonuc = (int) sayi1/sayi2;
        System.out.println(sonuc);



    }

}
