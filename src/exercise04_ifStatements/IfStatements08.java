package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements08 {

    public static void main(String[] args) {



        /*
                Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
              olarak yazdirin, yoksa girilen harfi yazdirin


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karakter girin : ");
        char karakter = scan.next().charAt(0);
        int sKarakter = karakter;

        if (karakter !='A' || karakter!='Z' ){

              char yeniKarakter = (char)(sKarakter-32);
            System.out.println(yeniKarakter);




        }





    }

}
