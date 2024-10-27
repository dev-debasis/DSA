
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("In Static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        System.out.println("a = " + a + " b = " + b);
        StaticBlock.b += 3;
        System.out.println("a = " + a + " b = " + b);
        
    }
}