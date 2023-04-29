package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements07 {


    public static void main(String[] args) {

      /*
              Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
              olup olmadigini yazdirin


       */

          Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karakter girin : ");
         char karakter = scan.next().charAt(0);
         int ascikarakter = karakter;
        System.out.println(ascikarakter);

         if (ascikarakter=='A' || ascikarakter=='Z'){

             System.out.println("BÜYÜK harf");
         }else {

             System.out.println("büyük harf değil!");
         }



    }

}
