package com.thebloez.javadeveloperzone.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

    public static void RemoveDuplicatesArrayJava7(String[] arr){
        HashSet<String> uniqueArray = new HashSet<>();

        for (String name: arr) {
            uniqueArray.add(name);
        }

        for (String name :
                uniqueArray) {
            System.out.printf(name);
        }
    }

    public  static void RemoveDuplicatesArrayJava8(String[] arr){
        Set<String> unique = Stream.of(arr).collect(Collectors.toSet());
        unique.forEach(System.out::printf);
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<>();
        for (T element :
                list) {
            if (!newList.contains(element))
                newList.add(element);
        }

        return newList;
    }
}
