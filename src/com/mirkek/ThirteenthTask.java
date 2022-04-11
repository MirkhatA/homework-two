package com.mirkek;

public class ThirteenthTask {
    public static void main(String[] args) {
        String str = "thirteenth task";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        if (str.equals(stringBuilder.toString())) System.out.println("Its palindrome");
        else System.out.println("Its not palindrome");
    }
}
