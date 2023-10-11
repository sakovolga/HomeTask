package de.telran.task111023;
import java.util.Random;
public class Shops {
    public static void main(String[] args) {
        Random rd = new Random();
        boolean isEdekaOpen = rd.nextBoolean();
        boolean isReweOpen = rd.nextBoolean();
        System.out.println("Первый магазин открыт? " + isEdekaOpen);
        System.out.println("Второй магазин открыт? " + isReweOpen);
        System.out.println("Я сегодня куплю еду? " + canBuy(isEdekaOpen, isReweOpen));
    }
    static public boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        if (isEdekaOpen || isReweOpen){return true;}
        else {return false;}
    }
}
//    Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение. 