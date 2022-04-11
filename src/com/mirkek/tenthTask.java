package com.mirkek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tenthTask {
    public static void main(String[] args) {
        String str = "tenth task";

        List<String> words = Arrays.asList(str.split(" "));

        Collections.reverse(words);

        String smallestWord = words.get(0);

        for (String word : words) {
            if (word.length() < smallestWord.length()) smallestWord = word;
        }

        System.out.println(smallestWord);
    }
}
