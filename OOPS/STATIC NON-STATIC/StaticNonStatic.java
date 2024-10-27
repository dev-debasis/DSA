
class Student{
    static int age;
    static String name;

    int roll;
    String section;

    static{
        System.out.println("Control in static block");
        age = 18;
        name = "Debasis";
    }

    {
        System.out.println("Control in Non-static block");
        roll = 29;
        section = "A";
    }

    public static void disp1(){
        System.out.println("The value of static Int : " + age);
        System.out.println("The value of static String : " + name);
    }
    
    public void disp2(){
        System.out.println("The value of Non-static Int : " + roll);
        System.out.println("The value of Non-static String : " + section);
    }
}
public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Control in main method");
        Student.disp1();
        Student obj = new Student();
        obj.disp2();
    }
}
