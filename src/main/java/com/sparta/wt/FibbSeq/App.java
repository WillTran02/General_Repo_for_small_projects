package com.sparta.wt.FibbSeq;

public class App {
    public static Integer FibbSeqNumber(Integer position) {
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
            return FibbSeqNumber(position - 1) + FibbSeqNumber(position - 2);
        }
        return FibbonacciTotal;
    }
}

//    public static int[] FibbSeqAsArray(Integer position) {
//        int[] array = new int[position+1];
//        if (array.length == 0) return new int[0];
//        for (int number : array) {
//            number = FibbSeqNumber(position);
//        }
//        return array;
//    }

//    number == 1 ? (If expression is true, do this) : (If expression is false, do this)
//    public static Integer FibbSeqNumber(Integer position) {
//        return position == null ? 0 : (position <=0 ? 0 : (position <= 2 ? 1 : FibbSeqNumber(position - 1) + FibbSeqNumber( position - 2)));
//    }

//}
