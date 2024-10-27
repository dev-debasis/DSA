public class sumOf_n_to_one {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    public static int sum(int n) {
        if(n == 1){
            return 1;
        }

        return n + sum(n-1);
    }

}
    