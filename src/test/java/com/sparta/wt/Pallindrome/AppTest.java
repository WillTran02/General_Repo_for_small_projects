package com.sparta.wt.Pallindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
