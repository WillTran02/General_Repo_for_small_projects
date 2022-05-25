package com.sparta.wt.FibSeq;

public class App {
    public static void main(String[] args) {
        int FSnum = 5;
        int[] array = fibSeqAsArray(FSnum);
//        System.out.println(Arrays.toString(array));
        printValuesInArray(array);
    }

    public static void printValuesInArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static Integer fibSeqNumber(Integer position) {
        Integer FibbonacciTotal = 0;

        //position == null
        if (position == null) {
            return 0;
        } else if (position <= 0) {
            FibbonacciTotal = 0;
            //Base case
        } else if (position <= 2) {
            FibbonacciTotal = 1;
        } else {
            //Recursive
            return fibSeqNumber(position - 1) + fibSeqNumber(position - 2);
        }
        return FibbonacciTotal;
    }

    public static int[] fibSeqAsArray(Integer position) {
        if (position == null || position <= 0) return new int[0];
        int[] array = new int[position + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = fibSeqNumber(i);
        }
        return array;
    }

}

//    number == 1 ? (If expression is true, do this) : (If expression is false, do this)
//    public static Integer FibSeqNumber(Integer position) {
//        return position == null ? 0 : (position <=0 ? 0 : (position <= 2 ? 1 : FibSeqNumber(position - 1) + FibSeqNumber( position - 2)));
//    }
//}
