/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * Define a Car class consisting of three attributes:
 * model, colour, and odometer reading.
 * 
 * Author: Zhou Lifeng
 */

class Car {
  
  // Attributes
  private String model;
  private String colour;
  private double odometer;
  
  // Constructor
  public Car(String mod, String col, double odo) {
    model = mod;
    colour = col;
    odometer = odo;
  }
  
  // Return the model of a Car object
  public String getModel() {
    return model;
  }
  
  // Return the colour of a Car object
  public String getColour() {
    return colour;
  }
  
  // Return the odometer value of a Car object
  public double getOdometer() {
    return odometer;
  }
  
  // Update the odometer with the distance travelled
  public void updateOdometer(double distance) {
    odometer += distance;
    odometer %= 1000;
  }
}