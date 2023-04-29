package exercise02_dataCasting;

public class CharAsciiTable {

    public static void main(String[] args) {



        char Y = 'Y';
        int asci1 = Y;
        char y = 'y';
        int  asci2 = y;

        System.out.println("Büyük Y' nin ascii değeri :  " + asci1);
        System.out.println("Küçük y' nin ascii değeri : " + asci2);

        System.out.print("Büyük Y ve küçük y toplamı :  ");
        System.out.println( asci1+asci2);

    }

}
