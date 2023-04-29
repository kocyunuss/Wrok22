package exercise04_ifStatements;

import java.util.Scanner;

public class IfStatements05 {

    public static void main(String[] args) {

  /*
        Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.


   */


        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu girin : ");
        int not = scan.nextInt();

        if (not>50){

            System.out.println("sınıfı geçtin");

        }else{
            System.out.println("sınıfta kaldın ! ");
        }







    }

}
