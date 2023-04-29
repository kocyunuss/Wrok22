package exercise02_dataCasting;

import java.util.Scanner;

public class RakamlarToplamiBul {


    public static void main(String[] args) {

        /*

                Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim


         */

        Scanner scan = new Scanner(System.in);

        System.out.println(" 4 basamaklı sayı girin : ");
        int sayi = scan.nextInt();   // örneğin sayi 1453 olsun

        int ilkBasamak = sayi%10;    // 3
        System.out.println(ilkBasamak);

        int sayiIkinciHali = sayi/10;    //145
        System.out.println(sayiIkinciHali);

        int ikinciBasamak = sayiIkinciHali % 10; // 5
        System.out.println(ikinciBasamak);

        int sayininUcuncuHali = sayiIkinciHali / 10; // 14
        System.out.println(sayininUcuncuHali);

        int ucuncuBasamak = sayininUcuncuHali%10; //4
        System.out.println(ucuncuBasamak);

       int dorduncuBasamak = sayininUcuncuHali/10; // 1
        System.out.println(dorduncuBasamak);

        System.out.println(ilkBasamak + ikinciBasamak + ucuncuBasamak + dorduncuBasamak);

    }

}
