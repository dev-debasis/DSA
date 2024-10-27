// package DSA BOOTCAMP.RECURSION;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        // Fibonacci obj = new Fibonacci();
        // int ans = obj.fibo(n);
        int ans = fiboFormula(n);
        System.out.println(ans);

        System.out.println("Time Complexity : ");
        timeComplexity(n);
    }

    public static int  fiboFormula(int n){
       return (int) ((Math.pow(((1+Math.sqrt(5)) / 2),n) - Math.pow(((1-Math.sqrt(5)) / 2),n)) / Math.sqrt(5));
    }

    public int fibo(int n) {    // fibo(n) = fibo(n-1) + fibo(n-2) ---> Linear Recurance Relation
        // Base Case
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static void timeComplexity(int n){
        System.out.println(Math.pow(( 1 + Math.sqrt(5) / 2 ), n));
    }
}
