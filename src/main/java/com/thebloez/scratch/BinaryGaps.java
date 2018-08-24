package com.thebloez.scratch;

/**
 * Created by thebloez on 28/06/18.
 */
public class BinaryGaps {

    public static void main(String[] args){

        System.out.println(solution(20192817));
    }

        public static int solution(int N) {

            String binaryString = Integer.toBinaryString(N);
            int zeroHit = 0;
            int longest = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                if(binaryString.substring(i, i+1).equals("1")) {
                    if (zeroHit > longest) { longest = zeroHit; }
                    zeroHit = 0;
                }
                else { zeroHit++; }
            }
            return longest;
        }
}

