package hu.petrik;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

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
    public static void main(String[] args) {
        otosFeladat();
        hatosFeladat();
        hetesFeladat();
        nyolcasFeladat();
        kilencesFeladat();
        tizesFeladat();
        tizenegyesFeladat();
        tizenkettesFeladat();
        tizenharmasFeladat();
    }
}
