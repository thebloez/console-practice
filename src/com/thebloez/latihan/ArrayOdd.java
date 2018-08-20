package com.thebloez.latihan;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by thebloez on 29/06/18.
 */
public class ArrayOdd {

    public static void main(String[] args){
        int[] A = {2,1};
        int[] B = {3,3};

        System.out.println(solution(A,B));
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length){
            if (A[i] == B[j]) {
                return A[i];
            } else if (A[i] < B[j]){
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

}
