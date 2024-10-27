
public class reverse {
    public static void main(String[] args) {
        // rev(123);
        // revStore1(123);
        // System.out.println(sum);
        helper(123);
    }

    // Without storing the rev. value
    public static void rev(int n) {
        if (n % 10 == n) {
            System.err.println(n);
            return;
        }
        System.out.print(n % 10);
        rev(n / 10);
    }

    // Store the rev. value
    static int sum = 0;

    public static void revStore1(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + (n % 10);
        revStore1(n / 10);
    }

    // Some times you need some additional variables for that create another
    // function
    public static void helper(int n) {
        int noOfDigit = (int) (Math.log10(n) + 1);
        System.out.println(revStore2(123,noOfDigit));
    }

    // Store the rev. value
    public static int revStore2(int n, int noOfDigit) {
        if (n % 10 == n) {
            return n;
        }
        return (int) ((n % 10) * Math.pow(10, noOfDigit - 1) + revStore2(n / 10, noOfDigit - 1));
    }

}
