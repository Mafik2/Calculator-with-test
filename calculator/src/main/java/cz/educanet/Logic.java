package cz.educanet;

import java.util.Scanner;

public class Logic {
    static Scanner  sc = new Scanner(System.in);
    static Logic logic = new Logic();

    public static void show() {
        int input = 0;
        while (true) {
            

            System.out.println("__________ Kalkulačka __________");
            System.out.println("    (1) sčítání");
            System.out.println("    (2) odčítání");
            System.out.println("    (3) násobení");
            System.out.println("    (4) dělení");
            System.out.println("    (5) mocnění");
            System.out.println("    (6) faktoriál");
            System.out.println("    (9) Ukončení");
            input = sc.nextInt();


            if (input == 1) plus();
            if (input == 2) minus();
            if (input == 3) times();
            if (input == 4) divided();
            if (input == 5) power();
            if (input == 6) factorial();
            if (input == 9) System.exit(0);
        }
    }

    public static void plus() {
        System.out.println("Napiš první číslo:");
        int input1 = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int input2 = sc.nextInt();
        System.out.println("Součet čísel je " + logic.plus( input1,  input2));
    }
    public static void minus() {
        System.out.println("Napiš první číslo:");
        int input1 = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int input2 = sc.nextInt();
        System.out.println("Rozdíl čísel je " + logic.minus( input1,  input2));
    }
    public static void times() {
        System.out.println("Napiš první číslo:");
        int input1 = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int input2 = sc.nextInt();
        System.out.println("Násobek čísel je " + logic.times( input1,  input2));
    }
    public static void divided() {
        System.out.println("Napiš první číslo, které chceš vydělit:");
        int input1 = sc.nextInt();
        System.out.println("Napiš druhé číslo, kterým chceš dělit:");
        int input2 = sc.nextInt();
        System.out.println("Součet čísel je " + logic.divided( input1,  input2));
    }
    public static void power() {
        System.out.println("Napiš první číslo, které chceš umocnit:");
        int input1 = sc.nextInt();
        System.out.println("Napiš druhé číslo, kretým první číslo umocníš:");
        int input2 = sc.nextInt();
        System.out.println("Umocnění tohoto čísla na "+ input2 + " je: "+logic.power( input1,  input2));
    }
    public static void factorial() {
        System.out.println("Napiš číslo:");
        int input1 = sc.nextInt();
        System.out.println("Faktoriál tohoto čísla je " + logic.factorial(input1));
    }


    public int plus(int  input1, int  input2) {
        return input1 +  input2;
    }
    public int minus(int  input1, int  input2) {
        return input1 -  input2;
    }
    public int times(int  input1, int  input2) {
        return input1 *  input2;
    }
    public double  divided(double   input1, double  input2) {
        if (input2 != 0) {
            return input1 /  input2;
        }
        return input1;
    }

    public int power(int  input1, int  input2) {
        return (int) Math.pow( input1,  input2);
    }

    public int factorial(int input1) {
        if (input1 >= 0) {
            if (input1 == 0) return 1;
            if (input1 == 1) return 1;
            return input1 * factorial(input1 - 1); }
        return input1;
    }
}
