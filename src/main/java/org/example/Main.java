package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean checkForPalindrome(String str) {
        if (str == null) return false;
        // normalize: keep only alphanumeric characters and lowercase
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String s = sb.toString();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static String convertDecimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int num = n;
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }

}