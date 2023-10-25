package de.telran.task161023;

import java.util.Scanner;

public class MoneyFromTheBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какая сумма на счете? (введите целое число) ");
        int n = sc.nextInt();
        System.out.println("На счете " + n);
        int day;
        for (day = 1; n>0; ++day){
            int maxDivisor = getMaxDivisor(n);
            n = n - maxDivisor;
            System.out.println("День " + day + " Снято " + maxDivisor + " осталось " + n);
        }
        System.out.println("Всего дней: " + (day-1));
    }
    private static int getMaxDivisor(int n) {
        int remainder, divisor = 0;
        for (int i = 2; i<= n && n != 1; i++) {
            remainder = n % i;
            if (remainder == 0){
                divisor = n / i;
                break;
            }
        }
        if (n == 1){
            divisor = 1;
        }
        return divisor;
    }
    public static int getMaxDivisorCorrectedByTeacher (int n) {
        for (int i = n-1; i > 1 ; i--) {
            if (n%i == 0) return i;
        }
        return 1;
    }
}

//    У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму,
//        которая является делителем текущей суммы на счету
//        и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день,
//        сколько дней вам понадобится,
//        чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
//        Ввод:  N = 21
//        Выход:  7
//        Объяснение:  N = 21
//        Снято 7, осталось = 14
//        Снято 7, осталось = 7
//        Снято 1, осталось = 6
//        Снято 3, осталось = 3
//        Снято 1, осталось = 2
//        Снято 1, Осталось = 1
//        Снято 1, осталось = 0