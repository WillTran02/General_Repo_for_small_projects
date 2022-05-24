package com.sparta.wt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }

    @Test
    @DisplayName("check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(6));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(13));
    }

    @Test
    @DisplayName("check that we can return Good Evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening!", App.greeting(0));
    }

    @Test
    @DisplayName("check for answer at 12")
    void checkAnswerFor12() {
        Assertions.assertEquals("Good Afternoon!", App.greeting(12));
    }

    @Test
    @DisplayName("check for invalid time")
    void checkForInvalidTime() {
        Assertions.assertEquals("Invalid time of day", App.greeting(-5));
        Assertions.assertEquals("Invalid time of day", App.greeting(1000));
    }
}
