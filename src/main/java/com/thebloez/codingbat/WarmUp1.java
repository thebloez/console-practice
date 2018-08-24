package com.thebloez.codingbat;

/**
 * Created by thebloez on 25/07/18.
 */
public class WarmUp1 {

    public static void main(String[] args){

    }


    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    //    Given a string, we'll say that the front is the first 3 chars of the string.
//    If the string length is less than 3, the front is whatever is there.
//    Return a new string which is 3 copies of the front.
//
//    front3("Java") → "JavJavJav"
//    front3("Chocolate") → "ChoChoCho"
//    front3("abc") → "abcabcabc"
    public String front3(String str){
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

//    Given a string, take the last char and return a new string with the last char added at the front and back,
//    so "cat" yields "tcatt". The original string will be length 1 or more.
//    backAround("cat") → "tcatt"
//    backAround("Hello") → "oHelloo"
//    backAround("a") → "aaa"

    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
        String result = lastChar + str + lastChar;
        return result;
    }

//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
//    Use the % "mod" operator -- see Introduction to Mod
//    or35(3) → true
//    or35(10) → true
//    or35(8) → false
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else{
            return false;
        }
    }

//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
//    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
//    front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"
    public String front22(String str) {
        String cut;
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            cut = str.substring(0, 1);
            return cut + str + cut;
        }
    }


//    Given a string, return true if the string starts with "hi" and false otherwise.
//            startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false
    public boolean startHi(String str){
        if (str.length() < 2) {
            return false;
        }
        String firstTwo = str.substring(0,2);
        if (firstTwo.equals("hi")){
            return true;
        } else {
            return false;
        }
    }

//    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//    icyHot(120, -1) → true
//    icyHot(-1, 120) → true
//    icyHot(2, 120) → false
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 >100) || (temp2 < 0 && temp1 >100)) {
            return true;
        } else {
            return false;
        }
    }

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//    in1020(12, 99) → true
//    in1020(21, 12) → true
//    in1020(8, 99) → false
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

//    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//    Given 3 int values, return true if 1 or more of them are teen.
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true
    public boolean hasTeen(int a, int b, int c) {
        return  ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19));
    }

//    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
//            return true if one or the other is teen, but not both.
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a<=19) && (b >= 13 && b<=19)) {
            return false;
        }
        return (a >= 13 && a<=19) || (b >= 13 && b<=19);
    }

//    Given a string, if the string "del" appears starting at index 1,
//            return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//            delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1,4).equals("del")) {
            return str.replaceAll("del", "");
        }
        return str;
    }

//    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false
    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }

        String twoEquals = str.substring(2,3);
        if (twoEquals.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

}
