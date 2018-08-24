package com.thebloez.scratch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thebloez on 28/06/18.
 */
public class ForEachLoop {

    public static void main(String[] args) {
        // init list
        List<String> aku = new ArrayList<>();
        aku.add("Ryan");
        aku.add("Safary");
        aku.add("Hidayat");

        // init map
        Map<Integer, String> items = new HashMap<>();
        items.put(1, "ryan");
        items.put(2, "thebloez");
        items.put(3, "beleweh");
        items.put(4, "dunksfamz");
        items.put(5, "kampret");

        System.out.println("tradisional loop");
        normalLoop(aku, items);

        System.out.println("\nLambda exp loop");
        withLambdaExp(aku, items);

    }

    private static void withLambdaExp(List<String> list, Map<Integer, String> items) {

        //lambda List
        //Output : A,B,C,D,E
        list.forEach(item->System.out.println(item));

        //Output : C
        list.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        //method reference
        //Output : A,B,C,D,E
        list.forEach(System.out::println);

        //Stream and filter
        //Output : B
        list.stream()
                .filter(s->s.contains("ryan"))
                .forEach(System.out::println);

        // using map<k,v>
        items.forEach((k,v) -> {
            System.out.println("Item = " + k + ":" + v);
            if ("beleweh".equals(v)) {
                System.out.println("Hello Pinter");
            }
        });

    }

    private static void normalLoop(List<String> list, Map<Integer, String> items) {

        for (String aing : list) {
            System.out.println(aing);
        }

        for (Map.Entry<Integer, String> entry: items.entrySet()) {
            System.out.println("item = " + entry.getKey() + ":" + entry.getValue());
        }
    }
}
