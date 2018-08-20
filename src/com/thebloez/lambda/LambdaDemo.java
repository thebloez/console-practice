package com.thebloez.lambda;

import java.util.Scanner;

/**
 * Created by thebloez on 18/08/18.
 * https://www.community-java.com/2017/05/java-8-tutorial-belajar-java-8-lambda-expression.html
 */
public class LambdaDemo {

    public static void main(String[] args) {
        LambdaDemo demo = new LambdaDemo();

        // dengan Type Declaration
        OperasiPerhitungan penjumlahan = (int a, int b) -> a + b;

        // tanpa Type Declaration
        OperasiPerhitungan penguarangan = (a, b) ->a-b;

        // dengan return statement dan kurung kurawal
        OperasiPerhitungan perkalian = ((a, b) -> {return a*b; });

        // tanpa return statement
        OperasiPerhitungan pembagian = (a, b) -> a / b;

        Scanner scanner = new Scanner(System.in);
        Scanner lagi = new Scanner(System.in);


        while (true){
            System.out.print("masukan angka 1 ");
            int input1 = scanner.nextInt();
            System.out.print("masukan angka 2 ");
            int input2 = scanner.nextInt();
            System.out.println("proses ");
            String proses = scanner.next();


            switch (proses){
                case "+":
                    System.out.println("hasil penjumlahan " + demo.operate(input1,input2, penjumlahan));
                    break;
                case "-":
                    System.out.println("hasil pengurangan " + demo.operate(input1, input2, penguarangan));
                    break;
                case "/":
                    System.out.println("hasil pembagian " + demo.operate(input1, input2, pembagian));
                    break;
                case "*":
                    System.out.println("hasil perkalian " + demo.operate(input1, input2, perkalian));
                    break;
                default:
                    break;
            }

            // clear console
            System.out.print("\033[H\033[2J");
        }

    }

    // ---- inteface untuk lambda ------- //
    private interface OperasiPerhitungan {
        int operation(int a, int b);
    }

    private interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, OperasiPerhitungan op){
        return op.operation(a, b);
    }
    // -------------------------------- //
}
