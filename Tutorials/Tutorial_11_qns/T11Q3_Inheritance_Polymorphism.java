class T11Q3 {
  
  public static void main(String[] args) {
    
    Animal cow = new Cow();
    Animal chicken = new Chicken();
    Animal pig = new Pig();
    
    Farm farm = new Farm(cow, chicken, pig);
    farm.singChorus();
  }
}

// Define Animal as an abstract class so that it cannot be instantiated.
// It makes more sense to create real animals (cow, chicken or pig) that
// are subclasses of Animal.
abstract class Animal {
  // Animal is able to make sound.
  // This method is to be implemented by
  // respective subclasses in appropriate ways.
  public abstract void makeSound();
}

class Cow extends Animal {  // subclass of Animal
  // Cow sings (overriding method)
  public void makeSound() {
    System.out.println("Moo Moo");
  }
}

class Chicken extends Animal {
  // Chicken sings (overriding method)
  public void makeSound() {
    System.out.println("Pook Pook");
  }
}

class Pig extends Animal {
  // Pig sings (overriding method)
  public void makeSound() {
    System.out.println("Oink Oink");
  }
}

class Farm {
  
  private Animal[] animals;
  
  public Farm(Animal animal1, Animal animal2, Animal animal3) {
    animals = new Animal[3];   // 3 animals in total
    animals[0] = animal1;      // animal 0 actually is a cow
    animals[1] = animal2;      // animal 1 actually is a chick
    animals[2] = animal3;      // animal 2 actually is a pig
  }
  
  public void singChorus() {
    for (int i = 0; i < animals.length; i++) {
      // depends on the real type of an animal (cow, chick or pig),
      // the corresponding makeSound() will be invoked.
      animals[i].makeSound();
    }
  }
}