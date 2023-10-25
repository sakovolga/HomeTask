package de.telran.task231023;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        int max = getMaxBorder();
        System.out.println("В массиве будет содержаться " + (max - 1) + " элементов");
        int[] arr = getArr(max);
        System.out.println(Arrays.toString(arr));
        System.out.println("Потерянный элемент: " + getMissingElement(arr));
    }
    public static int getMissingElement(int[] arr){
        Arrays.sort(arr);
        if (arr[0] != 1) return 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != (arr[i+1] - 1)) return arr[i] + 1;
        }
        return arr.length + 1;
    }
    public static int[] getArr(int max) {
        Random rn = new Random();
        int[] arr = new int[max - 1];
        for (int i = 0; i < max - 1; i++) {
            int tempVar = rn.nextInt(max + 1) ;
            if (linearSearch(arr, tempVar) == -1) {
                arr[i] = tempVar;
            } else i--;
        }
        return arr;
    }
    public static int getMaxBorder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите верхнюю границу диапазона: ");
        return sc.nextInt();
    }
    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
}
//    Дан массив размера n-1, содержащий только различные целые числа в диапазоне от 1 до n. Найдите недостающий элемент.
//        Input:
//        arr[] = {1,2,3,5}
//        out: 4
//
//        arr[] = {6,1,2,8,3,4,7,10,5}
//        out: 9

