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
    public static void main(String[] args) {
        otosFeladat();
        hatosFeladat();

    }
}
