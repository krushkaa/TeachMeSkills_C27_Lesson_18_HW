package com.teachmeskills.lesson18.task1.fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayFabric {
    public static List<Integer> randomList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int num = random.nextInt(0, 10);
            list.add(num);
        }
        return list;
    }
}
