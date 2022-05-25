<h1>First Java Project</h1>
<p>This ReadMe file contains a basic outline of all tasks within the project along with associated code snippets.</p>
<h2>Creating a basic program and refactoring a method</h2>
<p>
The program we created prints out a simple message based on what is saved in the variable "timeOfDay".
</p><p>
The method was originally written inside the main method, and refactored to sit outside, separate to the main method.
</p>

    public static void main(String[] args) {
    int timeOfDay = 13;
    String welcomeMessage = greeting(timeOfDay);
    System.out.println(welcomeMessage);
    }

<h2>Imported the junit Jupiter API</h2>
<p>
The junit.jupiter.api was imported to supply necessary assertions.
</p>

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

<h2>Creating a test class file to test functionality of the program</h2>
<p>
The test class was created in a separate directory (but the same package) to the original program and tested possible outcomes of the method "greeting".
</p>

    public class AppTest {
 
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
    }

<h2>Creating a BubbleSort App</h2>
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
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] > numbers[i]) {
            swapped = true;
            int temp = numbers[i-1];
            numbers[i-1] = numbers[i];
            numbers[i] = temp;
            }
        }
    }

<h2>Creating a Palindrome Checker</h2>
<p>
The purpose of this App was to be able to:
</p>

- take a sentence as a String
- break the sentence into an array of Strings
- check whether words are palindromes or not
- populate a new array of Strings with only the longest palindromes
- return the new array

<p>
Throughout the creation of the app, methods were created and then refactored outside the main method to make the code more readable, and to make debugging easier as well. 
</p>


    public class App {
        static String sentence1 = "This is a long sentence that does not contain a palindrome.";
        static String sentence2 = "This sentence contains a single palindrome: Radar";
        static String sentence3 = "This sentence has multiple palindromes: ABBA Racecar level reer raCEcar bob";
        static List<String> palindromeList = new ArrayList<String>() {};
        
        public static void main(String[] args) {
            pullPalindromesFromSentenceIntoList(sentence1, palindromeList);
            pullPalindromesFromSentenceIntoList(sentence2, palindromeList);
            pullPalindromesFromSentenceIntoList(sentence3, palindromeList);
            int longest = getLongestWordFromList(palindromeList);
            System.out.println(createListOfLongestStringsOnly(longest, palindromeList));
        }
    
    }

<p>
A testing application was also created alongside the palindrome app, and was used throughout the creation of the palindrome checker to ensure the app continued to pass all tests throughout development.
</p>

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

<h1>Fibonacci Sequence</h1>
<p>
For this project we learned about the Test Driven Development approach, and used it to construct a recursive method where we can recreate the Fibonacci Sequence to a specified index.<br>
Development began by writing the simplest level of tests that we expect the final program to be able to achieve:
</p>


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

<p>
The initial method created to pass these tests was also the simplest method to do so, to begin with:
</p>

    public static int fibSeqNumber(int position) {
        if (position <= 0) {
            return 0;
        } else if (position >= 1) {
            return 1;
        }
    }

<p>
From there, the testing and the method now had to include the recursion effect.<br>
In the testing we checked for the 10th number in the sequence:
</p>

    @Test
    @DisplayName("check entering 10 returns 55")
    void checkTenTest() {
        Assertions.assertEquals(55, App.fibSeqNumber(10));
    }

<p>Which was accomplished in the method through a recursive method:</p>

    public static Integer fibSeqNumber(int position) {
        int FibbonacciTotal = 0;

    ...


    return fibSeqNumber(position - 1) + fibSeqNumber(position - 2);

<p>
A later extension to the task added the following requirements:<br>
</p>

- be able to return 0 when null is entered into the method
- be able to return an int array of the sequence up to a specified value

<p>First the test conditions were created:</p>

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

<p>And then the method was edited to intake the Integer wrapper class instead of the primitive int, which allowed for null to be used as an input value:</p>

    public static Integer fibSeqNumber(Integer position) {
        Integer FibbonacciTotal = 0;

<p>And finally a new method was introduced that called the recursive method in order to populate an array and return it, while returning an empty array of size 0 if the position input is null or 0 (or negative):</p>

    public static int[] fibSeqAsArray(Integer position) {
        if (position == null || position <= 0) return new int[0];
        int[] array = new int[position + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = fibSeqNumber(i);
        }
        return array;
    }
