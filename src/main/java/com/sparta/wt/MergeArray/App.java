package com.sparta.wt.MergeArray;

public class App {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        //if both are null, return an empty array
        if (array1 == null && array2 == null) return new int[]{};
        //if one is null or empty and the other is not, return the other
        if (array1 == null || array1.length == 0) return array2;
        if (array2 == null || array2.length == 0) return array1;

        int indexPointer1 = 0;
        int indexPointer2 = 0;
        //create an int[] of total length of the two arrays, ready to return
        int[] merged = new int[(array1.length + array2.length)];

        for (int i = 0; i < merged.length; i++) {
            //check if both arrays have been completed, if so then stop to avoid ArrayIndexOutOfBoundsExceptions
            if (indexPointer1 == array1.length && indexPointer2 == array2.length) break;
            if (indexPointer1 == array1.length) { //check if array1 has finished, if so then use array2 value
                merged[i] = array2[indexPointer2++];
            } else if (indexPointer2 == array2.length) { //check if array2 has finished, if so then use array1 value
                merged[i] = array1[indexPointer1++];
            } else //if neither array has finished, add the lower of the two values
            merged[i] = array1[indexPointer1] < array2[indexPointer2] ? array1[indexPointer1++] : array2[indexPointer2++];
        }
        return merged;
    }
}
