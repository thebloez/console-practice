package com.thebloez.javadeveloperzone;

import com.thebloez.javadeveloperzone.basic.Example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Example1.RemoveDuplicatesArrayJava7(new String[]{"z","b","c","j","a","c"});
        System.out.println();
        Example1.RemoveDuplicatesArrayJava8(new String[]{"z","b","c","j","a","c"});
        System.out.println();

        ArrayList<Object>
                list = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, "Ryan", "RyaH", "Ryan", 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);
        // Remove duplicates
        ArrayList<Object>
                newList = (ArrayList<Object>) list.stream()
                .distinct().collect(Collectors.toList());
                //Example1.removeDuplicates(list);
        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);
        System.out.println("ArrayList with duplicates removed (lambda): "
                + newList);
    }
}
