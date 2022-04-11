package com.mirkek;

import java.util.Arrays;

public class NinthTask {
    public static void main(String[] args) {
        String str = "ninth task";
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        System.out.println(chars);
    }
}
