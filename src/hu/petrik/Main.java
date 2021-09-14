package hu.petrik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void egyesFeladat()
    {
        int atmero, melyseg;
        System.out.print("Add meg a medence átmérőjét: ");
        atmero = sc.nextInt();
        System.out.printf("Add meg a medence mélységét: ");
        melyseg = sc.nextInt();

        double terulet = (Math.PI * Math.pow((double)atmero, 2)) / 4;

        System.out.printf("A medencébe %f kömbéter víz fér belle.", terulet * melyseg);

    }

    public static void kettesFeladat()
    { //ez fixen nem jó
        int csempeNm = ((20 * 20) / 100) / 100;
        int szelesseg, magassag;
        System.out.print("Add meg a terület szélességét: ");
        szelesseg = sc.nextInt();
        System.out.print("Add meg a magasságát: ");
        magassag = sc.nextInt();

        double terulet = szelesseg * magassag;

        System.out.printf("%d db csempe kell.", (int)Math.ceil((terulet / csempeNm) * 0.1));

    }

    private static void harmasFeladat()
    {
        double szam;
        System.out.print("Adj meg egy pozitív valós számot: ");
        szam = sc.nextDouble();

        System.out.printf("A megadott szám a %d és a %d egész számok között van, és ezek közül a %d számhoz van közelebb.\n" +
                        "A szám egész része: %d\n" +
                        "A szám törtrésze: %f", (int)Math.floor(szam), (int)Math.ceil(szam), Math.round(szam),
                (int)Math.floor(szam), szam - Math.floor(szam));
    }

    private static void negyesFeladat()
    {
        int a,b,c;
        System.out.print("Add meg a háromszög 'a' oldalát: ");
        a = sc.nextInt();
        System.out.print("Add meg a háromszög 'b' oldalát: ");
        b = sc.nextInt();
        System.out.print("Add meg a háromszög 'c' oldalát: ");
        c = sc.nextInt();

        if (a + b > c || a + c > b || b + c > a){
            System.out.println("A háromszög kerülete: "+ (a + b + c));
        }
        else{
            System.out.println("Hibás adatok!");
        }
    }


    public static void otosFeladat()
    {
        int a, b;
        char kerTer;
        System.out.print("Add meg a téglalap 'a' oldalát: ");
        a = sc.nextInt();
        System.out.print("Add meg a téglalap 'b' oldalát: ");
        b = sc.nextInt();

        System.out.print("Kerületet vagy területet számoljak: ");
        kerTer = sc.next().toLowerCase().charAt(0);

        if (kerTer == 'k')
        {
            System.out.printf("A téglalap kerülete: %d\n", 2 * (a + b));
        }
        else if (kerTer == 't')
        {
            System.out.printf("A téglalap területe: %d\n", a * b);
        }
        else
        {
            System.out.println("Nincs ilyen lehetőség!");
        }
    }

    public static void hatosFeladat()
    {
        int pontszam;
        boolean pontszamNagyobbMinusz;
        System.out.print("Add meg a pontszámodat: ");
        pontszam = sc.nextInt();
        pontszamNagyobbMinusz = pontszam > -1;
        if (pontszamNagyobbMinusz && pontszam < 43)
        {
            System.out.println("Elégtelen");
        }
        else if (pontszamNagyobbMinusz &&  pontszam < 58)
        {
            System.out.println("Elégséges");
        }
        else if (pontszamNagyobbMinusz && pontszam < 73)
        {
            System.out.println("Közepes");
        }
        else if (pontszamNagyobbMinusz && pontszam < 88)
        {
            System.out.println("Jó");
        }
        else if (pontszamNagyobbMinusz && pontszam < 101)
        {
            System.out.println("Jeles");
        }
        else{
            System.out.println("Hibás adat");
        }
    }

    public static void hetesFeladat()
    {
        String[] honapok = {"Január", "Február", "Március", "Április", "Május", "Június", "Július", "Augusztus",
                "Szeptember", "Október", "November", "December"};
        int hanyadik;
        System.out.print("Add meg hanyadik hónapot írunk: ");
        hanyadik = sc.nextInt();
        switch (hanyadik)
        {
            case 1:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 2:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 3:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 4:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 5:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 6:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 7:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 8:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 9:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 10:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 11:
                System.out.println(honapok[hanyadik-1]);
                break;
            case 12:
                System.out.println(honapok[hanyadik-1]);
                break;
            default:
                System.out.println("Hibás adat!");
                break;
        }

    }

    public static void nyolcasFeladat()
    {
        int tipp;
        int fejVIras = (int)(Math.random() * 2);
        System.out.println(fejVIras);
        System.out.print("Add meg a tipped!\n0 : fej\t1 : írás\nA tipped: "); //a \t-t nem veszi figyelembe a konzol :(
        tipp = sc.nextInt();

        if (tipp == 0 || tipp == 1)
        {
            if (tipp == fejVIras)
            {
                System.out.println("Gratulálok eltaláltad!");
            }
            else
            {
                System.out.println("Sajnos nem nyert. :(");
            }
        }
        else
        {
            System.out.println("Hibás adat!");
        }



    }

    public static void kilencesFeladat()
    {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void tizesFeladat()
    {
        int sum = 0;
        int bekert;
        int paros = 0;
        int paratlan = 0;
        while (sum <= 100){
            System.out.print("Adj meg egy számot: ");
            bekert = sc.nextInt();
            if (bekert % 2 == 0 && bekert != 0){
                paros++;
            }
            else if(bekert % 2 != 0){
                paratlan++;
            }
            else{
                continue;
            }
            sum += bekert;
        }
        System.out.printf("A bekért számok közül %d volt páros és %d volt páratlan", paros, paratlan);
    }

    public static void tizenegyesFeladat()
    {
        int szam;
        int sum = 0;
        System.out.print("Adj meg egy pozitív egész számot: ");
        szam = sc.nextInt();
        if (szam > 0)
        {
            for (int i = 0; i < szam; i++) {
                if (i % 2 != 0 && i != 0){
                    sum += i;
                    //System.out.println(i);
                }
            }
            System.out.printf("A(z) %d nem nagyobb pozitív páratlan számok összege: %d",szam, sum);
        }
        else
        {
            System.out.println("Ez nem pozitív egész szám!");
        }

    }

    public static void tizenkettesFeladat()
    {
        int ketszasasDb = 0;
        int szazasDb = 0;
        int otvenesDb = 0;
        int huszasDb = 0;
        int tizesDb = 0;
        int otosDb = 0;
        int[] ermek = {200, 100, 50, 20, 10, 5};
        int osszeg;
        System.out.print("1 és 1000Ft között adj meg egy összeget: ");
        osszeg = sc.nextInt();
        if (osszeg < 1)
        {
            System.out.printf("A %d kisebb mint 1...", osszeg);
        }
        else if (osszeg > 1000)
        {
            System.out.printf("A %d nagyobb mint 1000...", osszeg);
        }
        else
        {
            for (int erme : ermek) {
                switch (erme)
                {
                    case 200:
                        ketszasasDb = osszeg / erme;
                        osszeg -= ketszasasDb * erme;
                        break;
                    case 100:
                        szazasDb = osszeg / erme;
                        osszeg -= szazasDb * erme;
                        break;
                    case 50:
                        otvenesDb = osszeg / erme;
                        osszeg -= otvenesDb * erme;
                        break;
                    case 20:
                        huszasDb = osszeg / erme;
                        osszeg -= huszasDb * erme;
                        break;
                    case 10:
                        tizesDb = osszeg / erme;
                        osszeg -= tizesDb * erme;
                        break;
                    case 5:
                        otosDb = osszeg / erme;
                        osszeg -= otosDb * erme;
                        break;
                }
            }
            System.out.printf("%ddb 200Ft\n%ddb 100Ft\n%ddb 50Ft\n%ddb 20Ft\n%ddb 10Ft\n%ddb 5Ft\nMaradék: %dFt"
                    ,ketszasasDb, szazasDb, otvenesDb, huszasDb, tizesDb, otosDb, osszeg);
        }
    }

    public static void tizenharmasFeladat()
    {
        int randomSzam = (int)(Math.random() * 100) + 1;
        boolean talalt = false;
        int tippelt;
        //System.out.println(randomSzam);
        while (!talalt)
        {
            System.out.print("Melyik számra gondoltam 1 és 100 között: ");
            tippelt = sc.nextInt();
            if (tippelt < randomSzam){
                System.out.println("Nagyobb számra gondoltam.");
            }
            else if (tippelt > randomSzam){
                System.out.println("Kisebb számra gondoltam.");
            }
            else{
                System.out.println("Gratulálok eltaláltad.");
                talalt = true;
            }
        }
    }

    public static void  tizennegyesFeladat()
    {
        String felhasznaloString;
        boolean kilepes = false;
        char menu;
        System.out.print("Adj meg egy stringet: ");
        felhasznaloString = sc.nextLine();

        while (!kilepes){
            System.out.print("a: Nagybetűssé alakítás\nb: Kisbetűssé alakítás\nc: Hossz lekérdezés\n" +
                    "d: Összehasonlítás egy másik stringgel\ne: Egy rész kiiratás\nf: Kilépés\n: ");
            menu = sc.next().charAt(0);
            switch (menu){
                case 'a':
                    System.out.println(felhasznaloString.toUpperCase());
                    break;
                case 'b':
                    System.out.println(felhasznaloString.toLowerCase());
                    break;
                case 'c':
                    System.out.println(felhasznaloString.length());
                    break;
                case 'd':
                    //Itt nem értem mit kéne összehasonlítani :(
                    break;
                case 'e':
                    int kezdet, veg;
                    System.out.print("Hanyadik karaktertől írjam ki: ");
                    kezdet = sc.nextInt();
                    while (kezdet - 1 > felhasznaloString.length() || kezdet < 1){
                        System.out.print("Hibás adat!\nAdd meg újra: ");
                        kezdet = sc.nextInt();
                    }
                    System.out.print("Hanyadik karakterig írjam ki: ");
                    veg = sc.nextInt();
                    while (veg - 1 > felhasznaloString.length() || veg < 1 || veg < kezdet){
                        System.out.print("Hibás adat!\nAdd meg újra: ");
                        veg = sc.nextInt();
                    }
                    for (int i = kezdet; i <= veg; i++) {
                        System.out.print(felhasznaloString.charAt(i - 1));
                    }
                    System.out.println();
                    break;
                case 'f':
                    kilepes = true;
                    break;
                default:
                    System.out.println("Nincs ilyen lehetőség!");
            }
        }
    }

    public static void tizenotosFeladat()
    {

    }

    public static void tizenhatosFeladat()
    {
        int[] egeszek = new int[5];
        int felhasznaloSzama;
        for (int i = 0; i < egeszek.length; i++) {
            System.out.printf("Még %ddb számot tudsz megadni: ", egeszek.length - i);
            felhasznaloSzama = sc.nextInt();
            egeszek[i] = felhasznaloSzama;
        }
        for (int i = 0; i < egeszek.length; i++) {
            System.out.print(egeszek[i] + " ");
        }
        System.out.println();
        for (int i = egeszek.length - 1; i > -1; i-- ){
            System.out.print(egeszek[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < egeszek.length; i++){
            if (i % 2 == 0){
                System.out.print(egeszek[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Adj meg egy számot 1-től 5-ig: ");
        int hanyadik = sc.nextInt();
        while(!(hanyadik < 5 && hanyadik > 1)){
            System.out.print("Külső érték!\nPóbáld újra: ");
            hanyadik = sc.nextInt();
        }
        System.out.println("A tömb " + hanyadik + ". eleme: " + egeszek[hanyadik - 1]);

    }

    public static void tizenhetesFeladat()
    {
        double[] valos1 = {1.3434546, 3.656576, 5.6778678};
        double[] valos2 = {1.5656, 3.234, 5.78853};
        double[] osszegek = new double[3];

        for (int i = 0; i < valos1.length; i++) {
            osszegek[i] = valos1[i] + valos2[i];
        }
        for (double item:
             osszegek) {
            System.out.print(item + " ");
        }
        System.out.println();

    }

    public static void tizennyolcasFeladat()
    {
        int felhasznaloSzam;
        List<Integer> szamok = new ArrayList<>();


        do {
            System.out.print("Adj meg egy számot! Ha 0-t adsz meg végez a program: ");
            felhasznaloSzam = sc.nextInt();
            if (felhasznaloSzam != 0){
                if (szamok.contains(felhasznaloSzam)){
                    System.out.println("A megadott szám már szerepel a listában.");
                    System.out.printf("A szám a %d. helyen szerepel.\n",szamok.indexOf(felhasznaloSzam) + 1);
                }
                else{
                    int beszuras;
                    System.out.print("Előlre vagy hátra akarod beszúni a számot?\n" +
                            "0: előlre\t1: hátulra\n: ");
                    beszuras = sc.nextInt();
                    switch (beszuras){
                        case 0:
                            szamok.add(0, felhasznaloSzam);
                            break;
                        case 1:
                            szamok.add(felhasznaloSzam);
                            break;
                        default:
                            System.out.println("Ilyen opció nincs!");
                    }
                }
            }
        }while (felhasznaloSzam != 0);
        for (int item: szamok) {
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        egyesFeladat();
        kettesFeladat();
        harmasFeladat();
        negyesFeladat();
        otosFeladat();
        hatosFeladat();
        hetesFeladat();
        nyolcasFeladat();
        kilencesFeladat();
        tizesFeladat();
        tizenegyesFeladat();
        tizenkettesFeladat();
        tizenharmasFeladat();
        tizennegyesFeladat();
        tizenotosFeladat();
        tizenhatosFeladat();
        tizenhetesFeladat();
        tizennyolcasFeladat();


    }
}
