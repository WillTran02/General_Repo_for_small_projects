package com.sparta.wt.FibSeq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// int[] FibSeq = {0, 1, 1, 2, 3, 5}

public class AppTest {
    @Test
    @DisplayName("check entering 0 returns 0")
    void checkZeroTest() {
        Assertions.assertEquals(0, App.fibSeqNumber(0));
    }

    @Test
    @DisplayName("check entering 1 returns 1")
    void checkOneTest() {
        Assertions.assertEquals(1, App.fibSeqNumber(1));
    }

    @Test
    @DisplayName("check entering 2 returns 1")
    void checkTwoTest() {
        Assertions.assertEquals(1, App.fibSeqNumber(2));
    }

    @Test
    @DisplayName("check entering 3 returns 2")
    void checkThreeTest() {
        Assertions.assertEquals(2, App.fibSeqNumber(3));
    }

    @Test
    @DisplayName("check entering 4 returns 3")
    void checkFourTest() {
        Assertions.assertEquals(3, App.fibSeqNumber(4));
    }

    @Test
    @DisplayName("check entering 10 returns 55")
    void checkTenTest() {
        Assertions.assertEquals(55, App.fibSeqNumber(10));
    }

    @Test
    @DisplayName("check entering -2 returns 0")
    void checkNegativeTest() {
        Assertions.assertEquals(0, App.fibSeqNumber(-2));
    }

    @Test
    @DisplayName("check entering null returns 0")
    void checkNullTest() {
        Assertions.assertEquals(0, App.fibSeqNumber(null));
    }

    @Test
    @DisplayName("check entering 5 returns {0, 1, 1, 2, 3, 5}")
    void checkReturnArray() {
        int[] fibSeqArray = {0, 1, 1, 2, 3, 5};
        Assertions.assertEquals(fibSeqArray[0], App.fibSeqAsArray(5)[0]);
        Assertions.assertEquals(fibSeqArray[1], App.fibSeqAsArray(5)[1]);
        Assertions.assertEquals(fibSeqArray[2], App.fibSeqAsArray(5)[2]);
        Assertions.assertEquals(fibSeqArray[3], App.fibSeqAsArray(5)[3]);
        Assertions.assertEquals(fibSeqArray[4], App.fibSeqAsArray(5)[4]);
        Assertions.assertEquals(fibSeqArray[5], App.fibSeqAsArray(5)[5]);
    }

}
