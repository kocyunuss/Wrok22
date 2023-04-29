package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {


        /*
              Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("harf girin : ");
        char harf = scan.next().charAt(0);


        if (harf=='o' || harf=='o'){
            System.out.println("ocak");

        }
        if (harf=='Ş' || harf=='ş'){

            System.out.println("şubat");
        }

    }
}
