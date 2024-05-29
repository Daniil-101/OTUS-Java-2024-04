package ru.otus;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<Integer> list1 = Lists.newArrayList(1,2,3);
        List<Integer> list2 = Lists.newArrayList(4,5,6);

        List<Integer> combinedList = Lists.newArrayList();
        combinedList.addAll(list1);
        combinedList.addAll(list2);

        System.out.println(combinedList);
    }
}