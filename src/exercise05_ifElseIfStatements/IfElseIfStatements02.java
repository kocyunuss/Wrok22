package exercise05_ifElseIfStatements;

import java.util.Scanner;

public class IfElseIfStatements02 {

    public static void main(String[] args) {



        /*

               Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
                         hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
                         obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
                          zayif yazdirin.


         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Boy ölçünüzü girin : ");
         int boy = scan.nextInt();
        System.out.println("kilonuzu girin : ");
        int kilo = scan.nextInt();
       int vucutKitleEndeksi = (kilo*10000 / (boy *boy));
        System.out.println(vucutKitleEndeksi);
        if (vucutKitleEndeksi>30){

            System.out.println("OBEZ");

        } else if (vucutKitleEndeksi<=30 && vucutKitleEndeksi>=25) {
            System.out.println("KİLOLU");
        } else if (vucutKitleEndeksi<=24 && vucutKitleEndeksi>19) {
            System.out.println("Normal");
        } else if (vucutKitleEndeksi<20) {
            System.out.println("Zayıf");
        }


    }

}
