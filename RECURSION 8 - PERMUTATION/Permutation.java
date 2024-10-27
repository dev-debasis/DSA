import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> list = permutationReturn("", "abc");
        System.out.println(list);
        System.out.println(permutationCount("", "abc")); 
        System.out.println(permutationCountArg("", "abc", 0)); 
    }

    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    public static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }

    public static int permutationCountArg(String p, String up, int count) {
        if (up.isEmpty()) {
            count++;
            return count;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = permutationCountArg(first + ch + second, up.substring(1), count);
        }
        return count;
    }

    public static ArrayList<String> permutationReturn(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
           list.addAll(permutationReturn(first + ch + second, up.substring(1)));
        }
        return list;
    }
}
