public class pat13 {
    public static void main(String[] args) {
        int n = 4;
        char letter = 'D';
        for(int i = 1; i<=n; i++){
            char var = (char)(letter-i+1);
            for(int j = 1; j <= i ; j++){
                System.out.print(var+" ");
                var++;
            }
            System.out.println();
        }
    }
}
