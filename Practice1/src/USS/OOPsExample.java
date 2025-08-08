package USS;

//Abstraction
abstract class Vehicle {
 protected String brand;

 // Constructor (Encapsulation)
 public Vehicle(String brand) {
     this.brand = brand;
 }

 // Abstract method
 public abstract void start();

 // Non-abstract method
 public void stop() {
     System.out.println(brand + " is stopping.");
 }
}

//Inheritance + Polymorphism (Method Overriding)
class Car extends Vehicle {
 public Car(String brand) {
     super(brand);
 }

 // Overriding abstract method (Run-time Polymorphism)
 public void start() {
     System.out.println(brand + " car is starting with key.");
 }
}

class Bike extends Vehicle {
 public Bike(String brand) {
     super(brand);
 }

 // Overriding abstract method (Run-time Polymorphism)
 public void start() {
     System.out.println(brand + " bike is starting with self-start.");
 }
}

//Encapsulation class
class Driver {
 private String name; // private fields
 private int experience;

 // Getters and setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getExperience() {
     return experience;
 }

 public void setExperience(int experience) {
     this.experience = experience;
 }
}

public class OOPsExample {
 public static void main(String[] args) {
     // Encapsulation in action
     Driver d = new Driver();
     d.setName("Priyanka");
     d.setExperience(5);
     System.out.println("Driver Name: " + d.getName());
     System.out.println("Experience: " + d.getExperience() + " years");

     // Inheritance, Abstraction, and Polymorphism
     Vehicle car = new Car("Toyota");
     Vehicle bike = new Bike("Yamaha");

     car.start();  // Run-time polymorphism
     car.stop();

     bike.start(); // Run-time polymorphism
     bike.stop();
 }
}