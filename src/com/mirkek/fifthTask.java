package com.mirkek;

import java.util.HashMap;
import java.util.Scanner;

public class fifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        char[] chars = str.toCharArray();
        symbolFrequency(chars);
    }

    public static void symbolFrequency(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            int result = 0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    result++;
                }
            }

            System.out.println(chars[i] + ": " + result);
        }
    }

}
