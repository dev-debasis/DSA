class Student{
    private int age; // Instance Variables --> Declared outside the method but inside the class. Get Default value
    private String name;
    void showData(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    
}

public class SetterGetter {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.showData();
        obj.setAge(28);
        obj.setName("Debasis");
        obj.showData();
        // Fetching the data
        System.out.println("Age: "+obj.getAge());
        System.out.println("Name: "+obj.getName());
    }
}
