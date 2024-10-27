class Human {
    // instance variable
    String name = "Debasis";
    private int age;

    public Human() {
        System.out.println("Control in Constructor of Human class");
    }

    void sleep() {
        age = 18;
        System.out.println("Human needs to sleep for at least 7 hours");
    }

}

class Student extends Human {
    void display() {
        //System.out.println("Age: " + age); // Here we are getting the error.(The field Human.age is nor visible) this error is occuring as we set tha age variable to private. private members & Constructor doesn't participate in Inheritance.
        System.out.println("Name: " + name);
    }
}

public class MoreOnInheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
        st.display();
    }
}

// Well the output we are getting is given below--> 
//Control in Constructor of Human class
//Human needs to sleep for at least 7 hours
//Name: Debasis
// Now, If the question is if the constructor doesn't participate in Inheritance then why the constructor is getting executed and we get the msg print of constructor. Yeah, that's true that the constructor doesn't participate in Inheritance but when we create the object of Student class we invoke the zero parameterized default Student constructor and we know that super() is placed in the 1st line if the constructor and the super() calls the constructor of it's parent class that's why the constructor of Human class is getting executed and we get the msg print of constructor.



// 1. Private members doesn't participate in Inheritance
// 2. Constructors doesn't participate in Inheritance