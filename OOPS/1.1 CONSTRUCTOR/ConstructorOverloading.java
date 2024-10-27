package CONSTRUCTOR;

class Student {
    private int age;
    private String name;

    public Student() {
        System.out.println("Zero parameterized by programmer");
        age = 18;
        name = "Debasis";
    }

    public Student(int age) {
        System.out.println("Single(int) Parameterized by programmer");
        this.age = age;
    }

    public Student(String name) {
        System.out.println("Single(String) Parameterized by programmer");
        this.name = name;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.display();
        Student obj2 = new Student(28);
        obj2.display();
        Student obj3 = new Student("Debasis");
        obj3.display();
    }
}
