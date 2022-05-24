package com.sparta.wt.Pallindrome;

public class App {
    static String word1 = "Helicopter";
    static String word2 = "Radar";

    public static void main(String[] args) {
        System.out.println(isPalindrome(word1));
        System.out.println(isPalindrome(word2));
        //Also, in 1 line
        System.out.println(new StringBuilder(word1).reverse().toString().equalsIgnoreCase(word1));
    }

    public static boolean isPalindrome(String wordToCheck) {
        char[] charArray = wordToCheck.toCharArray();
        String wordReversed = "";
        for (int i = charArray.length-1; i >= 0; i--) {
            wordReversed += charArray[i];
        }
//        if (wordToCheck.equalsIgnoreCase(wordReversed))
//            return true;
//        else
//            return false;
        return wordToCheck.equalsIgnoreCase(wordReversed);
    }
}
