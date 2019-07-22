package com.learning.solid.example4.wrong;

public class StringUtils {

    public static boolean isNullOrWhiteSpace(String string){
        if (string.equals("") || string.trim().equals("")){
            return false;
        } else {
            return true;
        }
    }
}
