package com.thebloez.latihan;

import java.util.Scanner;

/**
 * Created by thebloez on 29/06/18.
 */
public class Reverse {

    public static void main(String[] args) {
        String s = "Andri Fajrian";

        String S1 = solution(s);
        System.out.println(S1);
    }

    static String solution(String S) {
        String[] sArry;

        sArry = S.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sArry.length; i++) {
            sArry[i] = reverse(sArry[i]);
            sb.append(sArry[i] + " ");
        }

        return sb.toString().trim();
    }

    static String reverse(String str) {
        String reverse = "";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        str = str.toLowerCase();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);

        return reverse.trim();
    }

    static String reverseFirstAndLast(String str){
        if (str.length() <= 1) {
            return str;
        }

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()) + mid + str.charAt(0);

    }
}
