/**
 * QUESTION Drivers are concerned with the mileage their automobiles get. One driver has kept track
 * of several trips by recording the miles driven and gallons of fuel used. Develop a java
 * application that shall input the miles driven and gallons used (both as integers) for each trip.
 * The program should calculate and display the miles per gallon obtained for all trips, stating how
 * many trips, how many gallons and the mileage. Use the scanner object to obtain the data from the
 * user.
 */
package org.mileage;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int trips;
    int miles;
    int gallons;
    int totalMiles = 0, totalGallons = 0;

    // Use Scanner to get user's(driver's) input
    Scanner input = new Scanner(System.in);
    // Get drivers total trips
    System.out.print("Enter your total number of trips ");
    trips = input.nextInt();

    for (int count = 1; count <= trips; count++) {
      // Get miles driven
      System.out.printf("Enter miles driven for trip %d ", count);
      miles = input.nextInt();
      // Get total miles
      totalMiles += miles;
      // Get gallons of fuel used
      System.out.printf("Enter gallons of fuel used for trip %d ", count);
      gallons = input.nextInt();
      // Get total gallons
      totalGallons += gallons;
      System.out.println(count + "\t\t\t\t" + totalMiles + "\t\t\t\t");

    }
    System.out.println("Trip \t\t\t\tMiles Driven \t\t\t\tGallons of Fuel Used");
    System.out.print("_____________________________________________________");

  }
}