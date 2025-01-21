/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #33: PS4_Ex33_TurnKnob.java
 * 
 * A four-way knob has 4 positions: "up", "right", "down" and "left".
 * It has an attached device which has two states: "on" or "off".
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class TurnKnob {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the current position and device state: ");
    String position = scanner.next();
    String state = scanner.next();
    
    Knob knob = new Knob(position, state);
    
    System.out.print("How many stops to turn the knob? ");
    int stops = scanner.nextInt();
    
    knob.turnKnob(stops);
    
    System.out.println("Final position: " + knob.getPos() + "; device state: " + knob.getDevStat());
  }
}