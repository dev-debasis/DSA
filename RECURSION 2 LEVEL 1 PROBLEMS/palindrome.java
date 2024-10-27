public class palindrome {

    public static void main(String[] args) {
        System.out.println(palin(1));
    }

    public static int helper(int n) {
        int noOfDigit = (int) (Math.log10(n) + 1);
        return reverse(n, noOfDigit);
    }

    public static int reverse(int n, int noOfDigit) {
        if (n % 10 == n) {
            return n;
        }
        return (int) ((n % 10) * Math.pow(10, noOfDigit - 1) + reverse(n / 10, noOfDigit - 1));
    }

    public static boolean palin(int n) {
        return n == helper(n);
    }

}