class Student {

    int roll;
    String name;
    float marks;

    void greetings() {
        System.out.println("Hello, I am " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student() {
        this.roll = 1;
        this.name = "Default";
        this.marks = 1.1f;
    }

    // Student debu = new Student(roll, name, marks);
    // Here, this will be replaced by debu
    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
}

public class This {
    public static void main(String[] args) {
        Student debu = new Student(29, "Debasis", 80f);
        Student sougata = new Student(28, "Sougata", 90f);
        System.out.println(debu.roll);
        System.out.println(sougata.roll);
        System.out.println(debu.name);
        System.out.println(sougata.name);
        System.out.println(debu.marks);
        System.out.println(sougata.marks);
        debu.changeName("Debasis (Changed)");
        sougata.changeName("Sougata (Changed)");
        System.out.println(debu.name);
        System.out.println(sougata.name);
        debu.greetings();
        sougata.greetings();

        // we can also make constructor of another constructor

        Student random = new Student(debu);
        System.out.println(random.name);

    }
}