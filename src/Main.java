public class Main {

    public static void main(String [] args) {
        System.out.println("..........1..............");
        int a= 8;
        int b= 10;
        sum(a,b);
        System.out.println("..........2..............................");

        System.out.println("matematine reiksme "+ "double PISq ()");

        System.out.println("..........3...............................");

        multiply (a,b);
        System.out.println( "reiksme yra" + "" + multiply (7,3));

        System.out.println("..........4................................");
        int [] printarr= {5,4,6};
        ciklas (printarr);


        System.out.println("..........5.................................");

        ciklas(randomarr5(5,6));
        randomarr5 (5,6);


        System.out.println("............6.................................");

        int [] arr = {1,2,3,4};


    }

    public static void sum (int a,int b){
        System.out.println(a + b);
    }

    public static double PISq(){
        return 9.8596;
    }

    public static int multiply (int a,int b){
        return  a*b;
    }

    public static void ciklas (int [] printarr)  {
        for (int i = 0; i < printarr.length; i++) {
            System.out.println(printarr[i]);
        }

    }

    public static int [] randomarr5 (int min,int max){
            int [] numbers = new int [5];
        for (int i = 0; i < numbers.length; i++) {
          numbers [i] = min + (int) Math.random() *(max-min);
        }
        return numbers;
    }













    }



