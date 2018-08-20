package com.thebloez.lambda;

/**
 * Created by thebloez on 18/08/18.
 */
public class LambdaDemo2 {

    public static void main(String[] args) {
        String msg = "Hello! ";

        GreetingService greeting = pesan ->
                System.out.println(msg + pesan);

        greeting.getMessage("Thebloez");
    }

    private interface GreetingService {
        void getMessage(String pesan);
    }
}
