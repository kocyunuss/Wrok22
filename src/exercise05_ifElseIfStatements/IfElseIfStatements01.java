package exercise05_ifElseIfStatements;

import java.util.Scanner;

public class IfElseIfStatements01 {

    public static void main(String[] args) {


        /*

                   Soru 1- Kullanicidan cinsiyetini ve yasini alin,
                   Kadin, 60 yas ve uzeri ,
                   Erkek 65  yas ve uzeri emekli olabilir.
                   Cinsiyet ve yasini dikkate alarak “Emekli
                  olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.



         */


       Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi girin : ");
       char cinsiyet = scan.next().charAt(0);
        System.out.println("Yaşınızı girin : ");
        int yas = scan.nextInt();

        if ((cinsiyet == 'E' && yas>64) || (cinsiyet == 'K' && yas>59)) {
            System.out.println("Emekli olabilirsiniz...");

        } else if (cinsiyet == 'K') {
            System.out.println("Emekli olabilmeniz için " + (60-yas) + " yıl daha çalışmalısınız!");
        } else if (cinsiyet=='E') {
            System.out.println("Emekli olabilmeniz için " + (65-yas) + " yıl daha çalışmalısınız");
        }





    }

}
