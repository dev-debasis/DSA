
public class StaticBlocks {
    static int age;

    static{
        System.out.println("Static blocks");
        age = 18;
    }

    static void display(){
        System.out.println("Static Display method");
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        display();
    }
}
