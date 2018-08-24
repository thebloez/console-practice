package com.thebloez.codingbat;

import java.util.stream.IntStream;

/**
 * Created by thebloez on 26/07/18.
 */
public class Array1 {

//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
//    The array will be length 1 or more.
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false
    public boolean firstLast6(int[] nums) {
        int six = 6;
//        for (int i = 0; i <nums.length; i++) {
//            if (nums[i] == six){
//                return true;
//            }
//        }
        return nums[0] == six || nums[nums.length-1] == six;
    }

}
