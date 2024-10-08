package Task_19_1_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    //    Перед тобой программа, которая сортирует список строк по их длине по возрастанию.
//    Это делает метод sortStringsByLength(ArrayList<String>).
//    Для сортировки строк используется метод Collections.sort(ArrayList<String>, Comparator<String>),
//    который принимает список строк и компаратор в виде лямбда-выражения.
//
//    Твоя задача — переписать реализацию метода sortStringsByLength(ArrayList<String>),
//    чтобы вместо лямбда-выражения использовался класс StringComparator,
//    который реализует интерфейс Comparator<String>, не меняя логику работы метода
//    sortStringsByLength(ArrayList<String>).
//
//    То есть нужно, чтобы в классе StringComparator метод int compare(String s1, String s2)
//    возвращал числовое значение согласно этим условиям:
//
//    отрицательное число, если длина строки s1 меньше длины строки s2;
//    положительное число, если длина строки s1 больше длины строки s2;
//    0, если длины строк s1 и s2 одинаковы.

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Collections.sort(strings, new StringComparator());
    }
}
