package com.sparta.wt.Pallindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    @DisplayName("Check: false for Helicopter")
    void trueTest() {
        Assertions.assertEquals(false, App.isPalindrome("Elevation"));
    }

    @Test
    @DisplayName("Check: true for Racecar")
    void falseTest() {
        Assertions.assertEquals(true, App.isPalindrome("Racecar"));
    }

    @Test
    @DisplayName("Check: splitting a sentence")
    void findPalindromeTest() {
        String[] array = new String[4];
        array = App.splitSentenceIntoStringArray("This is a sentence");
        Assertions.assertEquals(true, array[0].equals("This"));
        Assertions.assertEquals(true, array[1].equals("is"));
        Assertions.assertEquals(true, array[2].equals("a"));
        Assertions.assertEquals(true, array[3].equals("sentence"));
    }

    @Test
    @DisplayName("Check: pull palindromes from sentence")
    void pullPalindromeTest() {
        List<String> ls = new ArrayList<>();
        App.pullPalindromesFromSentenceIntoList("This has one palindrome: pallap", ls);
        Assertions.assertEquals(true, ls.get(0).equals("pallap"));
    }

    @Test
    @DisplayName("Check: correct longest String from list")
    void longestStringInListTest() {
        List<String> ls = new ArrayList<>();
        ls.add("Racecar");
        ls.add("Peanuts");
        ls.add("ABBA");
        App.getLongestWordFromList(ls);
        Assertions.assertEquals(true, App.getLongestWordFromList(ls) == 7);
    }

    @Test
    @DisplayName("Check: print correct longest String")
    void createListOfLongestStringsTest() {
        List<String> ls = new ArrayList<String>();
        ls.add("a");
        ls.add("longest");
        ls.add("other");
        ls.add("longest");
        ls.add("a");
        Assertions.assertEquals(true, App.createListOfLongestStringsOnly(7, ls).size() == 2);
    }

}
