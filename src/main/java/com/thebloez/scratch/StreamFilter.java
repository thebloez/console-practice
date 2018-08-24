package com.thebloez.scratch;

import com.thebloez.scratch.model.Family;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by thebloez on 28/06/18.
 */
public class StreamFilter {

    public static void main(String[] args) {

        List<String> familyMember = Arrays.asList("Ryan", "Lulu", "Nadiem", "Lory");

        // filter biasa
        filterTradisional(familyMember);

        System.out.println("\n");
        // filter dengan stream
        filterUsingStream(familyMember, "Nadiem");
//------------------------------------------------------
        System.out.println("\n");
        List<Family> families = Arrays.asList(
                new Family("Ryan", 29),
                new Family("Lulu", 24),
                new Family("Nadiem", 1));

        Family result = getFamilyByName(families,"Ryan");
        System.out.println(result);
//------------------------------------------------------

        System.out.println("\nMenggunakan Stream");
        Family familyStream = families.stream()
                .filter(family -> "Ryan".equals(family.getName()))
                .findAny()
                .orElse(null);

        System.out.println(familyStream);

        System.out.println("\nMultiple Condition");
        int filterAge = 29;
        Family family = families.stream()
                .filter(f -> filterAge == f.getAge() || 1 == f.getAge())
                .findAny()
                .orElse(null);
        System.out.println("hasil filter : " + family);
    }

    private static Family getFamilyByName(List<Family> list, String nama) {
        Family result = null;
        for (Family member : list) {
            if (nama.equals(member.getName())) {
                result = member;
            }
        }

        return result;
    }

    private static void filterUsingStream(List<String> list, String filter){
        List<String> result = list.stream()
                .filter(line -> !filter.equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    private static void filterTradisional(List<String> list){
        List<String> result = getFilter(list, "Lulu");
        for (String temp : result) {
            System.out.println(temp);
        }
    }

    private static List<String> getFilter(List<String> list, String filter){
        List<String> result = new ArrayList<>();

        for (String line : list) {
            if (!line.equals(filter)) {
                result.add(line);
            }

        }

        return result;
    }
}
