/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * Define a Car class consisting of three attributes:
 * model, colour, and odometer reading.
 * 
 * <Type your name here>
 */

class Car {

  private String model, colour;
  private double odo;

  // Constructor
  public Car(String mod, String col, double odo) {
    this.model = mod;
    this.colour = col;
    this.odo = odo;
  }

  // Return the model of a Car object
  public String getModel() {
    return this.model;
  }

  // Return the colour of a Car object
  public String getColour() {
    return this.colour;
  }

  // Return the odometer value of a Car object
  public double getOdometer() {
    return this.odo;
  }

  // Update the odometer with the distance travelled
  public void updateOdometer(double distance) {
    this.odo += distance;
    this.odo %=1000;
    }

  }
}