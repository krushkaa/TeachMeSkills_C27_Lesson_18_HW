package com.teachmeskills.lesson18.task2.service;

import com.teachmeskills.lesson18.task2.fabric.ListFab;

import java.util.List;
import java.util.stream.Collectors;

public class ListService {
    public static void namesStartsWithA(List<String> list) {
        list = list.stream()
                   .filter(name -> name.toLowerCase().startsWith("а"))
                   .collect(Collectors.toList());
        System.out.println("Names which starts with 'A': " + list);
    }

    public static void sortAndReturnFirstElement(List<String> list) {
        System.out.println("First element in sorted list: " + list.stream().sorted().findFirst().get());
    }
}

