package com.thebloez.hackerrank;

import java.util.Scanner;

/**
 * Created by thebloez on 25/07/18.
 */
public class intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
