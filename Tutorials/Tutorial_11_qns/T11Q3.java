class T11Q3 {
  
  public static void main(String[] args) {
    
    Cow cow = new Cow();
    Chicken chicken = new Chicken();
    Pig pig = new Pig();
    
    Farm farm = new Farm(cow, chicken, pig);
    farm.singChorus();
  }
}

class Cow {
  // Cow sings
  public void makeSound() {
    System.out.println("Moo Moo");
  }
}

class Chicken {
  // Chicken sings
  public void makeSound() {
    /* fill in your code below */
    System.out.println("Pook Pook");
  }
}

class Pig {
  // Pig sings
  public void makeSound() {
    /* fill in your code below */
    System.out.println("Oink Oink");
  }
}

class Farm {
  
  private Cow cow;
  private Chicken chick;
  private Pig pig;
  
  public Farm(Cow newCow, Chicken newChick, Pig newPig) {
    /* fill in your code below */
    cow = newCow;
    chick = newChick;
    pig = newPig;
  }
  
  public void singChorus() {
    /* fill in your code below */
    cow.makeSound();
    chick.makeSound();
    pig.makeSound();
  }
}