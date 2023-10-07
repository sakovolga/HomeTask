package de.telran.task051023;

public class Pizza {
    public static void main(String[] args) {
        System.out.println("Лишние калории: " + (getCaloriesFromPizza(28)-getCaloriesFromPizza(24)));
    }
    static public double getCaloriesFromPizza(int diameter){
        int radius = diameter/2;
        return Math.PI*radius*radius*40;
    }
    }
//    Напишите программу, которая вычисляет, сколько лишних калорий будет,
//        если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//        Чтобы решить эту проблему, предположим,
//        что каждый квадратный сантиметр пиццы содержит 40 калорий.
