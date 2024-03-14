package org.example;

import java.util.Scanner;

public class SequenceOfFibonacci {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the initial number of the Fibonacci sequence: ");
    int numberToCheck = input.nextInt();

    if (isFibonacci(numberToCheck)) {
            System.out.println("The number " + numberToCheck + " belong to teh Fibonacci sequence.");
    } else {
        System.out.println("The number " + numberToCheck + " does not belong to the Fibonacci sequence.");
    }

    input.close();
}

    public static boolean isFibonacci(int number){
        int a = 0;
        int b = 1;

        while (a <= number){
            if (a == number){
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
