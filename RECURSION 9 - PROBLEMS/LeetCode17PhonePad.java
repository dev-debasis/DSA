import java.util.ArrayList;

public class LeetCode17PhonePad {
    public static void main(String[] args) {
        System.out.println(combination("", "68"));
    }

    public static ArrayList<String> combination(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        if (digit < 7) {

            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combination(p + ch, up.substring(1)));
            }
        } else {
            switch (digit) {
                case 7:
                    for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                        char ch = (char) ('a' + i);
                        list.addAll(combination(p + ch, up.substring(1)));
                    }
                    break;
                case 8:
                    for (int i = 19; i < 22; i++) {
                        char ch = (char) ('a' + i);
                        list.addAll(combination(p + ch, up.substring(1)));
                    }
                    break;
                case 9:
                    for (int i = 22; i < 26; i++) {
                        char ch = (char) ('a' + i);
                        list.addAll(combination(p + ch, up.substring(1)));
                    }
                    break;

                default:
                    break;
            }
        }
        return list;
    }
}
