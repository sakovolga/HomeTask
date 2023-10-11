package de.telran.task111023;

import java.util.Random;

public class LeapYear {
    public static void main(String[] args) {
        Random random = new Random();
        int year = random.nextInt(2023);
        System.out.println("Случайно выбранный год: " + year);
        isLeap(year);
    }
    static public void isLeap(int year){
        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
            System.out.println("Год " + year + " - высокосный");
        }
        else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
}
//    Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
//        Метод isLeap проверяет високосный год или нет.
