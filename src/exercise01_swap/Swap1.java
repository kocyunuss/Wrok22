package exercise01_swap;

import java.util.Scanner;

public class Swap1 {


    public static void main(String[] args) {

        /*

           Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı1 : ");
        int sayi1 = scan.nextInt();
        System.out.println("sayı2 : ");
        int sayi2 = scan.nextInt();

        int temp = 0;

        temp = sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("sayi1 : " + sayi1);
        System.out.println("sayi2 : " + sayi2);


    }


}
