package ProblemThree;

// TestTime.java
/*
 * In this TestTime class, I'm testing the functionalities of the Time class.
 * I create two Time objects, set their times using setter methods,
 * advance and rewind their times by one second, and display the results.
 */

 public class TestTime {
    public static void main(String[] args) {
        // Creating Time objects with initial times
        Time t1 = new Time(0, 0, 0); // Initial time will be set later
        Time t2 = new Time(0, 0, 0); // Initial time will be set later

        // Setting the time for t1 to 21:10:15 using setTime()
        t1.setTime(21, 10, 15);

        // Setting the time for t2 to 10:20:25 using setter methods
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Advancing t1 by one second
        t1.nextSecond(); // t1 should now be 21:10:16

        // Moving t2 back by one second
        t2.previousSecond(); // t2 should now be 10:20:24

        // Displaying the final times
        System.out.println("Time t1: " + t1.toString()); // Should display 21:10:16
        System.out.println("Time t2: " + t2.toString()); // Should display 10:20:24
    }
}
