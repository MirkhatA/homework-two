package com.mirkek;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<String> strOfNums = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                strOfNums.add(String.valueOf(str.charAt(i)));
            };
        }

        System.out.println(String.join("", strOfNums));
    }
}
