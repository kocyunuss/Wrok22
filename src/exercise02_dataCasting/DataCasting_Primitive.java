package exercise02_dataCasting;

public class DataCasting_Primitive {


    public static void main(String[] args) {



   int a = 29;
        System.out.println("A : " + a);
   short b = 11;
        System.out.println("B : " + b);

   a = b;
        System.out.println("A' nın son hali : " + a);



        double c = 245.43;
        System.out.println("C : " + c);
        float d = 26.223F;
        System.out.println("D : " + d);
        d = (float) c;
        System.out.println();

    int k = 234;
    long r = 61;

    k = (int)r;


    }

}
