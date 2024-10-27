// package DSA PROBLEMS.PATTERN PROBLEMS;

public class pat9 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            char letter = 'A';
            for (int j = 1; j <= n; j++) {
                char letter1 = (char)(letter+i-1) ;
                System.out.print(letter1+ " ");
                letter++;
            }
            System.out.println();
        }
    }
}
