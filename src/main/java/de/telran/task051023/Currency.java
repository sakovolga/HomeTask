package de.telran.task051023;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму в евро: ");
        double usd = sc.nextDouble();
        System.out.println(usd + " долларов = " + convertEurToUsd(usd) + " евро");
    }
    static public double convertEurToUsd(double euro){
        return euro*1.06;
    }
}
//    Программа запрашивает у пользователя сумму в Евро для конвертации
//    Реализовать метод, который конвертирует полученную сумму в сумму в долларах США