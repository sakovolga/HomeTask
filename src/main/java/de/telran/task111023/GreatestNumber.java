package de.telran.task111023;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int a = getNumber();
        int b = getNumber();
        int c = getNumber();

//          1 СПОСОБ
        System.out.println("Наибольшее число: " + getMax(a, b, c));
//          2 СПОСОБ
        System.out.println("Наибольшее число: " + anotherGetMax(a, b, c));
//          3 СПОСОБ
        System.out.println("Наибольшее число: " + Math.max(Math.max(a,b), c));
    }
    static public int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        return sc.nextInt();
    }
    static public int getMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }
    static public int anotherGetMax(int a, int b, int c){
        int max = (a >= b ? a: b);
        return c > max? c: max;
    }
}
//    Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
//        Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//        Напечатает максимум из трех чисел.
