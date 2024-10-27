class Student{
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("Control in static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Control in non static block");
        m = 30;
        n = 40;
    }

    static void display(){
        System.out.println("Static variable a: " + a);
        System.out.println("Static variable b: " + b);
    }

    void displayDetails(){
        System.out.println("Non-static variable m: " + m);
        System.out.println("Non-static variable n: " + n);
    }



}

public class StaticVsNonStatic {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.displayDetails();
        s2.displayDetails();
        
        Student.display();
    }
}

// In the console we can see that the "Control in the static block" printed twice but "control in the non static block" printed only once why? As static block executes during the class loading and we know only once class loading happens that's why it's printed once but in the case of non static block it printed twice because there are two instance/object int the program, as non static blocks executes during the object creation that's why when we are creating the object it's get executed. So, Static block will execute only once for always but non static blocks will execute such many times how much object are there in the program. If you are creating 5 objects then non static blocks will execute 5 times.