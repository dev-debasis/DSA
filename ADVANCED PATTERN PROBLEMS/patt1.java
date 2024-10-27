// package DSA PROBLEMS.ADVANCED PATTERN PROBLEMS;

public class patt1 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // int space = 2*(n-i);
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // int space = 2*(n-i);
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
