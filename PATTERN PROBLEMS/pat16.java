public class pat16 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //SPACES
            for (int j = 1; j <= (i-1) ; j++) {
                System.out.print(" ");
            }
            //STARS
            for (int j = 1; j <= (n-i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 