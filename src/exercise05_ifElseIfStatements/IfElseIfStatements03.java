package exercise05_ifElseIfStatements;

import java.util.Scanner;

public class IfElseIfStatements03 {

    public static void main(String[] args) {



        /*
                Soru 3- Kullanicidan aldigi urun adedi ve  liste fiyatini alin,
                         kullaniciya musteri karti olup olmadigini sorun.
                          Musteri karti varsa 10 urunden fazla alirsa
                         %20,  Musteri karti yoksa 10 urunden fazla
                         alirsa %15 indirim yapın 10 üründen az ise indirimsiz fiyatdan alsın

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Aldığınız Ürün Adedi : ");
        int urunAdedi = scan.nextInt();
        System.out.println("Aldığınız Ürün Liste Fiyatı");
        int listeFiyatı = scan.nextInt();
        System.out.println("Müşteri Kartınız Var mı ? :"
                            +"\n Var ise 'E' ye Yok ise 'H' ye basın");
        char musteriKarti = scan.next().charAt(0);
        int toplamFiyat = (urunAdedi*listeFiyatı);
        int yuzde20 = (toplamFiyat)/100*20;
        int yuzde20Indirim = toplamFiyat-yuzde20;
        int yuzde15 = (toplamFiyat)/100*15;
        int yuzde15Indirim = toplamFiyat-yuzde15;


        if (musteriKarti == 'E' && urunAdedi>10){

            System.out.println(" % 20 indirim " + yuzde20Indirim + " TL");

        } else if (musteriKarti == 'H' && urunAdedi>10) {
            System.out.println(" % 15 indirim : " + yuzde15Indirim + " TL");
        } else if (urunAdedi<10) {
            System.out.println("indiriminiz bulunmamaktadır " + toplamFiyat + " TL");
        }


    }

}
