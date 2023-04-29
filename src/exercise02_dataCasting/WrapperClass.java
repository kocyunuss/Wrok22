package exercise02_dataCasting;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WrapperClass {

    public static void main(String[] args) {


        Integer a = 20;
        System.out.println(a);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        /*
            Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
                    yazin

         */

  int b = 11;
  int c = 22;
  int d = 55;

  double ortSonuc = (double) (a+b+c)/3;
        System.out.println("Ortalama : " + ortSonuc);


      /*

             Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("harf girin : ");
        char girilenHarf = scan.next().charAt(0);
        System.out.println("Girilen harf : "
                           + "\n sonraki üç harf : "
                           + (char)(girilenHarf+1) + ", "
                           + (char)(girilenHarf+2) + ", "
                           + (char)(girilenHarf+3) );











    }

}
