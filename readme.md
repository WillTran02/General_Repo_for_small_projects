# First Java Project
- Created a basic program and refactored a method

The program we created prints out a simple message based on what is saved in the variable "timeOfDay"

    public static void main(String[] args) {
    int timeOfDay = 13;
    String welcomeMessage = greeting(timeOfDay);
    System.out.println(welcomeMessage);
    }
    
    public static void greeting(int timeOfDay) {
        String message;
        if (timeOfDay < 0 || timeOfDay > 23) {
            message = "Invalid time of day";
            return message;
        }
        if (timeOfDay >= 5 && timeOfDay < 12) {
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon!";
        } else {
            message = "Good Evening!";
        }
        return message;
    }

- Imported the junit Jupiter API

The junit.jupiter.api was imported to supply necessary assertions

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

- Created a test class file to test functionality of the program

The test class was created in a separate directory to the original program and tested possible outcomes of the method "greeting"

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

