package de.telran.task091023;

import java.util.Scanner;

public class CloserNumbers {
    public static void main(String[] args) {
        int number = 10;
        double m = getNumber();
        double n = getNumber();
        if (Math.abs(number - m) < Math.abs(number - n)) {
            System.out.println(m + " ближе к 10");
        }
        else if (Math.abs(number - m) > Math.abs(number - n)) {
            System.out.println(n + " ближе к 10");
        }
        else {
            System.out.println("Числа находятся на одинаковом расстоянии от 10");
        }
    }
    public static double getNumber() {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        return number.nextDouble();
    }
}

//    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.