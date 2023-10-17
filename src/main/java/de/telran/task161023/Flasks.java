package de.telran.task161023;

import java.util.Scanner;

public class Flasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру первой колбы: ");
        double temperature1 = sc.nextDouble();
        System.out.print("Введите температуру второй колбы: ");
        double temperature2 = sc.nextDouble();
        System.out.println("Устройство работает исправно? " + isDeviceCorrect(temperature1, temperature2));
    }
    static public boolean isDeviceCorrect (double temperature1, double temperature2){
        return temperature1 > 100 && temperature2 < 100;
    }
}
//Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов.
//        Вы должны написать метод, который проверяет это устройство.
//        Ваша программа должна иметь переменные temperature1 и temperature2.
//        В результате метод возвращает true или false.