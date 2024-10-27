// There are 3 types of methods in Inheritance
// 1. Inherited method  --> such methods that are inherited from the Parent class & don't make any changes in the child class. Methods that are sane in parent class and child class.
// 2. Overridden method --> such methods where we add some changes or modify it in the child class are known as overriding methods in the child class and known as overridden method in the parent class.
// 3. Specialized method --> such methods that were not present in the parent class but present in child class are known as specialized methods.

class AirPlane {
    void takeOff() {
        System.out.println("Airplane takes off");
    }

    void fly() { // This method is modified in the child class so it's known as overridden method
        System.out.println("Airplane flies");
    }
}

class CargoPlane extends AirPlane {
    void fly() { // Here fly() method is modified so it's known as overriding method
        System.out.println("Cargo Plane flies in lower height");
    }

    void carry() { // There was no carry method in the Parent class so, it's known as specialized
                   // method
        System.out.println("Cargo Plane Carries Goods");
    }

    // In this class we have takeOff() method as we extends it from the Airplane
    // class but we don't make any changes to it so it's known as Inherited method

}

class PassengerPlane extends AirPlane {
    void fly() { // Here fly() method is modified so it's known as overriding method
        System.out.println("Passenger Plane flies in more height");
    }

    void carry() { // There was no carry method in the Parent class so, it's known as specialized
                   // method
        System.out.println("passenger Plane Carries Passenger");
    }

    // In this class we have takeOff() method as we extends it from the Airplane
    // class but we don't make any changes to it so it's known as Inherited method

}

public class TypesOfMethodInInheritance {
    public static void main(String[] args) {

    }
}
