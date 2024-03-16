package com.teachmeskills.lesson18.task2.run;

import com.teachmeskills.lesson18.task2.fabric.ListFab;
import com.teachmeskills.lesson18.task2.service.ListService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = ListFab.createListOfStudent();
        System.out.println("Default list: " + list);
        ListService.namesStartsWithA(list);
        ListService.sortAndReturnFirstElement(list);

    }
}
