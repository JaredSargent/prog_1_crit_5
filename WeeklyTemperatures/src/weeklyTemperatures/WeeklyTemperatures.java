package weeklyTemperatures;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {

    public static void main(String[] args) {
        // Initialize ArrayLists to store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Array for days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Loop to gather input for each day of the week
        for (String day : weekDays) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            days.add(day);
            temperatures.add(temp);
        }

        // Display the menu for user input
        System.out.println("Type 'week' to display all temperatures and calculate the weekly average:");
        String userInput = scanner.next();

        // Check if the user wants the weekly report
        if (userInput.equalsIgnoreCase("week")) {
            double totalTemperature = 0;

            // Display each day and its corresponding temperature
            System.out.println("\nWeekly Temperatures:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°");
                totalTemperature += temperatures.get(i);
            }

            // Calculate and display the weekly average
            double averageTemperature = totalTemperature / days.size();
            System.out.println("\nWeekly Average Temperature: " + averageTemperature + "°");
        } else {
            System.out.println("Invalid input. Program terminated.");
        }

        scanner.close();
    }
}
