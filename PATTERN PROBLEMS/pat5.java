// package DSA PROBLEMS.PATTERN PROBLEMS;

public class pat5 {
    public static void main(String[] args) {
        int n=4,number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
