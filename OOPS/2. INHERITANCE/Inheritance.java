class Human{
    int age;

   
    void display(){
        age = 19;
        System.out.println("Display method of Human Class");
        System.out.println(age);
    }
}

class Student extends Human{

}

public class Inheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();   // we are accessing the display method by the reference of Student class' object but we can clearly see that there are no display method in the Student class then why it's not throughing ERROR because we use 'extend' keyword in the Student class Now, Student class extends to Human class now Student class has all the properties of Human class. Though we can't see display method in the Student class but it's present there as it inherites the Human class. Here Human class is known as "Super class", "Parent class", "Base Class" & Student Class is known as "Sub class", "Child class", "Derived class".
    }
}
