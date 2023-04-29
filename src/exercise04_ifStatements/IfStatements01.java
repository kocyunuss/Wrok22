package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {

/*

    Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.

 */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin : ");
        int sayi = scan.nextInt();

        if (sayi%5==0){
            System.out.println("5'in tam katı");


        }else{

            System.out.println("5'in tam katı değil!");
        }







    }

}
