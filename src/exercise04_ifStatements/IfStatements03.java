package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {


        /*
             Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
             sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin : ");
        int sayi = scan.nextInt();

        if (sayi%5==0){
            System.out.println("Beş ile bölnebilen sayı");

        }else{
            System.out.println("Beş ile bölünemeyen sayı!");
        }





    }

}
