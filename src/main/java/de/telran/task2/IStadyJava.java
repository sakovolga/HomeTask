package de.telran.task2;

public class IStadyJava {
    public static void main(String[] args) {
        String str = new String("I Stady Basic Java!");
        System.out.println("Предпоследний символ строки: " + str.charAt(str.length() - 2));
        System.out.println("Содержит ли строка подстроку 'Java' :" + str.contains("Java"));
        System.out.println("Вырезаем подстроку: " + str.substring(14, 18));
        System.out.println("Заменяем все символы 'а' на 'о': " + str.replace('a', 'o'));
        System.out.println("Преобразовываем к верхнему регистру: " + str.toUpperCase());
        System.out.println("Преобразовываем к нижнему регистру: " + str.toLowerCase());
    }
}

    /*Создайте строку через new - I study Basic Java!
        Распечатать пред-последний символ строки. Используем метод String.charAt().
        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        Вырезать строку Java c помощью метода String.substring().
        Заменить все символы “а” на “о”.
        Преобразуйте строку к верхнему регистру.
        Преобразуйте строку к нижнему регистру.*/