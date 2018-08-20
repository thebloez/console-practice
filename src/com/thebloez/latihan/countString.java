package com.thebloez.latihan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thebloez on 14/07/18.
 */
public class countString {

    static final int MAX_CHAR = 256;

    public static void main(String[] args){

        String str = "dani Maulana".replaceAll("\\s", "");

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c,1);
            }
        }
        for (Character key : map.keySet()) {
            String result = key.toString() + "" + map.get(key).toString();
            System.out.print(result.replaceAll("1", ""));
        }


    }

    private static void countStringMap(String str){
        char char_array[] = str.toCharArray();

        int count = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
           char ch = char_array[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println(key+""+map.get(key));
        }
    }

    private static void countStringArr(String str){
        int[] count = new int[MAX_CHAR];
        int len = str.length();

        // init count array index
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        // create an array given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // if any matches found
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }

            if (find == 1) {
                System.out.println("Number of occurence of " + str.charAt(i) + " is " + count[str.charAt(i)]);
            }
        }
    }
}
