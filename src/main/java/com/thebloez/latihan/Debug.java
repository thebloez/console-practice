package com.thebloez.latihan;

/**
 * Created by thebloez on 29/06/18.
 */
public class Debug {

    public static void main(String[] args){
        int[] a = {1,2,5,9,9};
        int b = 5;
        System.out.println(solution(a,b));
    }

    private static int solution(int[] A, int X) {
//        int N = A.length;
//        if (N == 0) {
//            return -1;
//        }
//        int l = 0;
//        int r = N - 1;
//        while (l < r) {
//            int m = (l + r) / 2;
//            if (A[m] > X) {
//                r = m - 1;
//            } else {
//                l = m;
//            }
//        }
//        if (A[l] == X) {
//            return l;
//        }
//        return -1;
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2 + 1;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}
