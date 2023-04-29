package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements06 {

    public static void main(String[] args) {



        /*
              Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
                 yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.



         */


        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı girin : ");
        int yas = scan.nextInt();

        if (yas>=65){

            System.out.println("Emekli olabilirsin");
        }else {

            System.out.println("Emekli olamazsın!");
        }




    }

}
