class Student{
    int age;
    String name;
    public void showData(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.showData();
        obj.age = 18;   // Setting the data's value
        obj.name = "Debasis";   // Setting the data's value
        obj.showData();

        // Now here we can see that we are able to set/access the data from the outside world which is a big security issue.
        // Encapsulation means Data Hiding + Data Abstraction
        // Let's see the Data HIding in the Data Hiding file.

    }
}
