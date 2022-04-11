package com.mirkek;

import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        String str = "thirteenth task";
        System.out.println("String: " + str);
        System.out.print("Choose position: ");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.print("Write a substring: ");
        String input = sc.next();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.insert(index, input);


        System.out.println("Modified string: " + stringBuilder);
    }
}
