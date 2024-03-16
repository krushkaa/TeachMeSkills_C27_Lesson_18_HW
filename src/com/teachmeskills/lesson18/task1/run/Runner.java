package com.teachmeskills.lesson18.task1.run;

import com.teachmeskills.lesson18.task1.fabric.ArrayFabric;
import com.teachmeskills.lesson18.task1.service.ServiceOfList;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = ArrayFabric.randomList();
        System.out.println("Our list" + list);
        ServiceOfList.removeDuplicate(list);
        ServiceOfList.evenOutput(list);
        ServiceOfList.multiplyEachElementBy2(list);
        ServiceOfList.firstFour(list);
        ServiceOfList.countElements(list);
        ServiceOfList.getAverage(list);
    }
}