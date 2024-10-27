// package DSA PROBLEMS.ADVANCED PATTERN PROBLEMS;

public class patt5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //SPACES
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //STARS
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //SPACES
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //STARS
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}