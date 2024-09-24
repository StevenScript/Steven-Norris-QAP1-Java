package ProblemTwo;

// TestDate.java
/*
 * In this TestDate class, I'm testing the functionalities of the Date class.
 * I create a Date object, display it, modify its values using setter methods,
 * and then display the updated date to verify that the setters work correctly.
 */

 public class TestDate {
    public static void main(String[] args) {
        // Creating a Date object with initial values
        Date date = new Date(1, 1, 2000); // Initial date: 01/01/2000

        // Displaying the initial date using toString()
        System.out.println("Initial Date: " + date.toString());

        // Modifying the date using setter methods
        date.setDay(9);     // Changing day to 9
        date.setMonth(12);  // Changing month to December
        date.setYear(2021); // Changing year to 2021

        // Alternatively, we could use setDate() to set all at once
        // date.setDate(9, 12, 2021);

        // Displaying the updated date
        System.out.println("Updated Date: " + date.toString());
    }
}
