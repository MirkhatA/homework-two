package com.mirkek;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int numberOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) numberOfDigits++;
        }

        System.out.println(numberOfDigits);
    }
}
