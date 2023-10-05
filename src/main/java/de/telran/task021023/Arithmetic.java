package de.telran.task021023;

import java.util.Scanner;

public class Arithmetic {
    public static int addition(int a, int b){
        return (a + b);
    }
    public static int subtraction(int a, int b){
        return (a - b);
    }
    public static int multiplication(int a, int b){
        return (a * b);
    }
    public static double division(int a, int b){
        return ((double) a / b);
    }
    public static int getNumber(){
        Scanner number = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int newNumber = number.nextInt();
        return newNumber;
    }
    public static void main(String[] args) {
        int a, b;
        a = getNumber();
        b = getNumber();
        System.out.println("Сумма двух чисел равна " + addition(a, b));
        System.out.println("Разность двух чисел равна " + subtraction(a, b));
        System.out.println("Произведение двух чисел равно " + multiplication(a, b));
        System.out.println("Частное двух чисел равно " + division(a, b));
    }
}
//    Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.