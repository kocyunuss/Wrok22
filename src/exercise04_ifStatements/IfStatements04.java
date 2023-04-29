package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements04 {

    public static void main(String[] args) {



        /*

                Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
                “Eskenar ucgen” yazdirin.



         */





              Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin 1. kenar uzunluğunu girin : ");
        int kenar1 = scan.nextInt();
        System.out.println("üçgenin 2. kenar uzunluğunu girin : ");
        int kenar2 = scan.nextInt();
        System.out.println("üçgenin 3. kenar uzunluğunu girin : ");
       int kenar3 = scan.nextInt();


       if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){

           System.out.println("eşkenar üçgen");

       }else{

           System.out.println("eşkenar üçgen değil ");
       }


    }


}
