public class patt21 {
    public static void main(String[] args) {
        int n  = 5;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            //NUM1
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(num);
                num++;
            }
            //STAR
            for (int j = 1; j <= 2*(i-1); j++) {
                System.out.print("*");
            }
            //NUM2
            num = n-i+1;
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
