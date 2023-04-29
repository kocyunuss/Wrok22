package exercise03_incrementDecrement;

public class IncrementDecrement {


    public static void main(String[] args) {


// post increment once yazdırır sonra arttırma işlemi yapar
        int sayi = 10;
        System.out.println("post ıncrement");
        System.out.println(sayi++);
        System.out.println(sayi);

        int sayi1 = 21;

        //pre ıncrement once arttırma işlemini yapar ve sonrasında yazdırır
        System.out.println("pre ıncrement");
        System.out.println(++sayi1);


        // post ıncrement once atama yapar sonradan arttırım yapar

        int a = 10;
        int b = a++;

        System.out.println("b : " + b);
        System.out.println("a : " + a);


        // pre ıncrement once arttrma yapar sonra atama yapar

         int c = 21;
         int d = ++c;
        System.out.println("d : " + d);
        System.out.println("c : " + c);


        // örnek

        int e = 10;

        System.out.println("e nin değeri : " + ++e); //11

        int f = e++;
        System.out.println("f nin değeri : " + f); //11

        int g = f++ + e;
        System.out.println("g nin değeri : " + g); // 23

        System.out.println("son toplam : " + (e+f+g)); // 47


    }

}
