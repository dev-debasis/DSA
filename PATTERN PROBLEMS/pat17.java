public class pat17 {
    public static void main(String[] args) {
        int n = 4,number=1;
        for (int i = 1; i <= n; i++) {
            //SPACES
            for (int j = 1; j <= (i-1); j++) {
                System.out.print(" ");
            }
            //NUMBERS
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(number);
            }
            number++;
            System.out.println();
        }
    }
}
