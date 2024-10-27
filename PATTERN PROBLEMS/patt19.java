public class patt19 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int number=i;
            // SPACES
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            //NUMBERS
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
