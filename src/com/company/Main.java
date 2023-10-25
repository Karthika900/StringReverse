package com.company;

public class Main {
    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }

    public static void main(String[] args) {
        // write your code here
        Main m = new Main();
        System.out.println(m.reverseIt("hello"));
    }
}
