package INHERITANCE;

public class Inheritance {
    public static void main(String[] args) {
        //  Parent obj = new Child(); // This statement will not gonna be through any error because it is an example of polymorphism in Java. In this case, obj is a reference of type Parent, but it points to an instance of Child. This is valid because Child is a subclass of Parent, and a subclass instance can always be referenced by a superclass reference without any explicit casting.  If you call a method using obj, it will call the overridden method in Child if it exists; otherwise, it will call the method from Parent.
      
        //  Child obj1 = new Parent(); // This line will throw a compile-time error because you are trying to assign a Parent instance to a Child reference. Java does not allow this implicitly because a Parent object does not inherently have all the properties or methods that a Child object might have, hence it cannot be treated as a Child.
        
    }
}

class Parent{

    int a,b,c;

    public Parent(){
        System.out.println("Default/zero parameterized Constructor of Parent class");
    }
    public Parent(int a, int b, int c){
        System.out.println("Parent class constructor is called");
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("All the instance var of Parent class constructor is initialized");
    }

    public Parent(Parent old){
        System.out.println("Parent class constructor of Class type is called"); 
        this.a = old.a;
        this.b = old.b;
        this.c = old.c;        
    }

}

class Child extends Parent{
    int d;
    public Child(){
        System.out.println("zero parameterized Child class constructor is called");
        
    }
    public Child(int a, int b, int c, int d){
        super(a,b,c); // If we don't invoke any super class' constructor then it will invoke the default/zero parameterized constructor of the parent class.
        //In this case if we don't write super(a,b,c) then it will invoke the super();
        this.d = d;
    }

    public Child(Child other){
        super(other);
        d = other.d;
    }
}