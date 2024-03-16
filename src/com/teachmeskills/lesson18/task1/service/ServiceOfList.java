package com.teachmeskills.lesson18.task1.service;

import java.util.List;

// Удалить дубликаты
// Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
// Каждый элемент умножить на 2
// Отсортировать и вывести на экран первых 4 элемента
// Вывести количество элементов в стриме
// Вывести среднее арифметическое всех чисел в стриме
public class ServiceOfList {
    public static void removeDuplicate(List<Integer> list){
        List<Integer> listWithoutDuplicate = list.stream()
                                                 .distinct()
                                                 .toList();
        System.out.println(listWithoutDuplicate);
    }
    public static void evenOutput(List<Integer> list){
        List<Integer> listWithEven = list.stream()
                                         .filter(n -> n > 6 && n < 17)
                                         .filter(n -> n % 2 == 0)
                                         .toList();
        System.out.println(listWithEven);
    }
    public static void multiplyEachElementBy2 (List<Integer> list){
        List<Integer> multiList = list.stream()
                                      .map(n -> n * 2)
                                      .toList();
        System.out.println(multiList);
    }
    public static void firstFour (List<Integer> list){
        List<Integer> firstFourList = list.stream()
                                          .sorted()
                                          .limit(4)
                                          .toList();
        System.out.println(firstFourList);
    }
    public static void countElements(List<Integer> list){
        long elInStream = list.stream()
                              .count();
        System.out.println(elInStream);
    }
    public static void getAverage(List<Integer> list){
        long sumStream = list.stream()
                             .mapToInt(n -> n)
                             .sum();
        long elInStream = list.stream()
                             .count();
        long average = sumStream / elInStream;
        System.out.println(average);
    }
}

