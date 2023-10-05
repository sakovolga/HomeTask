package de.telran.task021023;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        String firstWord, secondWord;
        firstWord = getWord();
        secondWord = getWord();
        System.out.println("Первое слово: " + firstWord + ", второе слово: " + secondWord);
//поскольку мы еще не проходили условия и циклы, програмно еще не можем проверить четность количества букв
        String leftHalf = firstWord.substring(0, firstWord.length()/2);
        String rightHalf = secondWord.substring(secondWord.length()/2);
        System.out.println("Получилось: " + leftHalf + rightHalf);
    }
    static public String getWord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово с четным количеством букв: ");
        String word = sc.next();
        System.out.println("Количество букв в этом слове: " + word.length());
        return word;
    }
}
/*
Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
Например:
ввод - mama, papa
вывод - mapa*/
