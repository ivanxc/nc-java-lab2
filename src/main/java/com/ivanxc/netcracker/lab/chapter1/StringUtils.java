package com.ivanxc.netcracker.lab.chapter1;

public class StringUtils {
    public static void nonemptySubstrings(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
