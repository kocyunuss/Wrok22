package exercise05_ifElseIfStatements;

import java.util.Scanner;

public class IfElseIfStatements04 {


    public static void main(String[] args) {


        /*
              Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
                      sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
                      “istediginiz birim sisteme kayitli degil” yazdirin.



         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi girin : "
                           +"\n kilometre cinsinden");
        int mesafe = scan.nextInt();
        System.out.println("Çevireceğiniz ölçü birimini girin : "
                           + "\n santimetre için 'c' metre için 'm' ");
        char istenenOlcuBirimi = scan.next().charAt(0);

        int metre = mesafe*1000;
        int cantimetre = mesafe*100000;

        if (istenenOlcuBirimi == 'm' ){
            System.out.println(mesafe + " km " + metre + " metre");

        } else if (istenenOlcuBirimi == 'c' ) {
            System.out.println(mesafe + " km " + cantimetre + " cantimetre");
        }else {
            System.out.println("istenen ölçü birimi sistem de kayıtlı değil");
        }


    }

}
