// There are 3 types of Inheritance in Java -

// 1) Single level Inheritance
// 2) Multilevel Inheritance
// 3) Hierarchical Inheritance
// 4) Multiple Inheritance ---> Not allowed in Java

// Every class that doesn't extend explicitly to any class is extend to the Object class by default in Java.


// Single-level Inheritance

class Parent1{  // extends Object class
    void display(){
        System.out.println("Display method from Parent1 Class");
    }
}

class Child1 extends Parent1{

}

// Multi-level Inheritance

class Parent2{ // extends Object class | Parent class of Child2 Class
    void display(){
        System.out.println("Display method from Parent2 Class");
    }
}

class Child2 extends Parent2{ // Child Class of Parent2 Class and Parent Class of Child3 Class
    
}

class Child3 extends Child2{ // child Class of Child2 Class

}


// Hierarchical Inheritance

class Parent{
    void display(){
        System.out.println("Display method from Parent Class");
    }
}

class Child4 extends Parent{ // Child Class of parent Class

}

class Child5 extends Parent{ // Child Class of parent Class

}

// Child4 and Child5 both class extends to the same Parent class it's known as Hierarchical Inheritance.

public class TypesOfInheritance {
    public static void main(String[] args) {

        // Single-level Inheritance

        Child1 obj = new Child1();
        obj.display(); // As Child1 class extends to Parent1 class that's why we can invoke this method
        obj.toString(); // In Child1 class there are no toString method even the parent of it doesn't have toString method then how we can invoke this method without any error? Because as we know that if any class doesn't extend explicitly then by default it extends to object class and from there parent1 class getting the access of toString method and as of now Parent1 class this toString method and Child1 class extends to Parent1 class we can invoke it without any error.

        // Multi-level Inheritance

        Child3 obj1 = new Child3();
        obj1.display();

        // Hierarchical Inheritance
        Child4 obj2 = new Child4();
        obj2.display();
        Child5 obj3 = new Child5();
        obj3.display();
    }
}

