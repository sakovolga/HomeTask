package de.telran.task181023;

import java.util.Arrays;
import java.util.Random;

public class ReplacedIndexesByZero {
    public static void main(String[] args) {
        int[] arrInt = getInts();
        System.out.println("Первоначальный массив " + Arrays.toString(arrInt));
        System.out.println("Новый массив " + Arrays.toString(replaceToZero(arrInt)));
    }
    private static int[] replaceToZero(int[] arrInt) {
        for(int i = 0; i < arrInt.length; i++){
            if (i % 2 != 0){
                arrInt[i] = 0;
            }
        }
        return arrInt;
    }
    private static int[] getInts() {
        Random random = new Random();
        int[] arrInt = new int[8];
        for(int i = 0; i < arrInt.length; i++){
            arrInt[i] = random.nextInt(50) + 1;
        }
        return arrInt;
    }
}
//    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.