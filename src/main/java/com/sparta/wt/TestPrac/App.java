package com.sparta.wt.TestPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sparta.wt.BubbleSort.App.bubbleSort;

public class App {

    public static void main(String[] args) {
        int[] arrayOfInts = {1, 5, 3, 86, 17, 42};
        String sentence = "This sentence contains vowels.";

        System.out.println(concatAllDigits(arrayOfInts));
        System.out.println(removeAllVowelsAndPrintUppercase(sentence));
        System.out.println(findSecondBiggestNumber(arrayOfInts));
        System.out.println(Arrays.toString(findDuplicateLettersInString(sentence)));
        System.out.println(Arrays.toString(countConsonantsAndVowels(sentence)));
        System.out.println(checkIfStringContains(sentence, 'z'));
        System.out.println(sumAllNumbersDivisibleByTwoAndThree(arrayOfInts));
        System.out.println(countLettersInString(sentence));
    }

    public static int concatAllDigits(int[] numbers) {
        //- Given an array of integers, convert them to a
        // single int made up of the digits
        StringBuilder allDigits = new StringBuilder();
        for (int num : numbers) {
            allDigits.append(num);
        }
        return Integer.parseInt(allDigits.toString());
    }

    public static String removeAllVowelsAndPrintUppercase(String str) {
        //- Take a string and return it with all the vowels removed
        // in uppercase
        str = str.toUpperCase();
        String[] toRemove = {"A", "E", "I", "O", "U"};
        for (String vowel : toRemove) {
            str = str.replace(vowel, "");
        }
        return str;
    }

    public static int findSecondBiggestNumber(int[] array) {
        //- For an array of ints, return the second-highest number
        int[] arrayClone = array.clone();
        bubbleSort(arrayClone);
        return arrayClone[arrayClone.length-2];
    }

    public static String[] findDuplicateLettersInString(String sentence) {
        //- For a String, create an array of all the duplicate letters
        List<String> duplicates = new ArrayList<>();
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.charAt(i) == ' ' || sentence.charAt(i) == ',') continue;
            if (sentence.charAt(i) == '.' || sentence.charAt(i) == '!') continue;
            if (sentence.charAt(i) == '?' || sentence.charAt(i) == '\'') continue;
            if (sentence.charAt(i) == '\"' || sentence.charAt(i) == '\n') continue;
            if (sentence.substring(i+1).contains("" + sentence.charAt(i))) {
                duplicates.add("" + sentence.charAt(i));
                sentence = sentence.replace("" + sentence.charAt(i), "");
            }
        }

        String[] duplicatesAsArray = new String[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            if (duplicatesAsArray[i] == duplicates.get(i)) continue;
            duplicatesAsArray[i] = duplicates.get(i);
        }
        return duplicatesAsArray;
    }

    public static int[] countConsonantsAndVowels(String sentence) {
        //- Create a 2 value array which counts all the
        // consonants and vowels in a string
        int[] consAndVowels = new int[2];
        String[] vowels = {"A", "E", "I", "O", "U"};
        String[] consonants = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        sentence = sentence.toUpperCase();
        for (int i = 0; i < sentence.length(); i++) {
            for (String letter : vowels) {
                if (("" + sentence.charAt(i)).equals(letter)) {
                    consAndVowels[1]++;
                }
            }
            for (String letter : consonants) {
                if (("" + sentence.charAt(i)).equals(letter)) {
                    consAndVowels[0]++;
                }
            }
        }


        return consAndVowels;
    }

    public static boolean checkIfStringContains(String sentence, char letter) {
        //- Write a method that takes a string and a letter and checks
        // if the string is in that letter
        return sentence.contains(""+letter);
    }

    public static int sumAllNumbersDivisibleByTwoAndThree(int[] numberArray) {
        //- Give a sequence of numbers return the sum of all the numbers
        // divisible by 2 & 3
        int total = 0;
        for (int number : numberArray) {
            if (number%2==0 || number%3==0) {
                total += number;
            }
        }
        return total;
    }

    public static int countLettersInString(String sentence) {
        //- Given a sentence I would like a count of the all the letters
        // in the sentence
        int total = 0;
        String[] sentences = sentence.split(" ");
        for (String word : sentences) {
            total += word.length();
        }
        return total;
    }

}
