package com.thebloez.scratch;

/**
 * Created by thebloez on 28/06/18.
 */
public class CyclicRotation {
    public int [] solution(int [] A, int K)
    {
        int N = A.length;
        if (N==0)
            return A;
        if (K>=N)
            K %= N;
        if (K==0)
            return A;
        int [] rotA = new  int [N];
        for (int i=0; i<N; i++)
            rotA[i] = (i<K) ? A[N+i-K] : A[i-K];
        return rotA;
    }
}
