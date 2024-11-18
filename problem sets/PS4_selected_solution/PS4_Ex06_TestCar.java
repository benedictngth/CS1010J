/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * This program uses Car class. It reads in a car's information,
 * and creates a Car object. It then reads a list of trips, updates
 * the odometer reading, and computes the average distance travelled per trip.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class TestCar {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter model: ");
    String model = scanner.nextLine();
    
    System.out.print("Enter colour: ");
    String colour = scanner.nextLine();
    
    System.out.print("Enter odometer value: ");
    double odometer = scanner.nextDouble();
    
    Car car = new Car(model, colour, odometer);
    
    System.out.print("Enter the number of trips: ");
    int numTrips = scanner.nextInt();
    
    double distance, totalDistance = 0;
    for (int i = 1; i <= numTrips; i++) {
      System.out.print("Distance for trip " + i + ": ");
      distance = scanner.nextDouble();
      totalDistance += distance;
    }
    
    car.updateOdometer(totalDistance);
    
    System.out.println("Model: " + car.getModel());
    System.out.println("Colour: " + car.getColour());
    System.out.println("Odometer: " + car.getOdometer());
    
    System.out.println("Trips: " + numTrips);
    System.out.println("Distance per trip: " + totalDistance/numTrips);
  }
}