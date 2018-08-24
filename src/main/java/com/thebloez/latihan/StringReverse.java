package com.thebloez.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by thebloez on 28/06/18.
 */
public class StringReverse {

    public static void main(String[] args){
        System.out.println(reverseWord("Ryan Oyeha"));

        int i = 0;
        while ((i<10) && (i > 24)){

        }
    }

    private static String reverseWord(String word) {
        String reversedWord = "";
        char[] wordChar = word.toCharArray();
        for (int i=wordChar.length - 1; i >= 0; i--) {
            reversedWord += wordChar[i];
        }
        return reversedWord;
    }

    private static String stringRev(String sentence) {
        char[] buf = sentence.toCharArray();

        // Reverse the string, character-wise
        reverse(buf, 0, buf.length);

        // Within each word, reverse the characters again
        int wordEnd = 0;
        for (int wordStart = 0; wordStart < buf.length; wordStart = wordEnd + 1) {
            for (wordEnd = wordStart; wordEnd < buf.length && buf[wordEnd] != ' '; wordEnd++) {}

            // wordStart is at the start of a word.
            // wordEnd is just past the end of the word.
            reverse(buf, wordStart, wordEnd);
        }
        return new String(buf);
    }

    private static void reverse(char[] buf, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            char swap = buf[i];
            buf[i] = buf[j];
            buf[j] = swap;
        }
    }

    public static String solution(String S) {
        // write your code in Java SE 8
//        return Stream.of(S)
//                .map(text -> new StringBuilder(text).reverse())
//                .collect(Collectors.joining(" "));
        String[] in = S.split(" ");
        int begin=0;
        int end=in.length-1;
        String temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(String.valueOf(in));
    }


}
