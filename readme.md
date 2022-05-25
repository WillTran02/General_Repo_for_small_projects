<h1>First Java Project</h1>
<h2>Created a basic program and refactored a method</h2>
<p>
The program we created prints out a simple message based on what is saved in the variable "timeOfDay"
</p>

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

<h2>Imported the junit Jupiter API</h2>
<p>
The junit.jupiter.api was imported to supply necessary assertions
</p>

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

<h2>Created a test class file to test functionality of the program</h2>
<p>
The test class was created in a separate directory to the original program and tested possible outcomes of the method "greeting"
</p>

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

<h2>Created a BubbleSort App</h2>
<p>
Aside from "main", there are two methods in the BubbleSort App: "bubbleSort" and "printArray".
Most of the sorting functionality happens within the bubbleSort, which is designed to be passed an int array
and sort the array, without returning it. printArray simply prints the elements of an array that it is passed.
</p>

bubbleSort works by:
- looping over the elements in the array, starting at index 1 (the 2nd value)
- comparing each element in the array to the one before it
- if the one before is greater than the current element, swap the elements around
- change the "swapped" boolean flag to true, indicating that another pass over the array is necessary
- move on to the next value, comparing to the value before it in the array
- repeat until reaching the end of the array
- if "swapped" is true, repeat the loop over the array again
- if "swapped" is false, there is no more need to loop over the array


    public static void bubbleSort(int[] numbers) {
    swapped = false;
    //    System.out.println("bubbleSort Initialized");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] > numbers[i]) {
    //        System.out.println("Swapping " + newNumbers[i-1] + " with " + newNumbers[i]);
            swapped = true;
            int temp = numbers[i-1];
            numbers[i-1] = numbers[i];
            numbers[i] = temp;
            }
        }
    }