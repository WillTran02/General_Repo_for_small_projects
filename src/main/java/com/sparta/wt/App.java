package com.sparta.wt;

public class App {
    public static void main( String[] args ) {
        int timeOfDay = 12;
        String welcomeMessage;
//        try {
//            welcomeMessage = greeting(timeOfDay);
//        } catch (RuntimeException e) {
//            System.out.println(e);
//            welcomeMessage = "Invalid time of day";
//        }
        welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message;
        if (timeOfDay < 0 || timeOfDay > 23) {
            return "Invalid time of day";
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
}
