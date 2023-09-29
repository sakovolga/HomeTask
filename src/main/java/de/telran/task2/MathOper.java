package de.telran.task2;

import java.util.Scanner;

public class MathOper {
    public static int addition(int a, int b){
        System.out.println("Сумма двух чисел равна " + (a + b));
        return (a + b);
    }
    public static int subtraction(int a, int b){
        System.out.println("Разность двух чисел равна " + (a - b));
        return (a - b);
    }
    public static int multiplication(int a, int b){
        System.out.println("Произведение двух чисел равно " + (a * b));
        return (a * b);
    }
    public static double division(int a, int b){
        double c = (double) a / b;
        System.out.println("Частное двух чисел равно " + c);
        return (c);
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        a = sc.nextInt();
        System.out.println("Введите второе число ");
        b = sc.nextInt();
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}
    /*Создайте методы с математическими операциями +, -, *, /
        Каждый метод принимает два числа в параметрах и возвращает результат
        Вызовите все методы в main
        Результат распечатайте в консоль*/