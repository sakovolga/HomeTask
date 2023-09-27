package de.telran.task1;

public class NumberOfThrees {
    public static void main(String[] args) {
        int number = 345;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int units = number % 10;
        System.out.println("Число 345 -> " + hundreds + ", " + tens + ", " + units);
    }
}

   /* Дано трехзначное число. Вывести на экран все цифры этого числа
        Пример: 345
        Вывод в консоль: Число 345 -> 3, 4, 5*/