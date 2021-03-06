package com.sparta.wt.BubbleSort;

public class App {
    static boolean swapped = false;
    public static void main(String[] args) {
        int[] numbers = {12, 92, 33, 51, 1, 4, 36, 35, 59, 20, 32};
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        do {
            swapped = false;
//        System.out.println("bubbleSort Initialized");
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i - 1] > numbers[i]) {
//                System.out.println("Swapping " + newNumbers[i-1] + " with " + newNumbers[i]);
                    swapped = true;
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        } while(swapped);
    }

    public static void printArray(int[] numbers) {
        System.out.print("Current array: ");
        for (int num : numbers)
            System.out.print(num + " ");
        System.out.println("\n");
    }
}
