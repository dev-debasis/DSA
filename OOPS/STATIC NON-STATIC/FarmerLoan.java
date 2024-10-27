// In this programme we will try to know when or which variable is should be used as static and when or which variable we can use as non static.

// If any variable varies upon object to object then we have to use non-static(instance) variables, what does it mean? Let say Farmer are taking loan noe the principle amount will be chosen by the loan taker/farmer not by the loan provider. So, different farmer needs different principle amount, it means it varies object to object. The object of F1 farmer and the object of F2 Farmer will be different as they required different principle amount so we can't use static for principle amount. As well as we can't use static for the 'time duration' & 'simple interest' but if we talk about the 'rate of interest' then it will be fixed for every farmer it will not vary farmer to farmer or object to object. So, In this case we can use the static variable. 

// What are the benefits of making variable static? by making variable static we can manage the memory efficiently and our program will be optimized. Because if the variable is static, not vary object to object then why we will create the variable again and again for different objects instead we can do it static so that it will load once during the class loading and we can use it for every different object.

import java.util.Scanner;
class Loan{
    int pa;
    float td;
    static float roi; 
    float si;

    static{
        roi = 5.0f;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        pa = sc.nextInt();
        System.out.println("Enter the time duration: ");
        td = sc.nextFloat();
    }

    void calculateSI(){
        si = (pa * td * roi) / 100f;
    }

    void display(){
        System.out.println("Simple Interest: "+si);
    }
}

public class FarmerLoan {
    public static void main(String[] args) {
        Loan f1 = new Loan();
        Loan f2 = new Loan();
        f1.input();
        f1.calculateSI();
        f1.display();
        f2.input();
        f2.calculateSI();
        f2.display();
        
    }
}
