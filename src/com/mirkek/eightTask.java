package com.mirkek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class eightTask {
    public static void main(String[] args) {
        String str = "eight task";

        List<String> words = Arrays.asList(str.split(" "));

        Collections.reverse(words);

        System.out.println(words);
    }

}
