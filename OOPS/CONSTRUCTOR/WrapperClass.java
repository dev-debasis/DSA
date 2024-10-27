public class WrapperClass {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // swap(a, b);
        // System.out.println(a + " " + b);
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // System.out.println(a == b); // false, Integer objects are different objects in memory

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
