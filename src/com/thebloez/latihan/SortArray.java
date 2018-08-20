package com.thebloez.latihan;

import java.util.Arrays;

/**
 * Created by thebloez on 29/06/18.
 */
public class SortArray {

    public static void main(String[] args){
        int[] tes = {1,3,5,3,4};

        System.out.println(solution(tes));
    }

    public static boolean solution(int[] A){
        int count = 0;
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++)
        {
            if(A[i] != B[i]) count++;
        }

        if(count > 2) return false;
        return true;
    }
}
