package com.mirkek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<String> separatedString = new ArrayList<>();

        splitString(str, separatedString);
        System.out.println(separatedString.get(0));
        System.out.println(separatedString.get(1));

    }

    public static void splitString(String str, List<String> separatedString) {
        ArrayList<String> strOdd = new ArrayList<>();
        ArrayList<String> strEven = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) strOdd.add(String.valueOf(ch));
            else strEven.add(String.valueOf(ch));
        }

        separatedString.add(String.valueOf(strOdd));
        separatedString.add(String.valueOf(strEven));
    }
}
