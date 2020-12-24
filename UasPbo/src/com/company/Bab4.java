package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double hb = a/b;

                if (hb == Double.POSITIVE_INFINITY || hb == Double.NEGATIVE_INFINITY){
                    throw new ArithmeticException();
                }

                System.out.println(hb);
                break;
            } catch (ArithmeticException e){
                System.out.println("Division by zero!");
            }
        }
    }

}
