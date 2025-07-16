package com.example;

public class StringUtil {

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public boolean hasLengthGreaterThan(String str, int length) {
        return str != null && str.length() > length;
    }
}
