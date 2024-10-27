class Student{
    static void disp1(){
        System.out.println("Static method disp1");
    }
    void disp2(){
        System.out.println("Non-Static method disp1");
    }
}
public class StaticMethodNonStaticMethod {
    public static void main(String[] args) {
        Student.disp1();
        Student obj = new Student();
        //Student.disp2()
        obj.disp2();
        obj.disp1();
    }
}
