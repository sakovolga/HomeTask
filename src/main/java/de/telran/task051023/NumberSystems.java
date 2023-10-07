package de.telran.task051023;

public class NumberSystems {
    public static void main(String[] args) {
        System.out.println("Перевод числа 333 из 16-ричной системы в 10-тичную: " + Integer.parseInt("333", 16));
        System.out.println("Перевод числа 819 из 10-тичной системы в 16-ричную: " + Integer.toString(819, 16));
        System.out.println("Перевод числа 101101 из двоичной системы в 10-тичную: " + Integer.parseInt("101101", 2));
        System.out.println("Перевод числа 124 из 10-тичной системы в двоичную: " + Integer.toString(124, 2));
    }
}
//    Переведите число 333 из 16-ричной в 10-ричную
//        Переведите число 819 из 10-ричной в 16-ричную
//        101101 в двоичной, переведите в 10-ричную
//        124 в десятичной, переведите в 2-ичную