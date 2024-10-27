public class one_to_n {
    public static void main(String[] args) {
        int n = 3;
        // fun(n);
        fun1(n);
    }

    // public static void fun(int n) {
    // if (n == 0) {
    // return;
    // }

    // fun(n - 1);      
    // System.out.println(n);
    // }

    public static void fun1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun1(n - 1);
        System.out.println(n);
    }
}
