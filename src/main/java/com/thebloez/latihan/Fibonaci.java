package com.thebloez.latihan;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by thebloez on 28/06/18.
 */
public class Fibonaci {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String opsi;
        int limit;

        do {
            System.out.println("a. bilangan prima");
            System.out.println("b. bilangan fibonaci");
            System.out.println("c. deret bilangan genap");
            System.out.print("pilih opsi = ");
            opsi = scan.next();

            switch (opsi){
                case "a":
                    System.out.print("limit bilangan prima : ");
                    limit = scan.nextInt();
                    List<Integer> primaList =  bilanganPrima(limit);
                    System.out.println(primaList);
                    break;
                case "b":
                    System.out.print("limit bilangan fibonaci : ");
                    limit = scan.nextInt();
                    List<Integer> result = generateFiboLambda(limit);
                    System.out.println(result);
                case "c":
                    System.out.print("limit bilangan deret genap : ");
                    limit = scan.nextInt();
                    List<Integer> genapMap = bilanganDeret(limit);
                    System.out.println("bilangan genap = " + genapMap);
                    int sum = genapMap.stream().mapToInt(Integer::intValue).sum();
                    System.out.println("hasil jumlah bilangan genap " + sum);
                    break;
                case "d":
                    bubbleSort();
                    break;

                default:
                    break;
            }
            System.out.print("lagi ? y/n " );
            opsi = scan.next();
        } while (opsi.equals("y"));

    }

    private static List<Integer> bilanganDeret(int limit) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            if (i %2 == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<Integer> bilPrima1(int limit){
        List<Integer> result = new ArrayList<>();
        int index = 0;
        int angka = 0;

        for (index = 1; index <= limit ; index++) {
            int counter = 0;

            for (angka = index; angka >= 1; angka-- ) {
                if (index % angka == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                index ++;
            }
            result.add(index);
        }
        return result;
    }

    public static List<Integer> bilanganPrima(int n){
        List<Integer> result = new LinkedList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i < number; i++) {
            if (number % i == 1) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> generateFiboLambda(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[] {s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(toList());
    }

    public static List<Integer> fibo(int n){
        List<Integer> result = new ArrayList<>();
        int f = 0;
        int g = 1;

        for (int i = 1; i <= n; i++) {
            f = f + g;
            g = f - g;
            result.add(g);
        }
        result.remove(0);
        return result;
    }

    public static void bubbleSort(){
        int[] bilangan = {5, 12, 3, 19, 1, 47};
        System.out.println("sebelum " + Arrays.toString(bilangan));

        for(int index = 0; index < bilangan.length; index++) {
            for(int b = 0; b < bilangan.length-1; b++) {
                if(bilangan[b] > bilangan[b+1]) {
                    int temp = bilangan[b];
                    bilangan[b] = bilangan[b+1];
                    bilangan[b+1] = temp;
                }
            }
        }
        System.out.println("sesudah " + Arrays.toString(bilangan));
    }

}
