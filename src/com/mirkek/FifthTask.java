package com.mirkek;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print("Enter a symbol: ");
        char ch = sc.next().charAt(0);

        char[] chars = str.toCharArray();
        symbolFrequency(chars, ch);
    }

    public static void symbolFrequency(char[] chars, char ch) {
        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) result++;
        }

        System.out.println(result);
    }

}
