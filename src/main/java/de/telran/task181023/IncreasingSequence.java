package de.telran.task181023;

import java.util.Arrays;
import java.util.Random;

public class IncreasingSequence {
    public static void main(String[] args) {
        int[] arrInt = getArrInt();
        System.out.println("Массив из 5 случайных чисел " + Arrays.toString(arrInt));
        System.out.println("Это строго возрастающая последовательность? " + isSequenceIncreasing(arrInt));
    }
    private static boolean isSequenceIncreasing(int[] arrInt) {
        boolean bool = true;
       for (int i = 0; i < arrInt.length-1; i++) {
            if (arrInt[i] > arrInt[i + 1]){
                bool =  false;
                break;
            }
       }
       return bool;
    }
    private static int[] getArrInt() {
        Random random = new Random();
        int[] arrInt = new int[5];
        for(int i = 0; i < arrInt.length; i++){
            arrInt[i] = random.nextInt(90) + 10;
        }
        return arrInt;
    }
}
//    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.