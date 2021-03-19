package com.hfad.ad3lesson6.domain;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }


    public int pow(int a, int b) {
        return (int) java.lang.Math.pow(a, b);
    }


    public int sqRoot(int a) {
        return (int) java.lang.Math.sqrt(a);
    }

    public String reverseWords(String str) {

        String result = str;

        if (str != null) {
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(str);
            boolean found = matcher.find();

            if (found) {

                StringTokenizer st = new StringTokenizer(str);
                int wordsCount = st.countTokens();

                if (wordsCount == 2) {

                    String[] words = str.split(" ");
                    StringBuilder builder = new StringBuilder();
                    builder.append(words[1]).append(" ").append(words[0]);
                    result = builder.toString();

                } else if (wordsCount == 3) {

                    String[] words = str.split(" ");
                    StringBuilder builder = new StringBuilder();
                    builder.append(words[2]).append(" ").append(words[1]).append(" ").append(words[0]);
                    result = builder.toString();

                }
            }

        } else {
            result = "";
        }
        return result;
    }
}
