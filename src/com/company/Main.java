package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //task39();
        // task64();
        // task89();
        // task114();
        task139();

    }

    /**
     * Числа Фибоначчи (fn) определяются формулами f0 = f1= 1, fn = fn–1 + fn–2 при n = 2, 3, ...
     * Определить f40.
     */
    private static void task39() {
        int f1 = 1, f0 = 1, fn = 0;

        for (int n = 2; n < 40; n++) {
            fn = (f0 + f1);
            f0 = f1;
            f1 = fn;

        }
        System.out.print(fn + " ");
    }

    /**
     * Даны вещественное число а и натуральное число n.
     * Вычислить значения а^1, а^2, а^3, ..., а^n без возведения в степень.
     */

    private static void task64() {
        int nmax;
        float a, c;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите a");
        a = num.nextFloat();
        c = 1f;
        System.out.println("Введите максимальное значение n");
        Scanner num1 = new Scanner(System.in);
        nmax = num1.nextInt();
        for (int n = 1; n <= nmax; n++) {
            c *= a;
            System.out.println(c);
        }
    }

    /**
     * Даны натуральное число n и вещественные числа а1, a2, …, аn.
     * Определить сумму квадратов этих чисел.
     */
    private static void task89() {
        int n, an;
        System.out.println("Ввeдите натуральное число n:");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        float a, result;
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите вещественнное число a");
        a = num1.nextFloat();
        System.out.println("Введите максимальное кол-во чисел a ");
        Scanner num2 = new Scanner(System.in);
        an = num2.nextInt();
        for (; a <= an; a++) {
            result = a * a + n * n;
            System.out.println(result);
        }
    }

    /**
     * Покупатель должен заплатить в кассу S грн.
     * У него имеются купюры по 1, 5, 10, 50, 100, 500, 1000 и 10000 грн.
     * Сколько купюр разного достоинства отдаст покупатель, если он начинает платить с самых крупных купюр?
     */
    private static void task114() {
        int uah = 1, sum = 0, uah1 = 5, uah2 = 10, uah3 = 50, uah4 = 100, uah5 = 500, uah6 = 1000, uah7 = 10000, S;
        System.out.println("Введите сумму оплаты:");
        Scanner num = new Scanner(System.in);
        S = num.nextInt();
        int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0;
        while (S >= 10000) {
            S = S - uah7;
            count++;
        }
        while (S >= 1000) {
            S = S - uah6;
            count1++;
        }
        while (S >= 500) {
            S = S - uah5;
            count2++;
        }
        while (S >= 100) {
            S = S - uah4;
            count3++;
        }
        while (S >= 50) {
            S = S - uah3;
            count4++;
        }
        while (S >= 10) {
            S = S - uah2;
            count5++;
        }
        while (S >= 5) {
            S = S - uah1;
            count6++;
        }
        while (S >= 1) {
            S = S - uah;
            count7++;
        }
        if (count > 0) {
            System.out.println("Купюр по 10000:" + count + " штук ");
        }
        if (count1 > 0) {
            System.out.println("Купюр по 1000:" + count1 + "  штук");
        }
        if (count2 > 0) {
            System.out.println("Купюр по 500:" + count2 + "  штук");
        }
        if (count3 > 0) {
            System.out.println("Купюр по 100:" + count3 + " штук");
        }
        if (count4 > 0) {
            System.out.println("Купюр по 50:" + count4 + "  штук");
        }
        if (count5 > 0) {
            System.out.println("Купюр по 10:" + count5 + "  штук");
        }
        if (count6 > 0) {
            System.out.println("Купюр по 5:" + count6 + "  штук");
        }
        if (count7 > 0) {
            System.out.println("Купюр по 1:" + count7 + "  штук");
        }
        sum = count + count1 + count2 + count3 + count4 + count5 + count6 + count7;
        System.out.println("Купюр всех наминалов :" + sum + "  штук");
    }

    /**
     * Определите количество наборов четырёх нечётных натуральных чисел, сумма которых равна числу 10.
     */
    private static void task139() {
        int count = 0;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = i; j <= 9; j += 2) {
                for (int l = j; l <= 9; l += 2) {
                    for (int t = l; t <= 9; t += 2) {
                        if (j + i + l + t == 10) {
                            System.out.println(i + "+" + j + "+" + l + "+" + t + "=10");
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}



