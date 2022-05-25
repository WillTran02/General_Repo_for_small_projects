package com.sparta.wt.Pallindrome;

import java.util.ArrayList;
import java.util.List;

public class App {
    static String sentence1 = "This is a long sentence that does not contain a palindrome.";
    static String sentence2 = "This sentence contains a single palindrome: Radar";
    static String sentence3 = "This sentence has multiple palindromes: ABBA Racecar level reer raCEcar bob";
    static List<String> palindromeList = new ArrayList<String>() {};
    public static void main(String[] args) {
//        System.out.println(isPalindrome(word1));
//        System.out.println(isPalindrome(word2));
//        System.out.println(new StringBuilder(word1).reverse().toString().equalsIgnoreCase(word1));
        pullPalindromesFromSentenceIntoList(sentence1, palindromeList);
        pullPalindromesFromSentenceIntoList(sentence2, palindromeList);
        pullPalindromesFromSentenceIntoList(sentence3, palindromeList);
        int longest = getLongestWordFromList(palindromeList);
        System.out.println(createListOfLongestStringsOnly(longest, palindromeList));
    }

    public static List<String> createListOfLongestStringsOnly(int longest, List<String> ls) {
        List<String> lsToReturn = new ArrayList<String>();
        for (String word : ls) {
            if (word.length() == longest) {
                lsToReturn.add(word);
//                System.out.println("Palindrome detected: " + word);
            }
        }
        return lsToReturn;
    }

    public static int getLongestWordFromList(List<String> ls) {
        int longest = 0;
        for (String word : ls) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        return longest;
    }

    public static void pullPalindromesFromSentenceIntoList(String sentence, List<String> ls) {
        for (String word : splitSentenceIntoStringArray(sentence)) {
            if (isPalindrome(word)) {
                ls.add(word);
            }
        }
    }

    public static String[] splitSentenceIntoStringArray(String sentence) {
        String[] stringArray = sentence.split(" ");
        return stringArray;
    }

    public static boolean isPalindrome(String wordToCheck) {
//        char[] charArray = wordToCheck.toCharArray();
//        String wordReversed = "";
//        for (int i = charArray.length-1; i >= 0; i--) {
//            wordReversed += charArray[i];
//        }
//        return wordToCheck.equalsIgnoreCase(wordReversed);
        if (wordToCheck.length() < 6) return false;
        return new StringBuilder(wordToCheck).reverse().toString().equalsIgnoreCase(wordToCheck);
    }
}
