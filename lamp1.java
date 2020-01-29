class Lamp {
  boolean isOn;

  void turnOn() {
    isOn = true;
  }

  void turnOff() {
   isOn = false;
  }
}

class ClassObjectsExample {
public static void main(String[] args) {
   Lamp l1 = new Lamp(); // create l1 object of Lamp class
   Lamp l2 = new Lamp(); // create l2 object of Lamp class
  }
}
