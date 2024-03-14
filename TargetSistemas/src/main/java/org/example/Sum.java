package org.example;

public class Sum {
    public static void main(String[] args) {
        int index = 13, sum = 0, k = 0;

        while (k < index){
            k++;

            sum = sum + k;
        }
        System.out.println(sum);
    }
}