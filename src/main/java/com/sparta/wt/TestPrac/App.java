package com.sparta.wt.TestPrac;

//- Write a method that takes a string and a letter and checks
// if the string is in that letter
//- Give a sequence of numbers return the sum of all the numbers
// divisible by 2 & 3
//- Given a sentence I would like a count of the all the letters
// in the sentence

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sparta.wt.BubbleSort.App.bubbleSort;

public class App {

    public static void main(String[] args) {
        int[] arrayOfInts = {1, 5, 3, 86, 17, 40};
        System.out.println(concatAllDigits(arrayOfInts));
        String sentence = "This sentence contains vowels.";
        System.out.println(removeAllVowelsAndPrintUppercase(sentence));
        System.out.println(findSecondBiggestNumber(arrayOfInts));
        System.out.println(Arrays.toString(findDuplicateLettersInString(sentence)));
        System.out.println(Arrays.toString(methodFive(sentence)));
    }

    public static int concatAllDigits(int[] numbers) {
        //- Given an array of integers, convert them to a
        // single int made up of the digits
        String allDigits = "";
        for (int num : numbers) {
            allDigits += num;
        }
        int allDigitsAsInt = Integer.parseInt(allDigits);
        return allDigitsAsInt;
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
        List<String> duplicates = new ArrayList<String>();
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

    public static int[] methodFive(String sentence) {
        //- Create a 2 value array which counts all the
        // consonants and vowels in a string
        int[] consAndVowels = new int[2];
        String[] vowels = {"A", "E", "I", "O", "U"};


        return consAndVowels;
    }
}
