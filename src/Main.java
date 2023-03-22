import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("................1.................=).......");
        int a = 8;
        int b = 10;
        sum(a, b);
        System.out.println(".................2.......................");

        System.out.println("matematine reiksme " + "double PISq ()");

        System.out.println("..................3.......................");

        multiply(a, b);
        System.out.println("reiksme yra" + "" + multiply(7, 3));

        System.out.println("..................4........................");
        int[] printarr = {5, 4, 6};
        printarray(printarr);


        System.out.println("...................5........................");

        randomarr5(5, 6);


        System.out.println("....................6........................");
        //int [] sumarr = randomarr5( 20,30);
        //printarray(sumarr());
        //Main.sumarr(sumarr());

        System.out.println("....................7.........................");

        System.out.println(averrage(printarr));

        System.out.println("............ .......8.........................");
        int x = 2;
        int y = 10;
        Main.rectangle(x, y);
        System.out.println("....................9..........................");

        sentence("snd yr laba gera diena");

        System.out.println("....................10..........................");
        String text = "Naglis";
        //System.out.println(codingsentence (text));


        System.out.println("..................1 SUNKESNIS...................");
        //String text = " labas";
        argument(text);
        System.out.println("..................2 SUNKESNIS....................");
        String text1 =generateRndStr(10);
        System.out.println(text1);

        System.out.println("..................3 SUNKESNIS....................");
        int age = 64;
        dividorCount(age);
        int num=100;
        System.out.println( dividorCount(num));
        System.out.println( "num reiksme yra :  " + num + " "); //2;4;5;10;20;25;50;
        System.out.println("......................4 SUNKESNI..................");
        int[] arr = {5,8,3,4,16,10,1};
        int[] sortedArr= sortIntArr(arr);
        int min4 = 33;
        int max4 = 77;
        int[] rndArr = generateRndIntArr(100,33,77);
        System.out.println( Arrays.toString(rndArr) );
        sortedArr =  sortIntArr(rndArr);
        System.out.println( Arrays.toString(sortedArr) );
        System.out.println("........................5 SUNKESNI.................");

    }

    /*
    1. Sukurkite Funkciją kuri priima du int tipo kintamuosius.
    Juos susumuoja ir atspausdina.

     */
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    /*
    2. Sukurkite Funkciją kuri vadinasi PISq.
    Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
    Gautą reikšmę atspausdinkite.
     */
    public static double PISq() {
        return 9.8596;
    }

    /*
    3. Sukurkite Funkciją kuri priima du int tipo kintamuosius.
    Funkcija gražina skaičių sandaugą.;
    Gautą reikšmę atspausdinkite.

     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /*
    4. Sukurkite Funkciją kuri priima int[] tipo kintamąį,
    prasuka ciklą ir atspausdina kiekvieną skaičių.

     */
    public static void printarray(int[] printarr) {
        for (int i = 0; i < printarr.length; i++) {
            System.out.println(printarr[i]);
        }

    }

    /*
    5. Sukurkite Funkciją kuri sugeneruotų 5-ių random int skaičių masyvą ir jį gražintų.
    intervalą(min, max sugalvokite patys).
     */
    public static int[] randomarr5(int min, int max) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + (int) (Math.random() * (max - min + 1));
        }
        return numbers;
    }


    /*

   6.Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
   */
    public static int sumarr(int[] numbers) {
        int sumarr = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumarr += numbers[i];
        }
        return sumarr;
    }


/*
7.Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

 */


    public static double averrage(int[] numbers) {
        double averrage = 0;
        for (int i = 0; i < numbers.length; i++) {
            averrage += numbers[i];

        }
        return averrage / numbers.length;
    }


    /*
    8. Sukurkite Funkciją kuri priimtų du int skaičius ir
    atspausdintų stačiakampį užpildytą žvaigždutėmis.
     Pirmas int - išoriniam ciklui, antras vidiniam.

     */
    public static void rectangle(int x, int y) {
        for (int i = 0; i < y; i++) {
            String stars = "";
            for (int j = 0; j < x; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }

/*
9. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir
atspausdintų kiek jame yra raidžių ir tarpų. Sakinys - “Šiandien labai graži diena”.
(kodas turi veikti padavus bet kokį sakinį)

 */

    public static void sentence(String text) {
        //System.out.println(text.length());
        System.out.println(text.length() + (text.replace("a", "").length()));
    }

/*
10. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.

 */

    public static void codingsentence(String text) {
        String result = " ";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return;


    }

    //result= ""; 2as sprendimo budas
    // for (int i =0;i<text.lenght();i ++{
    //result= text.charAt (i)+ result;//
    //{
    //return result

/*
 1 SUNKESNIS. Parašykite funkciją, kurios argumentas būtų tekstas,
kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje ir gale. PVZ (---labas---)

 */

    public static void argument(String text) {
        System.out.println("...." + text + ".....");
    }

    /*
    2 SUNKESNIS. Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
     Atspausdinkite simbolius stulpeliu.
     Jei tai skaičius apgaubkite “ [ 7 ]”.
     Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

     */
    public static String generateRndStr(int Lenght) {
        String symbols = "abcdefghijklmnopqrstuvwxyz0123456789";
        String rndStr = " ";
        for (int i = 0; i < Lenght; i++) {
            rndStr += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        //System.out.println(rndStr);
        return rndStr;
    }
    //String nums= "";
    //for (int i=0; i< rndStr.lenght(); i++){
    //if (Character.isDigit(rndStr.charAt(i))){
    //nums+= rndStr.charAt(i);
    //}else{
    // if (nums.length()!=0){
    // System.out.println("[" + nums + "]");
    //  nums = "";
    //}
    //System.out.println(rndStr.charAt(i));
    // }





 /*
3 SUNKESNIS.  Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių
  jos argumentas dalijasi be liekanos (išskyrus vienetą ir patį save).

  */

    public static int dividorCount (int num) {
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }


/*
4 SUNKESNIS.Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai
nuo 33 iki 77. Išrūšiuokite masyvą pagal daliklių be liekanos
kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.

 */


    public static int [] sortIntArr (int [] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int a = i; a < arr.length; a++) {
             //   System.out.print(" "+ a + " " + "elementas yra");
                if (dividorCount(arr[i]) < dividorCount(arr[a])) {
                    int temp = arr[i];
                    arr[i] = arr[a];
                    arr[a] = temp;

                }
             //   System.out.println(Arrays.toString(arr));
        }
    }
        return arr;
    }


     public static int[] generateRndIntArr (int length, int min, int max){
                int[] arr = new int[length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = min + (int) (Math.random() * (max - min));
                }
               return arr;
     }

/*
Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai
skaičiai nuo 333 iki 777. Naudodami 3 uždavinio funkciją iš masyvo
suskaičiuokite kiek yra pirminių skaičių.

 */

    public static int [] generateRndIntArrpir ( int lenght, int min, int max){
        int[]arr= new int [lenght];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = min + (int) (Math.random() * (max-min));
            if(arr[i] % 2 ==0){

            }

        }
    }










}

























