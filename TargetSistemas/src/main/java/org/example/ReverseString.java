package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string to reverse: ");
        String inputString = input.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("Inverted String: " + reversedString);

        input.close();
    }

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
