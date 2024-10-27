package CONSTRUCTOR;

class Student {
    int age;
    String name;

    Student(int age) {
        this.age = age;
    }

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("age: " + age);
        System.out.println("name: " + name);
    }
}

public class Basic {
    public static void main(String[] args) {
        
        Student obj = new Student(18); // Zero parameterized constructor is called, a default constructor will be added by the compiler.
        obj.display();
        Student obj1 = new Student("Debasis"); // If the constructor is not zero parameterized then the compiler
                                               // will not add any constructor.
        // So, we have to add a constructor manually now when we added one constructor
        // manually now the zero parametrized constructor will not be added by the
        // compiler anymore. so we have to add that also manually.
        obj1.display();

    }
}
