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

    public static void main(String[] args) {
        otosFeladat();

    }
}
