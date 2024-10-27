import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // combination("", "12");
        ArrayList<String> list = combinationReturnList("", "23");
        System.out.println(list);
        System.out.println(combinationCount("", "12"));
        System.out.println(combinationCountArg("", "12", 0));
    }

    public static void combination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combination(p + ch, up.substring(1));
        }
    }

    public static ArrayList<String> combinationReturnList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combinationReturnList(p + ch, up.substring(1)));
        }
        return list;
    }

    public static int combinationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += combinationCount(p + ch, up.substring(1));
        }
        return count;
    }

    public static int combinationCountArg(String p, String up, int count) {
        if (up.isEmpty()) {
            count++;
            return count;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = combinationCountArg(p + ch, up.substring(1), count);
        }
        return count;
    }
}
