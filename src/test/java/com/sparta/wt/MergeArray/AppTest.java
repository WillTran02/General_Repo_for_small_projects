package com.sparta.wt.MergeArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    int[] blankArray = new int[0];
    int[] filledArray = {1, 2, 3};
    int[] filledArray2 = {4, 5, 6, 7, 8};
    int[] filledMergedArray = {1, 1, 2, 2, 3, 3};
    int[] filledMergedArray2 = {1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    @DisplayName("check: entering blank arrays returns a blank array")
    void checkReturnsSingleArray() {
        Assertions.assertArrayEquals(blankArray, App.mergeArrays(blankArray, blankArray));
    }

    @Test
    @DisplayName("check: entering one filled and one blank array returns filled array")
    void checkOneEmptyArray() {
        Assertions.assertArrayEquals(filledArray, App.mergeArrays(blankArray, filledArray));
        Assertions.assertArrayEquals(filledArray, App.mergeArrays(filledArray, blankArray));
    }

    @Test
    @DisplayName("check: entering two filled arrays returns one merged array")
    void checkReturnsMergedArray() {
        Assertions.assertArrayEquals(filledMergedArray, App.mergeArrays(filledArray, filledArray));
    }

    @Test
    @DisplayName("check: entering null returns an empty array")
    void checkReturnsBlankArrayWhenNull() {
        Assertions.assertArrayEquals(blankArray, App.mergeArrays(null, null));
    }

    @Test
    @DisplayName("check: entering one filled array and null returns the filled array")
    void checkReturnsOneArrayWhenNull() {
        Assertions.assertArrayEquals(filledArray, App.mergeArrays(filledArray, null));
        Assertions.assertArrayEquals(filledArray, App.mergeArrays(null, filledArray));
    }

    @Test
    @DisplayName("check: entering two filled arrays of different sizes returns one merged, sorted array")
    void checkReturnsMergedSortedArray() {
        Assertions.assertArrayEquals(filledMergedArray2, App.mergeArrays(filledArray, filledArray2));
    }

}
