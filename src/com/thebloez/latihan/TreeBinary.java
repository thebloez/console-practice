package com.thebloez.latihan;

/**
 * Created by thebloez on 29/06/18.
 */
public class TreeBinary {

    public class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }

    public int solution(Tree t) {
        return s(t)-1;
    }

    private int s(Tree t) {
        if (t == null) {
            return 0;
        }
        return Math.max(s(t.l), s(t.r)) + 1;
    }

    public int pohon(Tree t) {
        // tree kosong
        if (t == null)
            return -1;
        else
            return Math.max(pohon(t.l) + 1, pohon(t.r) + 1);
    }



}
