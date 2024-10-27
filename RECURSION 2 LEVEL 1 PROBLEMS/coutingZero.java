public class coutingZero {
    public static void main(String[] args) {

        System.out.println(counting(204, 0));
    }

    // static int count = 0;

    static int counting(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return counting(n / 10, ++count);
        }
        return counting(n / 10, count);

    }
}