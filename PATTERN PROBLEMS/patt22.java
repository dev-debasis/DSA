public class patt22 {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            int temp = 4, cnt = 7;
            for (int j = 0; j < cnt; j++) {
                System.out.print(temp+" ");
                temp--;
                cnt-=2;
            }
            System.out.println();
        }
    }
}