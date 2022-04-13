package com.mirkek;

import java.util.ArrayList;
import java.util.List;

public class FourthTask {
    public static void main(String[] args) {
        String str = "fourth taskf";
        char[] chars = str.toCharArray();
        System.out.println(removeDuplicate(chars));
    }

    public static String removeDuplicate(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : chars) {
            for (int i = 0; i < chars.length; i++) {
                if (ch == chars[i]) break;
                else if (i == chars.length - 1) stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
