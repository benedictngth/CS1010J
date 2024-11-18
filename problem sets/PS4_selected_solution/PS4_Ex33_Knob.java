/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #33: PS4_Ex33_Knob.java
 * 
 * A four-way knob has 4 positions: "up", "right", "down" and "left".
 * It has an attached device which has two states: "on" or "off".
 * 
 * Author: Zhou Lifeng
 */

class Knob {
  
  private int pos;
  private int devStat;
  
  public Knob(String initialPosition, String initialState) {
    
    if ( initialPosition.equals("up") ) {
      pos = 0;
    } else if ( initialPosition.equals("right") ) {
      pos = 1;
    } else if ( initialPosition.equals("down") ) {
      pos = 2;
    } else {  // assume no error
      pos = 3;
    }
    
    if ( initialState.equals("on") ) {
      devStat = 1;
    } else {  // assume no error
      devStat = 0;
    }
  }
  
  // Turn a knob object 'stops' times
  public void turnKnob(int stops) {
    pos = (pos + stops) % 4;
    devStat = (devStat + stops) % 2;
  }
  
  // Return position of a knob object
  public String getPos() {
    String[] positions = {"up", "right", "down", "left"};
    return positions[pos];
  }
  
  // Return position of the attached device
  public String getDevStat() {
    String[] state = {"off", "on"};
    return state[devStat];
  }
}