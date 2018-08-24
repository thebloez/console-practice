package com.thebloez.codingbat;

/**
 * Created by thebloez on 25/07/18.
 */
public class WarmUp2 {
//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//            stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"
    public String stringTimes(String str, int n) {
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str2 += str;
        }
        return str2;
    }

//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3. Return n copies of the front;
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"
    public String frontTimes(String str, int n) {
        int strLen = 3;
        if (str.length() <= 3) {
            strLen = str.length();
        }
        String front = str.substring(0, strLen);
        String result ="";
        for (int i = 0; i < n; i++) {
            result += front;
        }

        return front;
    }

//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i < 0) {
            return false;
        }
        if (i+1 >= str.length()) {
            return false;
        }

//        return str.substring(i+1,i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
         String x = str.substring(i);
         return x.startsWith("xx");
    }

//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//    stringBits("Hello") → "Hlo"
//    stringBits("Hi") → "H"
//    stringBits("Heeololeo") → "Hello"
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i+=2) {
            result = result + str.charAt(i);
        }
        return result;
    }

//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"
    public String stringSplosion(String str){
        int count = str.length();
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }
}
